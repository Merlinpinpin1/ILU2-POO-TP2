package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if (!(controlAcheterProduit.ControlAcheteur(nomAcheteur)))
		{
			System.out.println("Je suis désolée Bonemine mais il faut être un habitant de notre village pour commercer ici . ");

		}
		else 
		{
			StringBuilder question1 = new StringBuilder();
			question1.append("Quel produit voulez-vous acheter ? ");
			String produit = scan.nextLine();
			Gaulois[] listeVendeur = controlAcheterProduit.ControlVendeursProduit(produit);
		}
	}
}
