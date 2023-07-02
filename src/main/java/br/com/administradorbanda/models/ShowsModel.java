/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.models;

import br.com.administradorbanda.dao.ShowsDAO;
import br.com.administradorbanda.entidades.ShowEntidade;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author elder
 */
public class ShowsModel extends AbstractTableModel{
    ShowsDAO showsDao;
    ArrayList<ShowEntidade> shows = new ArrayList();

    String[] colunas = {"Local", "Data", "Banda"};
    
    public ShowsModel(ShowsDAO showsDao) {
        this.showsDao = showsDao;
        this.shows = showsDao.buscarShows();
    }
    
    public void cadastrarShow(String local, String data, String banda) {
        this.showsDao.cadastrarShow(local, data, banda);
        this.shows = showsDao.buscarShows();
        this.fireTableDataChanged();
    }
    
    public void buscarShowsPorLocal(String localShow) {
        this.shows = showsDao.buscarShowsPorLocal(localShow);
        this.fireTableDataChanged();
    }
    
    public void buscarShows() {
        this.shows = showsDao.buscarShows();
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return shows.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex) {
           case 0:
               return shows.get(rowIndex).getLocal();
           case 1:
               return shows.get(rowIndex).getData();
           default:
               return shows.get(rowIndex).getBanda(); 
       }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}