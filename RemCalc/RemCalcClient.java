import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class RemCalcClient {
	public static void main(String args[]) {
		try {
			RemCalc remCalc = (RemCalc)Naming.lookup("rmi://localhost:1099/RemCalcService");

			System.out.println("Welcome to RemCalc service!!");
			System.out.println("Please, insert a mathematical expression which you want to solve or q to exit: ");
			String exp;
			Scanner sc = new Scanner(System.in);

			while(!((exp = sc.nextLine()).equals("q"))) {
				System.out.println("Result: " + remCalc.calculate(exp) + "\n");
				System.out.println("Please, insert a mathematical expression which you want to solve or q to exit: ");
			}

			System.out.println("\n\nThank you for using.");
			sc.nextLine();
		} catch( MalformedURLException e ) {  
            System.out.println();  
            System.out.println( "MalformedURLException: " + e.toString() );  
        }  
        catch( RemoteException e ) {  
            System.out.println();  
            System.out.println( "RemoteException: " + e.toString() );  
        }  
        catch( NotBoundException e ) {  
            System.out.println();  
            System.out.println( "NotBoundException: " + e.toString() );  
        }  
        catch( Exception e ) {  
            System.out.println();  
            System.out.println( "Exception: " + e.toString() );  
        }  
	}
}