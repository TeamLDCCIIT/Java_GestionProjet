package gestionprojet.view.ui.Fenetre;

public class FenetreOptionLot extends FenetreOption {

	//-------------Constantes-------------
		public static final String DEFAULT_TITLE = "Creer un Lot";
		
		public FenetreOptionLot(){
			super();
			this.setTitle(FenetreOptionLot.DEFAULT_TITLE);
		}
		
	//-------------Attribut-------------
		private static FenetreOptionLot instance;
		
	//-------------Methode-------------	
		public static FenetreOptionLot getInstance() {
			if (instance == null){
				instance = new FenetreOptionLot();
			}
			return instance;
		}
		
		
		@Override
		void initPanneauHaut() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void initPanneauBas() {
			// TODO Auto-generated method stub
			
		}
	
}
