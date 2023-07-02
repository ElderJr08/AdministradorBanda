/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.models;

import br.com.administradorbanda.dao.ShowsDAO;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author elder
 */
public class ShowsModel extends AbstractTableModel{
    ShowsDAO showsDao;
    
    String[] colunas = {"Local", "Data", "Banda"};
    
    public ShowsModel(ShowsDAO showsDao) {
        this.showsDao = showsDao;
    }

    @Override
    public int getRowCount() {
        return showsDao.buscarShows().size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex) {
           case 0:
               return showsDao.buscarShows().get(rowIndex).getLocal();
           case 1:
               return showsDao.buscarShows().get(rowIndex).getData();
           default:
               return showsDao.buscarShows().get(rowIndex).getBanda(); 
       }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}