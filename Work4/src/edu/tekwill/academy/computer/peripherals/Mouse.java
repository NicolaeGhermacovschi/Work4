package edu.tekwill.academy.computer.peripherals;

public class Mouse {
	private String nameProducer;
	private String nameMouse;
	private String interfaceMouse;
	private Connection typeConnection;
	private Color typeColor;
	
	public Mouse() {
		
	}
	
	public Mouse(String nameProducer, String nameMouse, String interfaceMouse, Connection typeConnection,
			Color typeColor) {
		super();
		this.nameProducer = nameProducer;
		this.nameMouse = nameMouse;
		this.interfaceMouse = interfaceMouse;
		this.typeConnection = typeConnection;
		this.typeColor = typeColor;
	}

	public String getNameProducer() {
		return nameProducer;
	}

	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}

	public String getNameMouse() {
		return nameMouse;
	}

	public void setNameMouse(String nameMouse) {
		this.nameMouse = nameMouse;
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
		return "Mouse [nameProducer=" + nameProducer + ", nameMouse=" + nameMouse + ", interfaceMouse=" + interfaceMouse
				+ ", typeConnection=" + typeConnection + ", typeColor=" + typeColor + "]";
	}
	
	
	
	
}
