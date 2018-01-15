package gestionprojet.view.ui;

import java.awt.Dialog.ModalityType;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class FenetreOption extends JDialog {

//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Option";
	public static final ModalityType TYPE_MODAL = ModalityType.APPLICATION_MODAL;
	
	public boolean developpe = false;
			
			
	public FenetreOption(){
		super();
		this.setTitle(DEFAULT_TITLE);
		this.setLocationRelativeTo(null);
		this.setModalityType(TYPE_MODAL);
		this.initComposant();
		this.pack();
	}
	
	public FenetreOption(JFrame frame){
		super(frame,DEFAULT_TITLE,true);
		this.setLocationRelativeTo(frame);
		this.setModalityType(TYPE_MODAL);
		this.initComposant();
		this.pack();
	}
	
	private void initComposant() {
		//A faire
	}
	
	public void AfficherMasquer(){
		//A faire
	}
}
