package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	
	
	
	
	public Yakuza(String nom , String boissonFav, int argent,String clan) {
		super(nom,boissonFav,argent);
		this.clan = clan;
	}
	
	
	
	public void extorquer(Commercant victime){
		int vol = 0;
		int totArgent = 0;
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		vol = vol + victime.argent;
		totArgent  = argent + vol;
		parler("J’ai piqué les "+ vol + " sous de " + victime.getNom() + " , ce qui me fait " + totArgent + " sous dans ma poche. Hi ! Hi !");
		reputation = reputation +1;
		 
	}
	
	
	

	
	

}
