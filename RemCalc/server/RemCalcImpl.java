import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RemCalcImpl extends UnicastRemoteObject implements RemCalc {
	public RemCalcImpl() throws java.rmi.RemoteException {
		super();
	}

	public String calculate(String expr) throws java.rmi.RemoteException {
		return ProcessExpression.getInstance().eval(expr);
	}
}