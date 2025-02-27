package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		if(!(controlLibererEtal.isVendeur(nomVendeur)))
		{
			System.out.println(" Mais vous n'êtes pas inscrit sur notre marché aujourd'hui ");
		}
		else
		{
			String[] donneesEtal = null;
			donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
			String etalOccupe=donneesEtal[0];
			if (Boolean.parseBoolean(etalOccupe))
			{
				System.out.println(" Vous avez vendu " + donneesEtal[4] + " sur " + donneesEtal[3] + " " + donneesEtal[2]);
				System.out.println(" Au revoir " + nomVendeur + " , passez une bonne journée ");
			}
			
		}
	}

}
