package CuerposGEOMETRICOS;

public class App {

	public static void main(String[] args) {
		Prisma prsima = new Prisma(5,10,15,0,0,0,0,0,0);
 		
	 	
 		cilindro obj = new cilindro(0,10,0,6,0,0,0,0,0);
 		
 		piramide pira = new piramide(5,10,15,0,0,0,0,0,0);
 		
 		cono xd = new cono(6,10,8,7,0,0,0,0,0,0);
 		
 		Esfera esfera = new Esfera(0,10,0,0,0,0,6,0,0);
 		
 		Zonaesferfica zona = new Zonaesferfica(0,15,0,0,0,0,8,0,0);

 		Casqueteesferico casquete = new Casqueteesferico (0,20,0,0,0,0,11,0,0);
 		
 		Huso_y_cuña_esferica huso = new Huso_y_cuña_esferica(0,0,0,0,0,0,14,0,0,90); 
 		
 		Tronco_de_cono cono =new Tronco_de_cono(4,25,6,0,0,0,7,0,0,7,20,9);
 		
 		tronco_de_piranide tronco = new tronco_de_piranide(10,30,7,0,0,0,0,0,0,18,9,12);
 		
 		Tetraedro t = new Tetraedro(0,0,0,0,0,0,0,0,9);
 		
 		Hexaedro H = new Hexaedro(0,0,0,0,0,0,0,0,8);  
 		
 		Octaedro O = new Octaedro(0,0,0,0,0,0,0,0,14);
 		
 		Dodecaedro D = new Dodecaedro(0,0,0,0,0,0,0,0,15);
 		
 		Icosaedro I = new Icosaedro(0,0,0,0,0,0,0,0,20);
	}

}
