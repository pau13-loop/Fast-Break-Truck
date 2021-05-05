package edu.pingpong.fastbreaktruck.main;

import edu.pingpong.fastbreaktruck.domain.cache.CerealsCache;
import edu.pingpong.fastbreaktruck.domain.cereals.Cereals;

public class App {

	public static void main(String[] args) {

		// Primera Prueba 
		CerealsCache.loadCache();

		// conciliatory message
		System.out.println("\nNo abras la caja de Eyeholes!");
		// Show menu details
		Cereals clonedCereals = (Cereals) CerealsCache.getCereals("smiggles");
		// Cereals clonedCerealsPvp = (Cereals) CerealsCache.getCerealsPvp("eyeholes");

		System.out.println("\nItem: " + clonedCereals.getType() + "\nPrice: " + clonedCereals.getPvp());
		System.out.println("\n\tPrecio pedido: ");
		
		
		
		/**
		 * Desayuno Eyeholes
		 */

	// 	Desayuno eyeDes = FastBreakTruck.prepararEyeHoles();
	// 	System.out.println("\nNo abras la caja de Eyeholes!");
	// 	eyeDes.mostrarItems();
	// 	System.out.print("Precio pedido: " + eyeDes.getCoste());

	// 	/**
	// 	 * Desayuno Smiggles
	// 	 */
		
	// 	Desayuno smigDes = FastBreakTruck.prepararSmiggles();
	// 	System.out.println("\nSmiggles per als nins!");
	// 	smigDes.mostrarItems();
	// 	System.out.print("Precio pedido: " + smigDes.getCoste());

	// 	/**
	// 	 * Plumbus
	// 	 */

	// 	eyeDes = FastBreakTruck.prepararEyeHoles();
	// 	FastBreakTruck.incluirJuguete(eyeDes);
	// 	System.out.println("\nEyeholes con plumbus!");
	// 	eyeDes.mostrarItems();
	// 	System.out.print("Precio pedido: " + eyeDes.getCoste());
	}
}
