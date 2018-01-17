package gestionprojet.view.ui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class FenetreOptionProjet extends JDialog {
//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Creer un Projet";
	private static FenetreOptionProjet instance;
	public FenetreOptionProjet(){
		super();
		this.setTitle(DEFAULT_TITLE);
		this.setLocation(10,10);
		this.setModalityType(ModalityType.APPLICATION_MODAL);
		this.initComposant();
		this.pack();
	}
	
	public FenetreOptionProjet(JFrame frame){
		super(frame,DEFAULT_TITLE,true);
		this.setLocation(10,10);
		this.pack();
	}
	public static FenetreOptionProjet getInstance(){
		if (instance==null){
			instance=new FenetreOptionProjet();
		}
		return instance;
	}
	private void initComposant(){
		JButton terminer = new JButton("ce bouton ne sert a rien");
		this.add(terminer);
		
	}
}
