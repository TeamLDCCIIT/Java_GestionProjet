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
	/**
	 * Constructeur
	 * @param startDate Date
	 * @param endDate Date
	 */
	public Calendrier(Date startDate, Date endDate) {
		if (endDate.after(startDate)) {
			this.startDate = startDate;
			this.endDate = endDate;				
		}else{
			this.startDate = endDate;
			this.endDate = startDate;
		}
	}
	/**
	 * Constructeur
	 * @param startDate String
	 * @param endDate String
	 */
	public Calendrier(String startDate, String endDate) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
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
	/**
	 * Getter
	 * @return lot Collection<Lot>
	 */
	public Collection<Lot> getLot(){
		return this.lot;
	}
	/**
	 * Getter
	 * @return startDate Date
	 */
	public Date getStartDate(){
		return this.startDate;
	}
	/**
	 * Getter
	 * @return endDate Date
	 */
	public Date getEndDate(){
		return this.endDate;
	}
	/**
	 * Getter
	 * @return diff int
	 */
	public int getDurationInDays() {
		Calendar startCalendar = new GregorianCalendar();
		startCalendar.setTime(this.getStartDate());
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(this.getEndDate());
		int diff = Math.round(Math.abs((startCalendar.getTimeInMillis()- endCalendar.getTimeInMillis())/(1000 * 60 * 60 * 24)));
		//long diff = new GregorianCalendar().setTime(this.getEndDate()) - this.getStartDate().getTime()		
		return diff;
	}
	//-----------Mutateurs------------
	/**
	 * Setter
	 * @param startDate Date
	 */
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	/**
	 * Setter
	 * @param endDate Date
	 */
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	
	//Méthodes
	
	//Source : "http://www.baeldung.com/java-between-dates"
	//Renvoie la liste des dates entre le début et la fin du projet 
	//TODO ajouter méthode split pour voir un nom propre par colonne
	/**
	 * Renvoie la liste des dates entre le début et la fin du projet 
	 * @return datesInRange ArrayList<String>
	 */
	public ArrayList<String> getDatesBetween(){
		ArrayList<String> datesInRange = new ArrayList<>();
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(this.getStartDate());
		
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(this.getEndDate());
		
		while(calendar.before(endCalendar)){
			String result = calendar.getTime().toString();
			String[] parts = result.split(" ");
			result = parts[1] +" " + parts[2] + " " + parts[5];
			datesInRange.add(result);
			calendar.add(Calendar.DATE, 1);
		}
		String endResult = endCalendar.getTime().toString();
		String[] parts = endResult.split(" ");
		endResult = parts[1] +" " + parts[2] + " " + parts[5];
		datesInRange.add(endResult);
		
		return datesInRange;
		
		
	}

}
