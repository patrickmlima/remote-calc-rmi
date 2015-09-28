package RemCalc.server;

import java.rmi.*;

public interface RemCalc extends java.rmi.Remote {
	public String calculate(String expr);
}