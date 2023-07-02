/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.models;

import br.com.administradorbanda.dao.IntegrantesDAO;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author elder
 */
public class IntegrantesModel extends AbstractTableModel{
    IntegrantesDAO integrantesDao;
    
    String[] colunas = {"Nome", "Funcao"};
    
    public IntegrantesModel(IntegrantesDAO integrantesDao) {
        this.integrantesDao = integrantesDao;
    }

    @Override
    public int getRowCount() {
        return integrantesDao.buscarIntegrantes().size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex) {
           case 0:
               return integrantesDao.buscarIntegrantes().get(rowIndex).getNome();
           default:
               return integrantesDao.buscarIntegrantes().get(rowIndex).getFuncao(); 
       }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}
