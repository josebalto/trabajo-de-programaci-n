package CuerposGEOMETRICOS;

public class piramide extends Geometricos{

	public piramide(int lados, double altura, double perimetro,double lateral,double total,double volumen,double radio,double area ,double arista) {
		super(lados, altura, perimetro,lateral,total,volumen,radio,area,arista);
		
		double ang = 180/lados;
		double ang1 = 2* Math.tanh(ang);
		double ap = perimetro/ang1;
		double AB = perimetro* ap /2 ;
		 lateral = lados*perimetro* ap /2;
		 total = lateral +AB;
		 volumen = AB * altura /3;
		
		System.out.println( );
		System.out.println("EL area lateral de la piramide es:"+ lateral);
		System.out.println("El area total de la piramide es:"+ total);
		System.out.println("EL volumen de la piramide es:"+volumen);
	}

}
