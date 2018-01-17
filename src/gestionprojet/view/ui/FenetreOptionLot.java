package gestionprojet.view.ui;

import java.awt.Dialog.ModalityType;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class FenetreOptionLot extends JDialog {

	//-------------Constantes-------------
		public static final String DEFAULT_TITLE = "Creer un Lot";
		private static FenetreOptionLot instance;
		public FenetreOptionLot(){
			super();
			this.setTitle(DEFAULT_TITLE);
			this.setLocation(500,500);
			this.setModalityType(ModalityType.APPLICATION_MODAL);
			this.initComposant();
			this.pack();
		}
		
		public FenetreOptionLot(JFrame frame){
			super(frame,DEFAULT_TITLE,true);
			this.setLocation(10,10);
			this.pack();
		}
		public static FenetreOptionLot getInstance(){
			if (instance==null){
				instance=new FenetreOptionLot();
			}
			return instance;
		}
		private void initComposant(){
			JButton terminer = new JButton("ce bouton ne sert a rien");
			this.add(terminer);
			
		}
	
}
