package gestionprojet.controleur.actions;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import gestionprojet.view.ui.Fenetre.FenetreGestionDeProjet;

public class ActionClickDroit implements MouseListener {
	public FenetreGestionDeProjet fenetre;
	/*
	 * @param fenetre
	 */
	public ActionClickDroit(FenetreGestionDeProjet fenetre){
		this.fenetre = fenetre;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == MouseEvent.BUTTON3) {
			//System.out.println("modification et suppression");
			JMenu contextMenu = new JMenu();
			JMenuItem modifie = new JMenuItem("Modifier");
			JMenuItem supprime = new JMenuItem("Supprimer");
			contextMenu.add(modifie);
			contextMenu.add(supprime);
			contextMenu.setMenuLocation(e.getX(),e.getY());
			
			fenetre.add(contextMenu);

			contextMenu.setEnabled(true);
			contextMenu.setVisible(true);
			contextMenu.setPopupMenuVisible(true);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseClicked(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseClicked(e);
	}
	

}
