package CuerposGEOMETRICOS;

public class Geometricos {
	 public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLateral() {
		return lateral;
	}
	public void setLateral(double lateral) {
		this.lateral = lateral;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	private  double volumen;
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getArista() {
		return arista;
	}
	public void setArista(double arista) {
		this.arista = arista;
	}
	private int lados;
	 private double perimetro;
	 private double altura ;
	 private double lateral;
	private double total;
	private double radio ;
	private double area ;
	private double arista;
	
	public Geometricos(int lados , double altura ,double perimetro,double lateral ,double total,double volumen, double radio,double area, double arista) {
		this.altura = altura;
		this.lados = lados ;
		this.perimetro = perimetro;
		this.lateral = lateral;
		this.total = total;
		this.volumen = volumen;
		this.radio = radio;
		this.area = area;
		this.arista = arista;
		
	}
}
