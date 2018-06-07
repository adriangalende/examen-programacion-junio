package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido {
    private String destino=null;
    private int peso=0;
    private String id;

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

    public String getId(){
        this.id = UUID.randomUUID().toString();
        return this.id;
    }

}
