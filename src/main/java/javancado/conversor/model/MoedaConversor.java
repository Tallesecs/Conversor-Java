package javancado.conversor.model;

public class MoedaConversor {
	private double dolar;
	private double real;
	
	public MoedaConversor() {
		
	}
	
	public MoedaConversor(double dolar, double real) {
		super();
		this.dolar = dolar;
		this.real = real;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	@Override
	public String toString() {
		return "MoedaConversor [dolar=" + dolar + ", real=" + real + "]";
	}
}
