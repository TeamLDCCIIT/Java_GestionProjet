package gestionprojet.controleur.actions;
import gestionprojet.view.ui.*;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class ActionCreerProjet extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Nouveau Projet";
	
	public ActionCreerProjet(){
		super(NOM_ACTION);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		FenetreOptionProjet fenetre = new FenetreOptionProjet();
		fenetre.setVisible(true);
		}
	}
	



