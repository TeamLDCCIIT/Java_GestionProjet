package gestionprojet.view.ui.Panneau;

import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class PanneauHautLot extends JPanel {
	
	JTextField nom;
	JDatePickerImpl dateDebut;
	JDatePickerImpl dateFin;
	JTextArea description;

	public PanneauHautLot() {
		super();
		
		this.setLayout(new GroupLayout(this));
		((GroupLayout) this.getLayout()).setAutoCreateGaps(true);
		((GroupLayout) this.getLayout()).setAutoCreateContainerGaps(true);

		this.initComponent();
	}

	public JTextField getNom() {
		return nom;
	}

	public void setNom(JTextField nom) {
		this.nom = nom;
	}

	public JDatePickerImpl getDateFin() {
		return dateFin;
	}

	public void setDateFin(JDatePickerImpl dateFin) {
		this.dateFin = dateFin;
	}

	public JDatePickerImpl getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(JDatePickerImpl dateDebut) {
		this.dateDebut = dateDebut;
	}

	public JTextArea getDescription() {
		return description;
	}

	public void setDescription(JTextArea description) {
		this.description = description;
	}

	private void initComponent() {
		JLabel nom = new JLabel("Nom : ");
		JLabel dateDebut = new JLabel("Date de debut : ");
		JLabel duree = new JLabel("Duree : ");
		JLabel description = new JLabel("Description : ");
		
		this.setNom(new JTextField(10));
		this.setDateDebut(this.generateDatePicker());
		this.setDateFin(this.generateDatePicker());
		
		this.setDescription(new JTextArea(5, 20));
		this.getDescription().setLineWrap(true);
		
		
		((GroupLayout) this.getLayout()).setHorizontalGroup(
				   ((GroupLayout) this.getLayout()).createSequentialGroup()
				   .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
				      .addComponent(nom)
				      .addComponent(dateDebut)
				      .addComponent(duree))
			      .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
		    		  .addComponent(this.getNom())
		    		  .addComponent(this.getDateDebut())
			          .addComponent(this.getDateFin()))
			      .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
			          .addComponent(description)
			          .addComponent(this.getDescription()))
				);
		
		
		((GroupLayout) this.getLayout()).setVerticalGroup(
				   ((GroupLayout) this.getLayout()).createSequentialGroup()
				   .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
				      .addComponent(nom)
				      .addComponent(this.getNom())
				      .addComponent(description))
				   .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
			           .addComponent(dateDebut)
			           .addComponent(this.getDateDebut())
			           .addComponent(this.getDescription()))
			       .addGroup(((GroupLayout) this.getLayout()).createParallelGroup()
			           .addComponent(duree)
			           .addComponent(this.getDateFin())) 
				    );
		
		
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
}
