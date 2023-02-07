package edu.tekwill.academy.computer.peripherals;

public class Monitor {
	private String nameProducer;
	private String nameMonitor;
	private int resolutionH;
	private int resolutionW;
	private String screenType;
	private double diagonala;
	private boolean portDVI;
	private boolean portHDMI;
	private boolean portVGA;
	
	public Monitor() {
		
	}
	
	public Monitor(String nameProducer, String nameMonitor, int resolutionH, int resolutionW, String screenType,
			double diagonala, boolean portDVI, boolean portHDMI, boolean portVGA) {
		this.nameProducer = nameProducer;
		this.nameMonitor = nameMonitor;
		this.resolutionH = resolutionH;
		this.resolutionW = resolutionW;
		this.screenType = screenType;
		this.diagonala = diagonala;
		this.portDVI = portDVI;
		this.portHDMI = portHDMI;
		this.portVGA = portVGA;
	}

	public String getNameProducer() {
		return nameProducer;
	}

	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}

	public String getNameMonitor() {
		return nameMonitor;
	}

	public void setNameMonitor(String nameMonitor) {
		this.nameMonitor = nameMonitor;
	}

	public int getResolutionH() {
		return resolutionH;
	}

	public void setResolutionH(int resolutionH) {
		this.resolutionH = resolutionH;
	}

	public int getResolutionW() {
		return resolutionW;
	}

	public void setResolutionW(int resolutionW) {
		this.resolutionW = resolutionW;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public double getDiagonala() {
		return diagonala;
	}

	public void setDiagonala(double diagonala) {
		this.diagonala = diagonala;
	}

	public boolean isPortDVI() {
		return portDVI;
	}

	public void setPortDVI(boolean portDVI) {
		this.portDVI = portDVI;
	}

	public boolean isPortHDMI() {
		return portHDMI;
	}

	public void setPortHDMI(boolean portHDMI) {
		this.portHDMI = portHDMI;
	}

	public boolean isPortVGA() {
		return portVGA;
	}

	public void setPortVGA(boolean portVGA) {
		this.portVGA = portVGA;
	}

	@Override
	public String toString() {
		return "Monitor [nameProducer=" + nameProducer + ", nameMonitor=" + nameMonitor + ", resolution=" + resolutionH
				+ "x" + resolutionW + ", screenType=" + screenType + ", diagonala=" + diagonala
				+ "ich, portDVI=" + portDVI + ", portHDMI=" + portHDMI + ", portVGA=" + portVGA + "]";
	}
	
	
	
}
