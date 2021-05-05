package edu.pingpong.fastbreaktruck.main;

import edu.pingpong.fastbreaktruck.domain.cache.CerealsCache;
import edu.pingpong.fastbreaktruck.domain.cache.DrinkCache;
import edu.pingpong.fastbreaktruck.domain.cache.EnvelopCache;
import edu.pingpong.fastbreaktruck.domain.cereals.Cereals;
import edu.pingpong.fastbreaktruck.domain.drink.Drink;
import edu.pingpong.fastbreaktruck.domain.envelop.Envelop;

public class App {

	public static void main(String[] args) {

		// Load prototipes
		CerealsCache.loadCache();
		DrinkCache.loadCache();
		EnvelopCache.loadCache();

		// MENU 1 - Desayuno Eyeholes

		// Conciliatory message
		System.out.println("\nNo abras la caja de Eyeholes!");
		
		// Get cloned object
		// CEREALS
		Cereals clonedEyes = (Cereals) CerealsCache.getCereals("eyeholes");
		Cereals clonedSmiggles = (Cereals) CerealsCache.getCereals("smiggles");
		// DRINKS
		Drink clonedTurbulent = (Drink) DrinkCache.getDrinks("turbulent");
		Drink clonedFleeb = (Drink) DrinkCache.getDrinks("fleeb");
		// ENVELOPS
		Envelop clonedBox = (Envelop) EnvelopCache.getEnvelop("box");
		Envelop clonedBottle = (Envelop) EnvelopCache.getEnvelop("bottle");

		// Print message showing menu
		System.out.println("\nItem: " + clonedEyes.getName() + "\nEnvelop: " + clonedBox.getName() + "\nPrice: " + clonedEyes.getPvp());
		System.out.println("\nItem: " + clonedTurbulent.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: " + clonedTurbulent.getPvp());
		System.out.println("\n\tPrecio pedido: " + (clonedEyes.getPvp() + clonedTurbulent.getPvp()));


		// MENU 2 - Desayuno Smiggles

		// Conciliatory message
		System.out.println("\nSmiggles per als nins!");

		// Print message showing menu
		System.out.println("\nItem: " + clonedSmiggles.getName() + "\nEnvelop: " + clonedBox.getName() + "\nPrice: " + clonedSmiggles.getPvp());
		System.out.println("\nItem: " + clonedFleeb.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: " + clonedFleeb.getPvp());
		System.out.println("\n\tPrecio pedido: " + (clonedSmiggles.getPvp() + clonedFleeb.getPvp()));
		
		
		
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
