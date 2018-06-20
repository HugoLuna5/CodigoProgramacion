/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.model;

import codigo.programacion.conexionDB.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HugoLuna
 */
public class ModelTable extends AbstractTableModel {

    
    char mander;
    String[] columnNames = {
        "Id", "Nombre", "Estudiantes", "Acciones"
    };

    public ModelTable() {
        this.initObject();
    }

    public void initObject() {

        try {

            Connection codigoPro = DB.getConection();
            Statement state = codigoPro.createStatement();

            @SuppressWarnings("deprecation")
            String query = "SELECT * FROM curso";

            ResultSet rs = state.executeQuery(query);

            boolean masuk = false;
            masuk = rs.next();
         

        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

    }

    Object[][] data = {
        {new  Integer(1), "Android",
            new Integer(0),"Acciones"},
        {new Integer(2),"Web", new Integer(0),"Acciones"}

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
