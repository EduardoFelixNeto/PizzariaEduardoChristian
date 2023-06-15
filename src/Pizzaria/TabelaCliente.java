/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzaria;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eduardo
 */
public class TabelaCliente extends AbstractTableModel {
    
    private String[] colunas = new String[]{"Nome", "Sobrenome", "Telefone", "Email"};

    private List<Cliente> lista = new ArrayList();    


    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        //if(column==0)
        //    return false;
        //return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Cliente costumer = lista.get(rowIndex);
        
        switch (columnIndex) {
            
            case 0: return costumer.getNome();
            case 1: return costumer.getSobrenome();
            case 2: return costumer.getTelefone();
            case 3: return costumer.getEmail();
            default : return null;
        }
    }

    public void adicionaCliente(Cliente costumer) {
        this.lista.add(costumer);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
        System.out.println(this.lista.size());
    }
    
    public boolean removeCliente(Cliente costumer) {
        int linha = this.lista.indexOf(costumer);
        boolean result = this.lista.remove(costumer);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void atualizarTabela(List<Cliente> lista){
        this.lista = new ArrayList();
        this.lista.addAll(lista);
        this.fireTableDataChanged();
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Cliente getCliente(int linha){
        return lista.get(linha);
    }    
}