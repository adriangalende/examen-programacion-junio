package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoInternacional implements TratamientoPedido {
    Pedido pedido;
    public TratamientoPedidoInternacional (Pedido pedido){
        this.pedido = pedido;
    }

    public boolean tratar() {
        if(pedido.destino().equals("Mordor")){
            return false;
        }
        return true;
    }
}
