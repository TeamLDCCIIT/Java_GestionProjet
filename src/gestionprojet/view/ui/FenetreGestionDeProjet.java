package gestionprojet.view.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import gestionprojet.controleur.actions.ActionAnnuler;
import gestionprojet.controleur.actions.ActionCreerLot;
import gestionprojet.controleur.actions.ActionCreerProjet;
import gestionprojet.controleur.actions.ActionOuvrir;
import gestionprojet.modele.Projet;

public class FenetreGestionDeProjet extends JFrame {
//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Application Gestion de Projet";
//-------------Attributs-------------
	private static FenetreGestionDeProjet instance;
	private JMenuBar menuBar;
	private Projet currentProject;
	
//-------------Constructeur-------------
	public FenetreGestionDeProjet() {
		this.setTitle(DEFAULT_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.initMenuBar();
		this.pack();
	}
//-------------Getter-------------	
	public static FenetreGestionDeProjet getInstance(){
		if (instance==null){
			instance=new FenetreGestionDeProjet();
		}
		return instance;
	}
	public Projet getProject(){
		return this.currentProject;
	}
	
	
//-------------Setter-------------
public void setProjet(Projet projet){
	this.currentProject=projet;
}
//-------------Methodes-------------
	private void initMenuBar(){
		//creation de la bar de menu
		menuBar = new JMenuBar();
		
		// Cr�ation d'onglet fichier
		JMenu menu = new JMenu("Fichier");
		
		
		//Ajout de l'option nouveau projet au menu fichier
		JMenuItem menuItem = new JMenuItem("Nouveau Projet");
		menuItem.addActionListener(new ActionCreerProjet());
		menu.add(menuItem);
		
		//Ajout d'un separteur
		menu.addSeparator();
		
		//Ajout de l'option option de projet au menu fichier
		menuItem = new JMenuItem("Option de projet");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//Ajout d'un separateur
		menu.addSeparator();
		
		//Ajout des option Ouvrir et Enregistrer (inactive de base) au menu Fichier
		menuItem = new JMenuItem("Ouvrir");
		menuItem.addActionListener(new ActionOuvrir());
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Enregistrer");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//ajout d'un separateur
		menu.addSeparator();
		
		//Ajout de l'option quitter au menu fichier
		menuItem = new JMenuItem(new ActionAnnuler(this));
		menu.add(menuItem);
		
		//Ajout du menu fichier � la bar de menu
		menuBar.add(menu);
		
		//Creation du menu Lot
		menu = new JMenu("Lot");
		
		//Ajout de l'option nouveau Lot au menu Lot
		menuItem = new JMenuItem("Nouveau lot");
		menuItem.addActionListener(new ActionCreerLot());
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//ajout d'un separteur
		menu.addSeparator();
		
		//Ajout des options gris�es de base modifier et supprimer au menu lot
		menuItem = new JMenuItem("Modifier");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Supprimer");
		menuItem.setEnabled(false);
		menu.add(menuItem);
		
		//Ajout du menu Lot � la bar de menu
		menuBar.add(menu);
		
		//Ajout de la bar � la fen�tre
		this.setJMenuBar(menuBar);
	}
	
}
