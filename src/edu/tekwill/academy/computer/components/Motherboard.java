package edu.tekwill.academy.computer.components;
import edu.tekwill.academy.computer.GeneralInfo;

public class Motherboard extends GeneralInfo {
	
	private String chipsetManufacturers;
	private boolean integratedVideo;
	private int slotRAM;
	private Ram typeRam;
	private int sataConnectors;
	private Sata typeSata;
	
	
	public Motherboard() {
		
	}


	public Motherboard(String chipsetManufacturers,	boolean integratedVideo, int slotRAM, Ram typeRam, 
					int sataConnectors, Sata typeSata) {
		
		this.chipsetManufacturers = chipsetManufacturers;
		this.integratedVideo = integratedVideo;
		this.slotRAM = slotRAM;
		this.typeRam = typeRam;
		this.sataConnectors = sataConnectors;
		this.typeSata = typeSata;
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
		return "Motherboard [nameProducer=" + getNameProducer() + ", nameMotherboard=" + getNameDevace()
				+ ", chipsetManufacturers=" + chipsetManufacturers + ", integratedVideo=" + integratedVideo
				+ ", slotRAM=" + slotRAM + ", typeRam=" + typeRam + ", sataConnectors=" + sataConnectors + ", typeSata="
				+ typeSata + "]";
	}
	
		

}
