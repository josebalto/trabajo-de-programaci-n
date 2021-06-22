package CuerposGEOMETRICOS;

public class Casqueteesferico extends Geometricos{

	public Casqueteesferico(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);

		area =2*Math.PI*radio*altura;
		volumen = (Math.PI*Math.pow(altura,2)*(3*radio-altura)/3);
		
		System.out.println( );
		System.out.println("El area del casquete esferico es:"+area);
		System.out.println("EL volumen del casquete esferico es:"+ volumen);
		System.out.println( );
	}

}
