package CuerposGEOMETRICOS;

public class Prisma extends Geometricos {
	  
	public Prisma( int lados ,double perimetro, double altura ,double lateral,double total,double volumen,double radio,double area ,double arista) {
		super(lados,perimetro,altura,lateral,total,volumen,radio,area,arista);
		
		lateral = lados * perimetro * altura ;
		  double ang = 180/lados;
			double ang1 = 2* Math.tanh(ang);
			double ap = perimetro/ang1;
			double AB = perimetro* ap /2 ;
			 total = lateral +2*AB;
			 volumen = AB * altura;
		System.out.println("EL areal lateral del prisma  es :"+ lateral);
		System.out.println("El area total del prisma es :"+ total);
		System.out.println("El volumen del prisma es:"+ volumen);
	}
      
}
