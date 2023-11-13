package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom , String boissonFav, int argent) {
		super(nom,boissonFav,argent);
	}

	
	
	public int seFaireExtorquer() {
		int vol = argent - argent;
		if(vol == 0){
			parler("J’ai tout perdu! Le monde est trop injuste...");
		}
		return vol;
	}
	
	public void recevoir(int argent) {
		int recu = 0;
		recu = recu +argent;
		parler(  recu + " sous ! Je te remercie généreux donateur!");
		this.argent = argent;
	}
	
	




	
	
	
	
	
	
	
	
	

}
