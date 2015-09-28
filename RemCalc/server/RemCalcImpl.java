package RemCalc.server;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import RemCalc.server.RemCalc;
import RemCalc.server.ProcessExpression;

public class RemCalcImpl extends UnicastRemoteObject implements RemCalc {
	public RemCalcImpl() throws java.rmi.RemoteException {
		super();
	}

	public String calculate(String expr) {
		return ProcessExpression.getInstance().eval(expr);
	}
}