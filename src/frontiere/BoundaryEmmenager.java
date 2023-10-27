package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println("Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			
			do {
			
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmanagerDruide(nomVisiteur );
					break;
				case 2:
					StringBuilder question11 = new StringBuilder();
					System.out.println("Bienvenue villageois : " + nomVisiteur + "\n");
					question11.append("Quelle est votre force ?\n");
					int force = Clavier.entrerEntier(question11.toString());
					controlEmmenager.ajouterGaulois(nomVisiteur, force);
					break;
				default:
					System.out.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
			
		}
	}
	private void emmanagerDruide(String nomVisiteur )
	{	
		int effetPotionMin = -1;
		int effetPotionMax = -1;
		StringBuilder question1 = new StringBuilder();
		question1.append("Quelle est votre force ?\n");
		StringBuilder question2 = new StringBuilder();
		question2.append("Quelle est la force de la potion la plus faible que vous produisez ? \n");
		StringBuilder question3 = new StringBuilder();
		question3.append("Quelle est la force de la potion la plus forte que vous produisez ? \n");
		System.out.println("Bienvenue druide : " + nomVisiteur + "\n");
		int force = Clavier.entrerEntier(question1.toString());
		do {
		effetPotionMin = Clavier.entrerEntier(question2.toString());
		effetPotionMax = Clavier.entrerEntier(question3.toString());
		}while(effetPotionMax<effetPotionMin);
		System.out.println("Le druide " + nomVisiteur + ": « Bonjour , je suis le druide " + nomVisiteur + "et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + "\n");
		controlEmmenager.ajouterDruide(nomVisiteur, force, effetPotionMin, effetPotionMax);

	}
}


