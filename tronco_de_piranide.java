package CuerposGEOMETRICOS;

public class tronco_de_piranide  extends Geometricos{
	private double PB;
	private double pb;
	private double ab;
	public tronco_de_piranide(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista ,double PB,double pb,double ab) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
		this.ab = ab;
		this.pb = pb;
		this.PB = PB;
		 double ang = 180/lados;
			double ang1 = 2* Math.tanh(ang);
			double ap = perimetro/ang1;
			double AB = perimetro* ap /2 ;
			
			lateral = PB + pb / 2 *ap;
			total = PB + pb / 2 *ap +AB+ab;
			volumen = 1/3 * altura * (AB + ab + Math.sqrt(AB *ab)/3);
			
			System.out.println( );
			System.out.println("EL area lateral del tronco de piramide es:"+ lateral);
			System.out.println("EL area total del tronco de piramide es:"+ total);
			System.out.println("EL volumen del tronco de piramide es:"+ volumen);
			System.out.println( );
	}

}
