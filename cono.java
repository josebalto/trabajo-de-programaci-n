package CuerposGEOMETRICOS;

public class cono extends Geometricos{
 private double generatriz;
	public cono(int lados, double altura, double perimetro,double generatriz,double lateral,double total,double volumen,double radio,double area,double arista) {
		super(lados, altura, perimetro,lateral,total,volumen,radio,area,arista);
		this.generatriz = generatriz;
		double ang = 180/lados;
		double ang1 = 2* Math.tanh(ang);
		double ap = perimetro/ang1;
		double AB = perimetro* ap /2 ;
		 lateral = lados*perimetro*generatriz/2;
		 total = lateral + AB;
		 volumen = AB*altura /3;
		
		System.out.println( );
		System.out.println("EL area lateral del cono es:" + lateral);
		System.out.println("El area total del cono es:" + total);
		System.out.println("El volumen del cono es:"+ volumen);
		System.out.println( );
	}

}
