/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HugoLuna
 */
public class ModelTable extends AbstractTableModel {

    
    
    
    String[] columnNames = {
            "Id", "Nombre", "Estudiantes", "Acciones"
        };

    
    
  
    
    
    
    Object[][] data = {
       {"Saira", "B.Tech",
        "VTU", new Integer(2015)},
       {"Smaira", "B.Sc",
            "CBSE", new Integer(2007)},
       {"John", "M.tech",
                "IIT", new Integer(2009)},
       {"Jia", "M.Sc",
                    "Thapar", new Integer(2011)},
       {"Kerry", "B.Com",
                        "DU", new Integer(2014)}
       
       };

    
    
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 1) {
            return false;
        } else {
            return true;
        }
    }

    public void setValueAt(Object value, int row, int col) {

        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
