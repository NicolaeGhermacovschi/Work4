package edu.tekwill.academy.computer;
import edu.tekwill.academy.computer.components.*;
import edu.tekwill.academy.computer.peripherals.*;


public class Computer {
	
	public void addComponents(){
		Processor processor = new Processor();
		processor.setNameProducer("Intel");
		processor.setNameProcessor("Core i3");
		processor.setConsum(65);
		processor.setCache(6);
		processor.setManufacturingTechnology(14);
		processor.setStartProcessorFrequenc(3.6);
		processor.setEndProcessorFrequenc(4.2);
		processor.setNumberCores(4);
		
		System.out.println(processor.toString());
		
		Motherboard motherboard = new Motherboard();
		motherboard.setNameProducer("Intel");
		motherboard.setNameMotherboard("Gigabyte H510M");
		motherboard.setChipsetManufacturers("INTEL");
		motherboard.setIntegratedVideo(true);
		motherboard.setSlotRAM(4);
		motherboard.setTypeRam(Ram.DDR5);
		motherboard.setSataConnectors(5);
		motherboard.setTypeSata(Sata.SATA3);
		
		System.out.println(motherboard.toString());
		
		HardDrive hardDrive = new HardDrive();
		
		hardDrive.setNameProducer("Samsung");
		hardDrive.setNameHardDrive("Samsung 870 QV");
		hardDrive.setModel("SSD");
		hardDrive.setReadingSpeed(560);
		hardDrive.setWritingSpeed(530);
		hardDrive.setVolumeStorge(4000);
		hardDrive.setInterfaceSata(Sata.SATA3);
		
		System.out.println(hardDrive.toString());
		
		Monitor monitor = new Monitor();
		monitor.setNameProducer("Philips");
		monitor.setNameMonitor("Philips 243V7QSB");
		monitor.setResolutionH(1920);
		monitor.setResolutionW(1080);
		monitor.setScreenType("light");
		monitor.setDiagonala(23.8);
		monitor.setPortDVI(true);
		monitor.setPortHDMI(true);
		monitor.setPortVGA(false);
		
		System.out.println(monitor.toString());
		
		Mouse mouse = new Mouse();
		mouse.setNameProducer("Logitech");
		mouse.setNameMouse("Mouse Logitech G502");
		mouse.setInterfaceMouse("USB");
		mouse.setTypeConnection(Connection.WIRELESS);
		mouse.setTypeColor(Color.BLACK);

		System.out.println(mouse.toString());
		Keyboard keyboard = new Keyboard();
		keyboard.setNameProducer("HP");
		keyboard.setNameKeyboard("HYPERX Alloy Origins Core RGB");
		keyboard.setInterfaceKeyboard("USB");
		keyboard.setTypeConnection(Connection.WIRELESS );
		keyboard.setTypeColor(Color.BLACK);
		
		System.out.println(keyboard.toString());

	}

}








































