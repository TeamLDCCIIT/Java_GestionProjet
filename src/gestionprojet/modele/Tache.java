package gestionprojet.modele;

public class Tache {
	//Attributs
	private Personne responsible;
			
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
