/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.models;

import br.com.administradorbanda.dao.IntegrantesDAO;
import br.com.administradorbanda.entidades.IntegranteEntidade;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author renato
 */
public class IntegrantesModel extends AbstractTableModel{
    IntegrantesDAO integrantesDao;
    ArrayList<IntegranteEntidade> integrantes = new ArrayList();
    
    String[] colunas = {"Nome", "Funcao", "Banda"};
    
    public IntegrantesModel(IntegrantesDAO integrantesDao) {
        this.integrantesDao = integrantesDao;
        this.integrantes = integrantesDao.buscarIntegrantes();
    }
    
    public void cadastrarIntegrante(String nome, String funcao, String banda) {
        integrantesDao.cadastrarIntegrante(nome, funcao, banda);
        this.integrantes = integrantesDao.buscarIntegrantes();
        this.fireTableDataChanged();
    }
    
    public void buscarIntegrantesPorNome(String nomeIntegrante) {
        this.integrantes = integrantesDao.buscarIntegrantesPorNome(nomeIntegrante);
        this.fireTableDataChanged();
    }
    
    public void buscarIntegrantes() {
        this.integrantes = integrantesDao.buscarIntegrantes();
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return integrantes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex) {
           case 0:
               return integrantes.get(rowIndex).getNome();
           case 1:
               return integrantes.get(rowIndex).getFuncao();
           default:
               return integrantes.get(rowIndex).getBanda(); 
       }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}
