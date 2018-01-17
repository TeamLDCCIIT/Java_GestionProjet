package gestionprojet.modele;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 * Source : "https://openclassrooms.com/forum/sujet/quelle-solution-pour-creer-un-genre-d-agenda"
 */

public class Calendrier {

	//Attributs
	//TODO voir frameworks pour ajouter widget calendrier
	private Collection<Lot> lot = new ArrayList<>();
	//private Calendar calendar = new GregorianCalendar();
	private Date startDate;
	private Date endDate;
	

	//Constructeur
	//TODO vérifier si startDate < endDate
	public Calendrier(Date startDate, Date endDate) {
		if (endDate.after(startDate)) {
			this.startDate = startDate;
			this.endDate = endDate;				
		}else{
			this.startDate = endDate;
			this.endDate = startDate;
		}
	}
	
	public Calendrier(String startDate, String endDate) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			
			try{
				Date dd = sdf.parse(startDate);
				Date df = sdf.parse(endDate);
				
				if (df.after(dd)) {
					this.startDate = dd;
					this.endDate = df;
				} else {
					this.startDate = df;
					this.endDate = dd;
				}
			} catch(Exception ex) {
				throw new IllegalArgumentException("Mauvais format !!");
			}
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
	
	public int getDurationInDays() {
		long diff = this.getEndDate().getTime() - this.getStartDate().getTime();
		diff = diff/(1000 * 60 * 60 * 24) +1;
		return (int)diff;
	}
	//-----------Mutateurs------------
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	
	//Méthodes
	
	//Source : "http://www.baeldung.com/java-between-dates"
	//Renvoie la liste des dates entre le début et la fin du projet 
	//TODO ajouter méthode split pour voir un nom propre par colonne
	public ArrayList<String> getDatesBetween(){
		ArrayList<String> datesInRange = new ArrayList<>();
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(this.getStartDate());
		
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(this.getEndDate());
		
		while(calendar.before(endCalendar)){
			
			String result = calendar.getTime().toString();
			datesInRange.add(result);
			calendar.add(Calendar.DATE, 1);
		}
		datesInRange.add(this.getEndDate().toString());
		
		return datesInRange;
		
		
	}

}
