package gestionprojet.view.ui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class FenetreCreationProjet extends JDialog {
//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Cr�er un Projet";
	
	FenetreCreationProjet(){
		super();
		this.setTitle(DEFAULT_TITLE);
		this.setLocation(10,10);
		this.initComposant();
		this.pack();
	}
	
	FenetreCreationProjet(JFrame frame){
		super(frame,DEFAULT_TITLE,true);
		this.setLocation(10,10);
		this.pack();
	}
	
	private void initComposant(){
		JButton terminer = new JButton("ce bouton ne sert � rien");
		this.add(terminer);
		
	}
}
