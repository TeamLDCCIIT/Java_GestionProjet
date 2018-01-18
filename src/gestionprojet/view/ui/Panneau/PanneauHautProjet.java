package gestionprojet.view.ui.Panneau;

import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class PanneauHautProjet extends JPanel {
	
	private JTextField nomProjet;
	private JDatePickerImpl datePickerDebut;
	private JDatePickerImpl datePickerFin;

	public PanneauHautProjet(){
		super();
		
		this.setLayout(new GroupLayout(this));
		((GroupLayout) this.getLayout()).setAutoCreateGaps(true);
		((GroupLayout) this.getLayout()).setAutoCreateContainerGaps(true);

		this.initComponent();
	}



	public JTextField getNomProjet() {
		return nomProjet;
	}


	public void setNomProjet(JTextField nomProjet) {
		this.nomProjet = nomProjet;
	}


	public JDatePickerImpl getDatePickerDebut() {
		return datePickerDebut;
	}


	public void setDatePickerDebut(JDatePickerImpl datePickerDebut) {
		this.datePickerDebut = datePickerDebut;
	}


	public JDatePickerImpl getDatePickerFin() {
		return datePickerFin;
	}


	public void setDatePickerFin(JDatePickerImpl datePickerFin) {
		this.datePickerFin = datePickerFin;
	}


	
	
	private JDatePickerImpl generateDatePicker(){

		Properties p = new Properties();
		p.put("text.today", "today");
		p.put("text.month", "month");
		p.put("text.year", "year");
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		
		return datePicker;
		
	}
	
	
	private void initComponent() {
		
		JLabel nomProjetText = new JLabel("Nom du projet : ");
		JLabel dateDebutText = new JLabel("Date de debut : ");
		JLabel dateFinText = new JLabel("Date de fin : ");
		
		this.setNomProjet(new JTextField(10));
		this.setDatePickerDebut(this.generateDatePicker());
		this.setDatePickerFin(this.generateDatePicker());

		((GroupLayout) this.getLayout()).setHorizontalGroup(
				   ((GroupLayout) this.getLayout()).createSequentialGroup()
				   .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
				      .addComponent(nomProjetText)
				      .addComponent(dateDebutText)
				      .addComponent(dateFinText))
				      .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
				           .addComponent(this.getNomProjet())
				           .addComponent(this.getDatePickerDebut())
				           .addComponent(this.getDatePickerFin()))
				      
				);
		((GroupLayout) this.getLayout()).setVerticalGroup(
				   ((GroupLayout) this.getLayout()).createSequentialGroup()
				   .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
				      .addComponent(nomProjetText)
				      .addComponent(this.getNomProjet()))
				      .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
				           .addComponent(dateDebutText)
				           .addComponent(this.getDatePickerDebut()))
				       .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
					           .addComponent(dateFinText)
					           .addComponent(this.getDatePickerFin())) 
				    );
		
		
	}
}
