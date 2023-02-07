package edu.tekwill.academy.computer.components;

public class HardDrive {

	private String nameProducer;
	private String nameHardDrive;
	private String model;
	private int readingSpeed;
	private int  writingSpeed;
	private int volumeStorge;
	private Sata interfaceSata;
	
	public HardDrive() {
		
	}
	
	public HardDrive(String nameProducer, String nameHardDrive, String model, int readingSpeed, int writingSpeed,
			int volumeStorge, Sata interfaceSata) {
		
		this.nameProducer = nameProducer;
		this.nameHardDrive = nameHardDrive;
		this.model = model;
		this.readingSpeed = readingSpeed;
		this.writingSpeed = writingSpeed;
		this.volumeStorge = volumeStorge;
		this.interfaceSata = interfaceSata;
	}


	public String getNameProducer() {
		return nameProducer;
	}

	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}

	public String getNameHardDrive() {
		return nameHardDrive;
	}

	public void setNameHardDrive(String nameHardDrive) {
		this.nameHardDrive = nameHardDrive;
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
		return "HardDrive [nameProducer=" + nameProducer + ", nameHardDrive=" + nameHardDrive + ", model=" + model
				+ ", readingSpeed=" + readingSpeed + "MB/s, writingSpeed=" + writingSpeed + "MB/s, volumeStorge=" + volumeStorge
				+ "MB, interfaceSata=" + interfaceSata + "]";
	}
	
	
	
	
	
	
	
}
