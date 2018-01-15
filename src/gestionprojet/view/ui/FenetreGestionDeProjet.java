package gestionprojet.view.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import gestionprojet.modele.Projet;

public class FenetreGestionDeProjet extends JFrame {
//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Application Gestion de Projet";
//-------------Attributs-------------
	private static FenetreGestionDeProjet instance;
	private JMenuBar menuBar;
	private Projet currentProjet;
//-------------Constructeur-------------
	public FenetreGestionDeProjet() {
		this.setTitle(DEFAULT_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.initMenuBar();
		FenetreCreationProjet test = new FenetreCreationProjet();
		test.setVisible(true);
		this.pack();
	}
//-------------Getter-------------	
	public static FenetreGestionDeProjet getInstance(){
		if (instance==null){
			instance=new FenetreGestionDeProjet();
		}
		return instance;
	}
	
//-------------Setter-------------
public void setProjet(Projet projet){
	this.currentProjet=projet;
}
//-------------Methodes-------------
	private void initMenuBar(){
		//creation de la bar de menu
		menuBar = new JMenuBar();
		
		// Création d'onglet fichier
		JMenu menu = new JMenu("Fichier");
		
		
		//Ajout de l'option nouveau projet au menu fichier
		JMenuItem menuItem = new JMenuItem("Nouveau Projet");
		menu.add(menuItem);
		
		//Ajout d'un separteur
		menu.addSeparator();
		
		//Ajout de l'option option de projet au menu fichier
		menuItem = new JMenuItem("Option de projet");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//Ajout d'un separateur
		menu.addSeparator();
		
		//Ajout des option Ouvrir et Enregistrer au menu Fichier
		menuItem = new JMenuItem("Ouvrir");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Enregistrer");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//ajout d'un separateur
		menu.addSeparator();
		
		//Ajout de l'option quitter au menu fichier
		menuItem = new JMenuItem("Quitter");
		menu.add(menuItem);
		
		//Ajout du menu fichier à la bar de menu
		menuBar.add(menu);
		
		//Creation du menu Lot
		menu = new JMenu("Lot");
		
		//Ajout de l'option nouveau Lot au menu Lot
		menuItem = new JMenuItem("Nouveau lot");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//ajout d'un separteur
		menu.addSeparator();
		
		//Ajout des options grisées de base modifier et supprimer au menu lot
		menuItem = new JMenuItem("modifier");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Supprimer");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//Ajout du menu Lot à la bar de menu
		menuBar.add(menu);
		
		//Ajout de la bar à la fenêtre
		this.add(menuBar);
	}
	
}
