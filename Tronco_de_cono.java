package CuerposGEOMETRICOS;

public class Tronco_de_cono extends Geometricos{
	private double generatriz;
	private  double radiomayor;
	private double ab;
	public Tronco_de_cono(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista,double generatriz,double radiomayor,double ab) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
			this.generatriz = generatriz;
			this.radiomayor = radiomayor;
			this.ab = ab;
			lateral =Math.PI*generatriz*(radiomayor+radio);
			total = lateral + (lados*perimetro) + ab;
			volumen =1/3*Math.PI* altura * (radiomayor*radiomayor)+ (radio*radio)+ radiomayor* radio ;
			
			System.out.println( );
			System.out.println("El area lateral del tronco de cono es:"+ lateral);
			System.out.println("El area total del tronco de cono es:"+ total);
			System.out.println("EL volumen del tronco de cono es:"+ volumen);
			System.out.println( );
	}

}
