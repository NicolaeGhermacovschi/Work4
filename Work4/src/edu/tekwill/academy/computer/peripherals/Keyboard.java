package edu.tekwill.academy.computer.peripherals;

public class Keyboard {
	private String nameProducer;
	private String nameKeyboard;
	private String interfaceKeyboard;
	private Connection typeConnection;
	private Color typeColor;
	
	public Keyboard() {
		
	}

	public Keyboard(String nameProducer, String nameKeyboard, String interfaceKeyboard, Connection typeConnection,
			Color typeColor) {
	
		this.nameProducer = nameProducer;
		this.nameKeyboard = nameKeyboard;
		this.interfaceKeyboard = interfaceKeyboard;
		this.typeConnection = typeConnection;
		this.typeColor = typeColor;
	}

	public String getNameProducer() {
		return nameProducer;
	}

	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}

	public String getNameKeyboard() {
		return nameKeyboard;
	}

	public void setNameKeyboard(String nameKeyboard) {
		this.nameKeyboard = nameKeyboard;
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
		return "Keyboard [nameProducer=" + nameProducer + ", nameKeyboard=" + nameKeyboard + ", interfaceKeyboard="
				+ interfaceKeyboard + ", typeConnection=" + typeConnection + ", typeColor=" + typeColor + "]";
	}
	
	
	
	
	
}
