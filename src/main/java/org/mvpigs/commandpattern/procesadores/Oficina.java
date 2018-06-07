package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class Oficina implements Procesador {


    public String printarStatus(Boolean procesa, Pedido pedido) {
        if(procesa){
         return pedido.destino() + " ACEPTADO";
        }
        return pedido.destino() + " RECHAZADO";
    }


    public boolean procesa(TratamientoPedido pedido) {
        if (pedido.tratar()) {
            return true;
        }
        return false;
    }
}
