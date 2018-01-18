package gestionprojet.vue.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenduCellule extends DefaultTableCellRenderer { 
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
		if (row == 1 && column == 1) cell.setBackground(Color.BLUE); 
		else cell.setBackground(Color.WHITE); 
		return cell; 
		} 
	}