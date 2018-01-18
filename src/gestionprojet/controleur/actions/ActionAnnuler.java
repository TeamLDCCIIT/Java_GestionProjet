package gestionprojet.controleur.actions;
import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class ActionAnnuler extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Quitter";
	FenetreGestionDeProjet fenetre;
	/*
	 * @param fenetre
	 */
	public ActionAnnuler(FenetreGestionDeProjet fenetre){
	public static final String NOM_ACTION = "Annuler";
	Window fenetre;
	
	public ActionAnnuler(Window fenetre){
		super(NOM_ACTION);
		this.fenetre=fenetre;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fenetre.dispose();		
	}
}
