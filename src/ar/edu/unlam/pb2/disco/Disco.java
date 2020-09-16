package ar.edu.unlam.pb2.disco;

public class Disco {

	private Double radioInterior;
	private Double radioExterior;
	
	public Disco(Double radioInterior,Double radioExterior) {
		this.radioExterior = radioExterior;
		this.radioInterior = radioInterior;
	}
	
	public Double permimetroInt(){
		Double perimetroInterior = 0.0;
		perimetroInterior = 2 * Math.PI * this.radioInterior;
		return perimetroInterior;
	}
	
	public Double permimetroExt(){
		Double perimetroExteruir = 0.0;
		perimetroExteruir = 2 * Math.PI * this.radioExterior;
		return perimetroExteruir;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	public Double areaTotal() {
		Double areaInt = 0.0;
		areaInt = Math.PI * Math.pow(radioInterior,2);
		Double areaExt = 0.0;
		areaExt = Math.PI * Math.pow(radioExterior,2);
		return areaExt - areaInt;
	}
}
