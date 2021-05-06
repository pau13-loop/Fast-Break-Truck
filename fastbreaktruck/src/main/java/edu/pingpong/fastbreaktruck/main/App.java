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

		// Get cloned object
		// CEREALS
		Cereals clonedEyes = (Cereals) CerealsCache.getCereals("eyeholes");
		Cereals clonedSmiggles = (Cereals) CerealsCache.getCereals("smiggles");
		Cereals clonedPlumbus = (Cereals) CerealsCache.getCereals("plumbus");
		// DRINKS
		Drink clonedTurbulent = (Drink) DrinkCache.getDrinks("turbulent");
		Drink clonedFleeb = (Drink) DrinkCache.getDrinks("fleeb");
		Drink clonedLicor43 = (Drink) DrinkCache.getDrinks("licor");
		// ENVELOPS
		Envelop clonedBox = (Envelop) EnvelopCache.getEnvelop("box");
		Envelop clonedBottle = (Envelop) EnvelopCache.getEnvelop("bottle");

		// MENU 1 - Desayuno Eyeholes

		// Conciliatory message
		System.out.println("\n\nNo abras la caja de Eyeholes!");

		// Print message showing menu
		System.out.println("\nItem: " + clonedEyes.getName() + "\nEnvelop: " + clonedBox.getName() + "\nPrice: "
				+ clonedEyes.getPvp());
		System.out.println("\nItem: " + clonedTurbulent.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: "
				+ clonedTurbulent.getPvp());
		System.out.println("\n\tPrecio pedido: " + (clonedEyes.getPvp() + clonedTurbulent.getPvp()));

		// MENU 2 - Desayuno Smiggles

		// Conciliatory message
		System.out.println("\n\nSmiggles per als nins!");

		// Print message showing menu
		System.out.println("\nItem: " + clonedSmiggles.getName() + "\nEnvelop: " + clonedBox.getName() + "\nPrice: "
				+ clonedSmiggles.getPvp());
		System.out.println("\nItem: " + clonedFleeb.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: "
				+ clonedFleeb.getPvp());
		System.out.println("\n\tPrecio pedido: " + (clonedSmiggles.getPvp() + clonedFleeb.getPvp()));

		// MENU 3 - Desayuno Plumbus

		// Conciliatory message
		System.out.println("\n\nEyeholes con plumbus!");

		// Print message showing menu
		System.out.println("\nItem: " + clonedEyes.getName() + "\nEnvelop: " + clonedBox.getName() + "\nPrice: "
				+ clonedEyes.getPvp());
		System.out.println("\nItem: " + clonedTurbulent.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: "
				+ clonedTurbulent.getPvp());
		System.out.println("\nItem: " + clonedPlumbus.getName() + "\nEnvelop: " + clonedBox.getName() + "\nPrice: "
				+ clonedPlumbus.getPvp());

		// MENU 4 - PING PONG

		// Conciliatory message
		System.out.println("\n\nPing Pong go to have a night out !");

		// Print message showing menu
		System.out.println("\nItem: " + clonedSmiggles.getName() + "\nEnvelop: " + clonedBox.getName() + "\nPrice: "
				+ clonedSmiggles.getPvp());
		System.out.println("\nItem: " + clonedTurbulent.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: "
				+ clonedTurbulent.getPvp());
				System.out.println("\nItem: " + clonedFleeb.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: "
				+ clonedFleeb.getPvp());
				System.out.println("\nItem: " + clonedLicor43.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: "
				+ clonedLicor43.getPvp());
				System.out.println("\nItem: " + clonedLicor43.getName() + "\nEnvelop: " + clonedBottle.getName() + "\nPrice: "
				+ clonedLicor43.getPvp());
		System.out.println(
				"\n\tPrecio pedido: " + (clonedSmiggles.getPvp() + clonedTurbulent.getPvp() + clonedFleeb.getPvp() + (clonedLicor43.getPvp() * 2)));
	}
}
