package gestionprojet.modele;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 * Source : "https://openclassrooms.com/forum/sujet/quelle-solution-pour-creer-un-genre-d-agenda"
 */

public class Calendrier {

	//Attributs
	//TODO voir frameworks pour ajouter widget calendrier
	private Collection<Lot> lot = new ArrayList<>();
	private Date startDate;
	private Date endDate;
	
	//Constructeur
	public Calendrier(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	//-----------Accesseurs------------
	//TODO à supprimer ?
	public Collection<Lot> getLot(){
		return this.lot;
	}
	
	public Date getStartDate(){
		return this.startDate;
	}
	
	public Date getEndDate(){
		return this.endDate;
	}
	
	//-----------Mutateurs------------
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	
	//Méthodes
}
