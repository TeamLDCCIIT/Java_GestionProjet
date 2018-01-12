package gestionprojet.modele;

/*
 * Par Céline MERAND
 * Le 12/01/2018
 */

public class Tache {
	//Attributs
	private 
	Personne responsible;
			
	//Constructeur
	public Tache(Personne responsible) {	
		this.responsible = responsible;
	}
			
	//Accesseurs & Mutateurs
	public Personne getResponsible(){
		return this.responsible;
	}
	
	public void setResponsible(Personne responsible){
		this.responsible = responsible;
	}
	
	//Méthodes
	

}
