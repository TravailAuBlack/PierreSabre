package histoire;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	
	
	
	public Humain(String nom , String boissonFav , int argent)
	{
		this.nom = nom;
		this.boissonFav = boissonFav;
	}
	
	public void parler(String texte) 
	{
		System.out.println(" " + texte + " ");
	}
	
	public void direBonjour(String nom , String boissonFav ) 
	{
		parler("Bonjour ! Je m’appelle" + nom + "et  j’aime boire du" + boissonFav);
	}
	
	public void boire(String boissonFav)
	{
		parler("Mmmm, un bon verre de" + boissonFav + "! GLOUPS !");
	}
	
	
	public void perdreArgent(int perte)
	{
		argent = argent - perte ; 
	}
	
	public void gagnerArgent(int gain)
	{
		argent = argent + gain; 
	}
	
	
	public void acheter(String bien , int prix)
	{
		if (argent > prix)
		{
			parler("J'ai" + argent + " sous en poche. Je vais pouvoir m'offrir" + bien +  "à" + prix +  "sous .");
			perdreArgent(prix);
		}
		else 
		{
			parler(" Je n'ai plus que" + argent + " sous en poche. Je ne peux même pas m'offrir un" + bien +  " à " + prix +" sous");
		}
	}

}
