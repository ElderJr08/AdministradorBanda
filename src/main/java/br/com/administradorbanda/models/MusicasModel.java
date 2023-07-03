/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.models;

import br.com.administradorbanda.dao.MusicasDAO;
import br.com.administradorbanda.entidades.MusicaEntidade;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author renato
 */
public class MusicasModel extends AbstractTableModel{
    MusicasDAO musicasDao;
    ArrayList<MusicaEntidade> musicas = new ArrayList();
    
    String[] colunas = {"Titulo", "Duracao", "Album", "Banda"};
    
    public MusicasModel(MusicasDAO musicasDao) {
        this.musicasDao = musicasDao;
        this.musicas = musicasDao.buscarMusicas();
    }
    
    public void cadastrarMusica(String titulo, int duracao, String album, String banda) {
        this.musicasDao.cadastrarMusica(titulo, duracao, album, banda);
        this.musicas = musicasDao.buscarMusicas();
        this.fireTableDataChanged();
    }
    
    public void buscarMusicaPorTitulo (String tituloMusica) {
        this.musicas = musicasDao.buscarMusicaPorTitulo(tituloMusica);
        this.fireTableDataChanged();
    }
    
    public void buscarMusicas () {
        this.musicas = musicasDao.buscarMusicas();
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return musicas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex) {
           case 0:
               return musicas.get(rowIndex).getTitulo();
           case 1:
               return musicas.get(rowIndex).getDuracao();
           case 2:
               return musicas.get(rowIndex).getAlbum();
           default:
               return musicas.get(rowIndex).getBanda(); 
       }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}
