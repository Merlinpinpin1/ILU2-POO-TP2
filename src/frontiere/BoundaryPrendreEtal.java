package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (!(controlPrendreEtal.verifierIdentite(nomVendeur)))
		{
			System.out.println(" Je suis désolé  " + nomVendeur + " mais il faut etre un habitant de notre village pour commercer ici ");
		}
		else
		{
			System.out.println(" Bonjour " + nomVendeur + " je vais regarder si je peut vous trouver un étal ");
			if (!(controlPrendreEtal.resteEtals()))
			{
				System.out.println(" Désolé " + nomVendeur + " je n'ai plus d'étal qui ne soit pas déja occupé ");
			}
			else
			{
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println(" C'est parfait , il me reste un étal pour vous ! \n il me faudra quelque rensaignements : ");
		System.out.println(" Quel produit souhaitez vous vendre ? ");
		StringBuilder question1 = new StringBuilder();
		String produit = scan.nextLine();
		question1.append("Combien souhaitez-vous en vendre ?");
		int nbProduit = Clavier.entrerEntier(question1.toString());
		int numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal!=-1)
		{
			System.out.println(" Le vendeur "+ nomVendeur + " s'est installé à l'étal n° " + numeroEtal);
		}
		else
		{
			System.out.println(" Probleme a l'installation du vendeur ");
		}
	}
}