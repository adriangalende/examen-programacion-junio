package org.mvpigs.commandpattern.interfaces;

import java.util.UUID;

/**
 * La interfaz Pedido implementa los metodos:
 * 
 * peso
 * @param
 * @return      el peso del pedido
 * 
 * destino
 * @param
 * @return 		el destino del pedido
 */

public interface Pedido {
	
	public int peso();
	public String destino();

}
