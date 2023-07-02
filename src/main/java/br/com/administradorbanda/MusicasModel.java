/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author elder
 */
public class MusicasModel extends AbstractTableModel{
    MusicasDAO musicasDao;
    
    String[] colunas = {"Titulo", "Duracao", "Album", "Banda"};
    
    public MusicasModel(MusicasDAO musicasDao) {
        this.musicasDao = musicasDao;
    }

    @Override
    public int getRowCount() {
        return musicasDao.buscarMusicas().size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex) {
           case 0:
               return musicasDao.buscarMusicas().get(rowIndex).getTitulo();
           case 1:
               return musicasDao.buscarMusicas().get(rowIndex).getDuracao();
           case 2:
               return musicasDao.buscarMusicas().get(rowIndex).getAlbum();
           default:
               return musicasDao.buscarMusicas().get(rowIndex).getBanda(); 
       }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}
