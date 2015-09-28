package RemCalc.server;

import java.rmi.*;

public interface RemCalc extends java.rmi.Remote {
	String calculate(String expr);
}