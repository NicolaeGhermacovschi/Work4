package edu.tekwill.academy.computer.peripherals;

import edu.tekwill.academy.computer.GeneralInfo;

public class Mouse extends GeneralInfo {

	private String interfaceMouse;
	private Connection typeConnection;
	private Color typeColor;
	
	public Mouse() {
		
	}
	
	public Mouse(String interfaceMouse, Connection typeConnection,
			Color typeColor) {
	
		this.interfaceMouse = interfaceMouse;
		this.typeConnection = typeConnection;
		this.typeColor = typeColor;
	}

	public String getInterfaceMouse() {
		return interfaceMouse;
	}

	public void setInterfaceMouse(String interfaceMouse) {
		this.interfaceMouse = interfaceMouse;
	}

	public Connection getTypeConnection() {
		return typeConnection;
	}

	public void setTypeConnection(Connection typeConnection) {
		this.typeConnection = typeConnection;
	}

	public Color getTypeColor() {
		return typeColor;
	}

	public void setTypeColor(Color typeColor) {
		this.typeColor = typeColor;
	}

	@Override
	public String toString() {
		return "Mouse [nameProducer=" + getNameProducer()  + ", nameMouse=" + getNameDevace() + ", interfaceMouse=" + interfaceMouse
				+ ", typeConnection=" + typeConnection + ", typeColor=" + typeColor + "]";
	}
	
	
	
	
}
