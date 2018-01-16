package gestionprojet.controleur.actions;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import gestionprojet.view.ui.FenetreOptionProjet;

public class ActionAnnulerProjet extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Annuler Projet";
	
	public ActionAnnulerProjet(){
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		FenetreOptionProjet fenetre = FenetreOptionProjet.getInstance();
		//permet d'effacer
		//fenetre.getPanneauDessin().getVueFormes().clear();
		fenetre.repaint();
	}

}
