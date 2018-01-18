package gestionprojet.view.ui.Fenetre;

import gestionprojet.view.ui.Panneau.PanneauHautLot;

public class FenetreOptionLot extends FenetreOption {

	//-------------Constantes-------------
		public static final String DEFAULT_TITLE = "Creer un Lot";
		/**
		 * Constructeur
		 */
		public FenetreOptionLot(){
			super();
			this.setTitle(FenetreOptionLot.DEFAULT_TITLE);
		}
		
	//-------------Attribut-------------
		private static FenetreOptionLot instance;
		
	//-------------Methode-------------	
		/**
		 * getter
		 * @return instance FenetreOptionLot 
		 */
		public static FenetreOptionLot getInstance() {
			if (instance == null){
				instance = new FenetreOptionLot();
			}
			return instance;
		}
		
		
		@Override
		void initPanneauHaut() {
			this.setPanneauHaut(new PanneauHautLot());
			this.getPanneauHaut().setVisible(true);
			this.getContentPane().add(this.getPanneauHaut());
			
		}

		@Override
		void initPanneauBas() {
			// TODO Auto-generated method stub
			
		}
	
}
