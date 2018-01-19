package gestionprojet.view.ui.Panneau;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import gestionprojet.controleur.actions.ActionAjouterPersonne;
import gestionprojet.modele.Personne;

public class PanneauBasProjet extends JPanel {
	 
	private JTextField nom;
	private JTextField prenom;
	private JTextField fonction;
	private  ArrayList<Personne> personne = new ArrayList<Personne>();
	private JTextArea panneau;
	
	/**
	 * Constructeur
	 */
	public PanneauBasProjet(){
		super();
		this.afficheListe();
		this.initBoutonAjouter();
	}
	/**
	 * setter
	 * @param personne
	 */
	public void setPersonne(ArrayList<Personne> personne) {
		this.personne = personne;
	}
	
	/**
	 * getter
	 * @return {@link Personne}
	 */
	public ArrayList<Personne> getPersonne() {
		return personne;
	}
	
	/**
	 * getter
	 * @return nom
	 */
	public JTextField getNom() {
		return nom;
	}
	
	/**
	 * getter
	 * @return
	 */
	public JTextField getPrenom() {
		return prenom;
	}
	
	/**
	 * getter
	 * 
	 */
	public JTextField getFonction() {
		return fonction;
	}

	/**
	 * Affiche la liste
	 */
	private void afficheListe() {
		// TODO Auto-generated method stub
		JPanel panneauList = new JPanel();
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		panneau = new JTextArea();
		panneauList.add(panneau);
		this.add(panneauList);
		
		
	}

	/**
	 * met a jour la liste de personne dans la fenêtre creation projet
	 * @param personne
	 * @return
	 */
	public String toString(ArrayList<Personne> personne){
		String string = "";
		for(int i =0; i<personne.size(); i++){
			string += personne.get(i).getLastName()+" "+personne.get(i).getFirstName()+
					" - Fonction : "+personne.get(i).getFunction()+"\n";
			
		}
		this.panneau.setText(string);
	return string;
	}
	
	/**
	 * initialisation du panneaux contenant les boutons qui permettent d'ajouter
	 * une personne
	 */
	private void initBoutonAjouter() {
		JPanel panneauChamp = new JPanel();
		panneauChamp.setLayout(new BoxLayout(panneauChamp, BoxLayout.LINE_AXIS));
		panneauChamp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		JScrollPane pane = new JScrollPane(panneauChamp);
		this.add(pane, BorderLayout.EAST);
		pane.setVisible(true);
		panneauChamp.add(Box.createHorizontalGlue());
		panneauChamp.add(new JLabel("Nom : "));
		panneauChamp.add(Box.createRigidArea(new Dimension(5, 0)));
		this.nom = new JTextField(5);
		panneauChamp.add(nom);
		
		panneauChamp.add(Box.createRigidArea(new Dimension(10, 0)));
		panneauChamp.add(new JLabel("Prenom : "));
		panneauChamp.add(Box.createRigidArea(new Dimension(5, 0)));
		this.prenom = new JTextField(5);
		panneauChamp.add(prenom);
		
		panneauChamp.add(Box.createRigidArea(new Dimension(10, 0)));
		panneauChamp.add(new JLabel("Fonction : "));
		panneauChamp.add(Box.createRigidArea(new Dimension(5, 0)));
		this.fonction = new JTextField(10);
		panneauChamp.add(fonction);
		
		panneauChamp.add(Box.createRigidArea(new Dimension(20, 0)));
		panneauChamp.add(new JButton(new ActionAjouterPersonne()));
		
		this.add(panneauChamp);
		
		
	}
	
	
}
