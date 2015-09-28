import java.rmi.*;

public class RemCalcServer {
	public static void main(String args[]) {
		// sets the security manager
		System.setSecurityManager(new RMISecurityManager());

		try {
			RemCalcImpl remCalcImpl = new RemCalcImpl();
			Naming.rebind("RemCalcServer", remCalcImpl);
			System.out.println("RemCalcServer is ready and waiting...\n");
		} catch (Exception e) {
			System.out.println("Error on Server");
			e.printStackTrace();
		}
	}
}