/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wesllen
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null ;
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList dados) {
        this.linhas = dados;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] nomes) {
        this.colunas = nomes;
    }
    
    public int getColumnCount(){
        return colunas.length;
    }
    
    public int getRowCount(){
    return linhas.size();
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}
