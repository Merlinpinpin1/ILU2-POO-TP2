package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;
import villagegaulois.Etal;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	
	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if (!(controlAcheterProduit.ControlAcheteur(nomAcheteur)))
		{
			System.out.println("Je suis désolée "+  nomAcheteur +"  mais il faut être un habitant de notre village pour commercer ici . ");

		}
		else 
		{
			System.out.println("Quel produit voulez-vous acheter ? ");
			String produit = scan.nextLine();
			Gaulois[] listeVendeur = controlAcheterProduit.ControlVendeursProduit(produit);
			if (listeVendeur==null)
			{
				System.out.println(" Désolé, personnene vend ce produit au marché. ");
			}
			else
			{
				System.out.println(" Chez quel commerçant voulez-vous acheter des "  + produit + " ? ");
				for (int i=0 ; i<listeVendeur.length-1;i++)
				
					System.out.println(i+1+" - "+ listeVendeur[i].getNom());
				}
				StringBuilder question = new StringBuilder();
				StringBuilder question2 = new StringBuilder();
				question.append(listeVendeur.length +" - "+ listeVendeur[listeVendeur.length-1].getNom());
				int vendeur = Clavier.entrerEntier(question.toString());
				String choix = listeVendeur[vendeur-1].getNom();
				System.out.println(nomAcheteur + " se déplace jusqu'à l'étal du vendeur " + choix );
				System.out.println(" Bonjour " + nomAcheteur);
				question2.append("Combien de "+ produit +" voulez-vous acheter ?");
				int quantité = Clavier.entrerEntier(question2.toString());
				Etal etalVendeur =controlAcheterProduit.controlEtal(choix);
				if (etalVendeur.getQuantite()==0)
				{
					System.out.println(nomAcheteur + " veut acheter " + quantité +" "+ produit + ", malheureusement il n’y en a plus !");
				}
				else if ((etalVendeur.getQuantite()< quantité))
				{
					System.out.println(nomAcheteur + " veut acheter " + quantité +" "+ produit + ", malheureusement" + choix + " n'en a plus que " + etalVendeur.getQuantite()+". " + nomAcheteur + " achete tout le stock de " + choix +".");
					etalVendeur.acheterProduit(etalVendeur.getQuantite());
				}
				else
				{
					System.out.println(nomAcheteur + " achete " + quantité +" "+ produit + " à "  + choix );
					etalVendeur.acheterProduit(quantité);
				}
			}
		}
	}

