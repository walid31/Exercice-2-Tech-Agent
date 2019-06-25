

import jade.core.Agent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;



public class exercice3 {

	public static void main(String[] args) {
		try {Runtime rt = Runtime.instance();
			ProfileImpl p = new ProfileImpl("localhost",1099,null);
			ContainerController mc = rt.createMainContainer(p);
			AgentController ag1 = mc.createNewAgent("Achteur 1", "Acheteur", null);
			ag1.start();
		}catch (Exception e) { e.printStackTrace();}
	}
}


