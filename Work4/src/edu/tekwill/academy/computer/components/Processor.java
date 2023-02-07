package edu.tekwill.academy.computer.components;

public class Processor {

	private String nameProducer;
	private String nameProcessor;
	private int consum;
	private int cache;
	private int manufacturingTechnology;
	private double startProcessorFrequenc;
	private double endProcessorFrequenc;
	private int numberCores;
	
	
	
	public Processor() {
		
	}
	public Processor(String nameProducer, String nameProcessor, int consum, int cache, int manufacturingTechnology,
			double startProcessorFrequenc, double endProcessorFrequenc, int numberCores) {
		
		this.nameProducer = nameProducer;
		this.nameProcessor = nameProcessor;
		this.consum = consum;
		this.cache = cache;
		this.manufacturingTechnology = manufacturingTechnology;
		this.startProcessorFrequenc = startProcessorFrequenc;
		this.endProcessorFrequenc = endProcessorFrequenc;
		this.numberCores = numberCores;
	}
	public String getNameProducer() {
		return nameProducer;
	}
	
	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}
	
	public String getNameProcessor() {
		return nameProcessor;
	}
	
	public void setNameProcessor(String nameProcessor) {
		this.nameProcessor = nameProcessor;
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
		return "Processor [nameProducer=" + nameProducer + ", nameProcessor=" + nameProcessor + ", consum=" + consum
				+ "W, cache=" + cache + ", manufacturingTechnology=" + manufacturingTechnology
				+ "(NM), startProcessorFrequenc=" + startProcessorFrequenc + ", endProcessorFrequenc="
				+ endProcessorFrequenc + ", numberCores=" + numberCores + "]";
	}
	
}
