package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoNacional;

import java.util.HashMap;
import java.util.Map;

public class TratamientoPedidoMultiple implements TratamientoPedido {
    private Map<String,Integer> pedidos = new HashMap<String, Integer>();
    private int numBultos=0;
    private int pesoTotal=0;
    private Pedido pedidoNacional;

    public TratamientoPedidoMultiple(Map<String,Integer> pedidos){
        this.pedidos.putAll(pedidos);
    }

    public boolean tratar() {
        for(Map.Entry<String, Integer> pedido : pedidos.entrySet()) {
            pedidoNacional = new PedidoNacional(pedido.getKey(), pedido.getValue());
            if(pedidoNacional.destino().equals("Mordor")){
                return false;
            }
        }
        return true;
    }

    public void calcularTotalBultos(){
        numBultos = pedidos.size();
    }

    public int getNumBultos() {
        return numBultos;
    }

    public Map<String,Integer> getPedidos(){
        return pedidos;
    }

    public void calcularPesoTotal(){
        int peso = 0;
        for(Map.Entry<String, Integer> pedido : pedidos.entrySet()) {
            peso += pedido.getValue();
        }
        setPesoTotal(peso);

        //int pesoA = pedidos.values().stream().reduce(0, (x,y) -> x+y);

    }

    public void setPesoTotal(int pesoTotal){
        this.pesoTotal = pesoTotal;
    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

}
