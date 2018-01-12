package gestionprojet.vue.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/*
 * Par Céline MERAND
 * Le 12/01/2018
 * Source : "http://www.javacodex.com/Swing/Swing-calendarendar"
 */

public class FenetreCalendrier extends JFrame {

	// Attributs
	DefaultTableModel model;
	Calendar calendar = new GregorianCalendar();
	JLabel label;

	// Constructeur
	// TODO à modifier
	public FenetreCalendrier() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calendrier Gestion de Projet");
		this.setSize(1500, 800);
		this.setLayout(new BorderLayout());
		this.setVisible(true);

		label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);

		//TODO corriger : non nécessaire
		JButton previous = new JButton("<");
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				calendar.add(Calendar.MONTH, -1);
				updateMonth();
			}
		});

		//TODO corriger : non nécessaire
		JButton next = new JButton(">");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				calendar.add(Calendar.MONTH, +1);
				updateMonth();
			}
		});

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(previous, BorderLayout.WEST);
		panel.add(label, BorderLayout.CENTER);
		panel.add(next, BorderLayout.EAST);

		String[] columns = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		model = new DefaultTableModel(null, columns);
		JTable table = new JTable(model);
		JScrollPane pane = new JScrollPane(table);

		this.add(panel, BorderLayout.NORTH);
		this.add(pane, BorderLayout.CENTER);

		this.updateMonth();
	}

	// Méthodes
	public void updateMonth() {
		calendar.set(Calendar.DAY_OF_MONTH, 1);

		String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
		int year = calendar.get(Calendar.YEAR);
		label.setText(month + " " + year);

		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int weeks = calendar.getActualMaximum(Calendar.WEEK_OF_MONTH);

		model.setRowCount(0);
		model.setRowCount(weeks);

		int i = startDay - 1;
		for (int day = 1; day <= numberOfDays; day++) {
			model.setValueAt(day, i / 7, i % 7);
			i = i + 1;
		}

	}

	public static void main(String[] arguments) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		FenetreCalendrier sc = new FenetreCalendrier();
	}

}
