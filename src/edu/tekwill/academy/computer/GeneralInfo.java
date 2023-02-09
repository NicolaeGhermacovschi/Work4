package edu.tekwill.academy.computer;

public class GeneralInfo {

    private String nameProducer;
    private String nameDevices;

    public GeneralInfo() {
    }

    public GeneralInfo(String nameProducer, String nameDevace) {
        this.nameProducer = nameProducer;
        this.nameDevices = nameDevace;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public String getNameDevace() {
        return nameDevices;
    }

    public void setNameDevace(String nameDevace) {
        this.nameDevices = nameDevace;
    }

    @Override
    public String toString() {
        return "GeneralInfo{" +
                "nameProducer='" + nameProducer + '\'' +
                ", nameDevices='" + nameDevices + '\'' +
                '}';
    }
}
