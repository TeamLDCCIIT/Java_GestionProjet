package gestionprojet.view.ui.Fenetre;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;

import gestionprojet.controleur.actions.ActionAnnuler;
import gestionprojet.controleur.actions.ActionClickDroit;
import gestionprojet.controleur.actions.ActionCreerLot;
import gestionprojet.controleur.actions.ActionCreerProjet;
import gestionprojet.controleur.actions.ActionOuvrir;
import gestionprojet.modele.Lot;
import gestionprojet.modele.Projet;
import gestionprojet.view.ui.Panneau.PanneauCalendrier;

public class FenetreGestionDeProjet extends JFrame {
//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Application Gestion de Projet";
//-------------Attributs-------------
	private static FenetreGestionDeProjet instance;
	private JMenuBar menuBar;
	private Projet currentProject;
	public PanneauCalendrier panneauCalendrier;
	
//-------------Constructeur-------------
	/**
	 * constructeur
	 */
	public FenetreGestionDeProjet() {
		this.setTitle(DEFAULT_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.afficherCalendrier();
		this.initMenuBar();
		
		this.addMouseListener(new ActionClickDroit(this));
		
		this.pack();
	}
//-------------Getter-------------	
	/**
	 * Getter
	 * @return instance FenetreGestionDeProjet
	 */
	public static FenetreGestionDeProjet getInstance(){
		if (instance==null){
			instance=new FenetreGestionDeProjet();
		}
		return instance;
	}
	/**
	 * Getter
	 * @return currentProject Projet
	 */
	public Projet getProject(){
		return this.currentProject;
	}
	
	
//-------------Setter-------------
	/**
	 * Setter
	 * @param projet Projet
	 */
	public void setProjet(Projet projet){
		this.currentProject=projet;
	}
//-------------Methodes-------------
	/**
	 * initialisation de la barre de menu
	 */
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
		
		//Ajout des options Ouvrir et Enregistrer (inactive de base) au menu Fichier
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
		menuItem.setText("Quitter");
		menu.add(menuItem);
		
		//Ajout du menu fichier � la bar de menu
		menuBar.add(menu);
		
		//Creation du menu Lot
		menu = new JMenu("Lot");
		
		//Ajout de l'option nouveau Lot au menu Lot
		menuItem = new JMenuItem("Nouveau lot");
		menuItem.addActionListener(new ActionCreerLot());
		//menuItem.setEnabled(false);
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
		
		//Ajout du menu Lot � la barre de menu
		menuBar.add(menu);
		
		//Ajout de la barre � la fen�tre
		this.setJMenuBar(menuBar);
		
	}
	
	public void afficherCalendrier(){
		if (this.getProject() != null){
			this.panneauCalendrier= new PanneauCalendrier(this.getProject());
			this.getContentPane().add(this.panneauCalendrier);
		}
	}
	
	public void refreshTableau() {
		DefaultTableModel mod = this.panneauCalendrier.model;
		
		//Retrait des rows
		for(int i = 0; i < mod.getRowCount(); i++) {
			mod.removeRow(i);
		}
		
		//Ajout des lignes
		for(Lot l : this.getProject().getLotList()) {
			String[] row = new String[mod.getColumnCount()];
			row[0] = l.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-yyyy");
			Date ddebut = l.getStartDate();
			Date dfin 	= l.getEndDate();
			
			for(int i = 1; i < mod.getColumnCount(); i++) {
				try {
					String[] ddyyl = mod.getColumnName(i).split(" ");
					String ddyy = ddyyl[1] + "-" + ddyyl[2];
					
					
					Date date = sdf.parse(ddyy);
					if(date.getTime() >= ddebut.getTime() - (86400000) && date.getTime() <= dfin.getTime()) {
						row[i] = "X";
					} else {
						row[i] = " ";
					}
				} catch(Exception ex) {
					ex.printStackTrace();
					row[i] = " _ ";
				}
				
			}
			
			mod.addRow(row);
		}
		
		this.panneauCalendrier.model.fireTableDataChanged();
		this.pack();
		this.validate();
	}
	
	
}

