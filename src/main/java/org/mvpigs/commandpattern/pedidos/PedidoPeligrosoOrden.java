package org.mvpigs.commandpattern.pedidos;


import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {
    private String destino;
    private String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones){
        this.destino = destino;
        this.instrucciones = instrucciones;
    }

    public String instrucciones() {
        return this.instrucciones;
    }

    public int peso() {
        return 0;
    }

    public String destino() {
        return this.destino;
    }
}
