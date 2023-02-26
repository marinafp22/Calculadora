package proyectoGit;

public class Operacion {
	
	private double a;
	private double b;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public Operacion(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Operacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected double suma() {
		return a+b;
	}
	
	protected double resta() {
		return a-b;
	}
	
	protected double mult() {
		return a*b;
	}
	
	protected double divi() {
		return a/b;
	}

}
