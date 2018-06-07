package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    private String destino=null;
    private int peso=0;

    public PedidoInternacional(String destino, int peso){
        this.peso = peso;
        this.destino=destino;
    }


    public int peso() {
        return this.peso;
    }

    public String destino() {
        return this.destino;
    }
}
