package rmiPackage;

import java.rmi.Naming;
import java.util.Scanner;

public class Clientmain {

	public static void getPrice(int numIngrediant) throws Exception {
		Store stubMag1 = (Store) Naming.lookup("rmi://localhost:1099/mag1");
		Store stubMag2 = (Store) Naming.lookup("rmi://localhost:1098/mag2");
		Store stubMag3 = (Store) Naming.lookup("rmi://localhost:1097/mag3");
		float f1 = 0;
		float f2 = 0;
		float f3 = 0;
		switch (numIngrediant) {
		case 1:
			f1 = stubMag1.getPrice("cornichons");
			f2 = stubMag2.getPrice("cornichons");
			f3 = stubMag3.getPrice("cornichons");
			if ((f1 < f2) && (f1 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("cornichons");
				System.out.print(" » est de « ");
				System.err.print(f1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((f2 < f1) && (f2 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("cornichons");
				System.out.print(" » est de « ");
				System.err.print(f2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("cornichons");
				System.out.print(" » est de « ");
				System.err.print(f3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}
		case 2:
			f1 = stubMag1.getPrice("safran");
			f2 = stubMag2.getPrice("safran");
			f3 = stubMag3.getPrice("safran");
			if ((f1 < f2) && (f1 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("safran");
				System.out.print(" » est de « ");
				System.err.print(f1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((f2 < f1) && (f2 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("safran");
				System.out.print(" » est de « ");
				System.err.print(f2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("safran");
				System.out.print(" » est de « ");
				System.err.print(f3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}
		case 3:
			f1 = stubMag1.getPrice("sel");
			f2 = stubMag2.getPrice("sel");
			f3 = stubMag3.getPrice("sel");
			if ((f1 < f2) && (f1 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("sel");
				System.out.print(" » est de « ");
				System.err.print(f1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((f2 < f1) && (f2 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("sel");
				System.out.print(" » est de « ");
				System.err.print(f2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("sel");
				System.out.print(" » est de « ");
				System.err.print(f3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}
		case 4:
			f1 = stubMag1.getPrice("poivre");
			f2 = stubMag2.getPrice("poivre");
			f3 = stubMag3.getPrice("poivre");
			if ((f1 < f2) && (f1 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("poivre");
				System.out.print(" » est de « ");
				System.err.print(f1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((f2 < f1) && (f2 < f3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("poivre");
				System.out.print(" » est de « ");
				System.err.print(f2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("poivre");
				System.out.print(" » est de « ");
				System.err.print(f3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

// Menu de sélection des ingrédients
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sélectionnez le numéro de l'ingrédient :");
		System.out.println("[1] cornichons");
		System.out.println("[2] safran");
		System.out.println("[3] sel");
		System.out.println("[4] poivre");
		int choice = scanner.nextInt();
		
			switch (choice) {
			case 1:
				getPrice(1);
				break;
			case 2:
				getPrice(2);
				break;
			case 3:
				getPrice(3);
				break;
			case 4:
				getPrice(4);
				break;
			default:
				System.out.println("Choix invalide !");
				scanner.close();
				return;
			}
		}


}
