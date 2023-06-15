/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzaria;

/**
 *
 * @author Eduardo
 */
public class Pedido {

    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tapete getTapete() {
        return tapete;
    }

    public void setTapete(Tapete tapete) {
        this.tapete = tapete;
    }
    private Tapete tapete;
}