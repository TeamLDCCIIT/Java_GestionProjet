package gestionprojet.view.ui.Panneau;

import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class PanneauBasicProjet extends JPanel {
	private JTextField nomProjet;
	UtilDateModel model = new UtilDateModel();
	Properties p;
	JDatePanelImpl datePanel;
	JDatePickerImpl datePicker;
	
	public PanneauBasicProjet(){
		super();
		//this.setLayout(new GroupLayout(this));
		p = new Properties();
		p.put("text.today", "today");
		p.put("text.month", "month");
		p.put("text.year", "year");
		
		datePanel = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		this.add(datePicker);
		this.initComponent();
	}

	private void initComponent() {
		
		
		
	}
}
