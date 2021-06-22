package CuerposGEOMETRICOS;

public class Esfera extends Geometricos {

	public Esfera(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio,area,arista);
		area = (4*Math.PI*Math.pow(radio, 2));
		volumen =(4*Math.PI*Math.pow(radio, 3)/3);
		area = 2*Math.PI*radio*altura;
		volumen = (Math.PI*altura*(Math.pow(altura, 2)+3*Math.pow(radio, 2)+3*Math.pow(radio, 2))/6);
		
		System.out.println( );
		System.out.println("El area de la esfera es:"+area);
		System.out.println("El volumen de la esfera es:"+volumen);
		System.out.println();
		
	}

}
