package personnages;

public class Ronin extends Humain  {
	private int honneur = 1;
	
	
	
	public Ronin(String nom , String boissonFav, int argent) {
		super(nom,boissonFav,argent);
	}
	
	
	public void donner(Commercant beneficiaire) {
		int don =(int) (argent * 0.1);
		parler(beneficiaire.getNom()+ " prend ces " + don + " sous");
		beneficiaire.recevoir(don);
	}
	

}
