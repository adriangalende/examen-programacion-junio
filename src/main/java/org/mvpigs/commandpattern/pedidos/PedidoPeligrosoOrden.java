package org.mvpigs.commandpattern.pedidos;


import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

import java.util.UUID;


public class PedidoPeligrosoOrden implements PedidoPeligroso {
    private String destino;
    private String instrucciones;
    private String id;

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

    public String getId(){
        this.id = UUID.randomUUID().toString();
        return this.id;
    }

}
