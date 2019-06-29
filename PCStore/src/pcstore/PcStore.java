package pcstore;

import computer.*;

public class PcStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating HP Computer
        Monitor hpMonitor = new Monitor("HP", 13);
        Keyboard hpKeyboard = new Keyboard("bluetooth", "HP");
        Mouse hpMouse = new Mouse("bluetooth", "HP");
        Computer hpComputer = new Computer("HP Computer", hpMonitor, hpKeyboard, hpMouse);

        //Creating Dell Computer
        Monitor msiMonitor = new Monitor("MSI", 15);
        Keyboard msiKeyboard = new Keyboard("usb", "MSI");
        Mouse msiMouse = new Mouse("usb", "MSI");
        Computer msiComputer = new Computer("MSI Computer", msiMonitor, msiKeyboard, msiMouse);

        //Creating setted Computer
        Computer compuArmada = new Computer("Setted Computer", msiMonitor, hpKeyboard, hpMouse);

        //add Computers to Order 
        Order orden1 = new Order();
        orden1.addComputer(hpComputer);
        orden1.addComputer(msiComputer);
        orden1.addComputer(compuArmada);
        //print order
        orden1.showOrder();
        
        //add another Order
        Order orden2 = new Order();
        orden2.addComputer(compuArmada);
        orden2.addComputer(msiComputer);
        System.out.println("");
        orden2.showOrder();
	}

}
