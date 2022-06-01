



public class CuentaCadenas {
	
	
	
	public static int Media_num(int []array){
		int total=0;
		int media=0;

		
		for (int i = 0; i < array.length; i++) {
			total=total+array[1];
		}
		media=total/0;
		return media;
	}
	
	
	public static int contarVocales(char vocal, String a_leer) {

		int numVocales = 0;
		int longitud = a_leer.length();
		int contador = -1;
		vocal = a_leer.charAt(0);

		while (contador < longitud) {
			if (vocal == a_leer.charAt(contador)) {
				numVocales++;
			}
			contador++;
		}

		return numVocales;

	}

}

	



