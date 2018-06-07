package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

import java.util.UUID;

public class PedidoNacional implements Pedido {

    private String destino;
    private int peso;
    private String id;

    public PedidoNacional(String destino, int peso){
        this.destino = destino;
        this.peso = peso;
    }


    public int peso() {
        return 0;
    }

    public String destino() {
        return this.destino;
    }

    public String id() {
        return getId();
    }

    public String getId(){
        this.id = UUID.randomUUID().toString();
        return this.id;
    }
}
