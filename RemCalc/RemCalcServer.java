import java.rmi.*;

public class RemCalcServer {
	public static void main(String args[]) {
		// sets the security manager
		//System.setSecurityManager(new RMISecurityManager());

		try {
			RemCalc remCalc = new RemCalcImpl();
			Naming.rebind("rmi://localhost:1099/RemCalcService", remCalc);
			System.out.println("RemCalcServer is ready and waiting...\n");
		} catch (Exception e) {
			System.out.println("Error on Server");
			e.printStackTrace();
		}
	}
}