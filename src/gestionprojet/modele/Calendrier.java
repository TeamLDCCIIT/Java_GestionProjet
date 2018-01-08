package gestionprojet.modele;

import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Calendrier {

	//Attributs
	private Date startDate;
	private Date endDate;
	
	//Constructeur
	public Calendrier(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	//Accesseurs & Mutateurs
	public Date getStartDate(){
		return this.startDate;
	}
	
	public Date getEndDate(){
		return this.endDate;
	}
	//Méthodes
}
