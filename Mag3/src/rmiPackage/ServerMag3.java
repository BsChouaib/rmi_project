package rmiPackage;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMag3 {

	public static void main(String[] args)throws Exception {
		Registry registry = LocateRegistry.createRegistry(1097);
		registry.bind("mag3", new StoreManager());
		System.out.println("server magasin 3 is runing.....");

	}

}
