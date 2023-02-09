package edu.tekwill.academy.computer.peripherals;

import edu.tekwill.academy.computer.GeneralInfo;

public class Keyboard extends GeneralInfo {

	private String interfaceKeyboard;
	private Connection typeConnection;
	private Color typeColor;
	
	public Keyboard() {
		
	}

	public Keyboard(String interfaceKeyboard, Connection typeConnection,
			Color typeColor) {
	
		this.interfaceKeyboard = interfaceKeyboard;
		this.typeConnection = typeConnection;
		this.typeColor = typeColor;
	}

	public String getInterfaceKeyboard() {
		return interfaceKeyboard;
	}

	public void setInterfaceKeyboard(String interfaceKeyboard) {
		this.interfaceKeyboard = interfaceKeyboard;
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
		return "Keyboard [nameProducer=" + getNameProducer() + ", nameKeyboard=" + getNameDevace() + ", interfaceKeyboard="
				+ interfaceKeyboard + ", typeConnection=" + typeConnection + ", typeColor=" + typeColor + "]";
	}
	
	
	
	
	
}
