package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {
    PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido){
        this.pedido = pedido;
    }

    public boolean tratar() {
        if(pedido.instrucciones().equals("no ponerselo en el dedo")){
            return false;
        }
        return true;
    }
}
