package edu.tekwill.academy.computer.components;
import edu.tekwill.academy.computer.GeneralInfo;

public class HardDrive extends GeneralInfo{

	private String model;
	private int readingSpeed;
	private int  writingSpeed;
	private int volumeStorge;
	private Sata interfaceSata;
	
	public HardDrive() {
		
	}
	
	public HardDrive( String model, int readingSpeed, int writingSpeed,
			int volumeStorge, Sata interfaceSata) {
		
		this.model = model;
		this.readingSpeed = readingSpeed;
		this.writingSpeed = writingSpeed;
		this.volumeStorge = volumeStorge;
		this.interfaceSata = interfaceSata;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getReadingSpeed() {
		return readingSpeed;
	}

	public void setReadingSpeed(int readingSpeed) {
		this.readingSpeed = readingSpeed;
	}

	public int getWritingSpeed() {
		return writingSpeed;
	}

	public void setWritingSpeed(int writingSpeed) {
		this.writingSpeed = writingSpeed;
	}

	public int getVolumeStorge() {
		return volumeStorge;
	}

	public void setVolumeStorge(int volumeStorge) {
		this.volumeStorge = volumeStorge;
	}

	public Sata getInterfaceSata() {
		return interfaceSata;
	}

	public void setInterfaceSata(Sata interfaceSata) {
		this.interfaceSata = interfaceSata;
	}

	@Override
	public String toString() {
		return "HardDrive [nameProducer=" + getNameProducer() + ", nameHardDrive=" + getNameDevace() + ", model=" + model
				+ ", readingSpeed=" + readingSpeed + "MB/s, writingSpeed=" + writingSpeed + "MB/s, volumeStorge=" + volumeStorge
				+ "MB, interfaceSata=" + interfaceSata + "]";
	}
	
	
	
	
	
	
	
}
