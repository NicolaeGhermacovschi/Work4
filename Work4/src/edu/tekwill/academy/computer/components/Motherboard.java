package edu.tekwill.academy.computer.components;

public class Motherboard {
	
	private String nameProducer;
	private String nameMotherboard;
	private String chipsetManufacturers;
	private boolean integratedVideo;
	private int slotRAM;
	private Ram typeRam;
	private int sataConnectors;
	private Sata typeSata;
	
	
	public Motherboard() {
		
	}


	public Motherboard(String nameProducer, String nameMotherboard, String chipsetManufacturers,
			boolean integratedVideo, int slotRAM, Ram typeRam, int sataConnectors, Sata typeSata) {
		
		this.nameProducer = nameProducer;
		this.nameMotherboard = nameMotherboard;
		this.chipsetManufacturers = chipsetManufacturers;
		this.integratedVideo = integratedVideo;
		this.slotRAM = slotRAM;
		this.typeRam = typeRam;
		this.sataConnectors = sataConnectors;
		this.typeSata = typeSata;
	}


	public String getNameProducer() {
		return nameProducer;
	}
	
	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}

	public String getNameMotherboard() {
		return nameMotherboard;
	}

	public void setNameMotherboard(String nameMotherboard) {
		this.nameMotherboard = nameMotherboard;
	}

	public String getChipsetManufacturers() {
		return chipsetManufacturers;
	}

	public void setChipsetManufacturers(String chipsetManufacturers) {
		this.chipsetManufacturers = chipsetManufacturers;
	}

	public boolean isIntegratedVideo() {
		return integratedVideo;
	}

	public void setIntegratedVideo(boolean integratedVideo) {
		this.integratedVideo = integratedVideo;
	}

	public int getSlotRAM() {
		return slotRAM;
	}

	public void setSlotRAM(int slotRAM) {
		this.slotRAM = slotRAM;
	}

	public Ram getTypeRam() {
		return typeRam;
	}

	public void setTypeRam(Ram typeRam) {
		this.typeRam = typeRam;
	}

	public int getSataConnectors() {
		return sataConnectors;
	}

	public void setSataConnectors(int sataConnectors) {
		this.sataConnectors = sataConnectors;
	}

	public Sata getTypeSata() {
		return typeSata;
	}

	public void setTypeSata(Sata typeSata) {
		this.typeSata = typeSata;
	}


	@Override
	public String toString() {
		return "Motherboard [nameProducer=" + nameProducer + ", nameMotherboard=" + nameMotherboard
				+ ", chipsetManufacturers=" + chipsetManufacturers + ", integratedVideo=" + integratedVideo
				+ ", slotRAM=" + slotRAM + ", typeRam=" + typeRam + ", sataConnectors=" + sataConnectors + ", typeSata="
				+ typeSata + "]";
	}
	
		

}
