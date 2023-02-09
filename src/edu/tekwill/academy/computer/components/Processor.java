package edu.tekwill.academy.computer.components;

import edu.tekwill.academy.computer.GeneralInfo;

public class Processor extends GeneralInfo {

	private int consum;
	private int cache;
	private int manufacturingTechnology;
	private double startProcessorFrequenc;
	private double endProcessorFrequenc;
	private int numberCores;
	
	
	
	public Processor() {
		
	}
	public Processor(int consum, int cache, int manufacturingTechnology,
			double startProcessorFrequenc, double endProcessorFrequenc, int numberCores) {
		
		this.consum = consum;
		this.cache = cache;
		this.manufacturingTechnology = manufacturingTechnology;
		this.startProcessorFrequenc = startProcessorFrequenc;
		this.endProcessorFrequenc = endProcessorFrequenc;
		this.numberCores = numberCores;
	}

	public int getConsum() {
		return consum;
	}
	
	public void setConsum(int consum) {
		this.consum = consum;
		
	}
	
	public int getCache() {
		return cache;
	}
	
	public void setCache(int cache) {
		this.cache = cache;
	}
	
	public int getManufacturingTechnology() {
		return manufacturingTechnology;
	}
	
	public void setManufacturingTechnology(int manufacturingTechnology) {
		this.manufacturingTechnology = manufacturingTechnology;
	}
	
	public double getStartProcessorFrequenc() {
		return startProcessorFrequenc;
	}
	
	public void setStartProcessorFrequenc(double startProcessorFrequenc) {
		this.startProcessorFrequenc = startProcessorFrequenc;
	}
	
	public double getEndProcessorFrequenc() {
		return endProcessorFrequenc;
	}
	
	public void setEndProcessorFrequenc(double endProcessorFrequenc) {
		this.endProcessorFrequenc = endProcessorFrequenc;
	}
	
	public int getNumberCores() {
		return numberCores;
	}
	
	public void setNumberCores(int numberCores) {
		this.numberCores = numberCores;
	}
	
	@Override
	public String toString() {
		return "Processor [nameProducer=" + getNameProducer() + ", nameProcessor=" + getNameDevace() + ", consum=" + consum
				+ "W, cache=" + cache + ", manufacturingTechnology=" + manufacturingTechnology
				+ "(NM), startProcessorFrequenc=" + startProcessorFrequenc + ", endProcessorFrequenc="
				+ endProcessorFrequenc + ", numberCores=" + numberCores + "]";
	}
	
}
