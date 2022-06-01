


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CuentaCadenasTestException {

	
	@Test
	// En este test hemos cambiado el codigo para forzar a error, puesto que para hacer la media no peudes dividir entre 0 dara un error de excepcion aritmetica, resultando asi
	// una prueba exitosa
	public void Media_num() {
		try {
			assertEquals(7, CuentaCadenas.Media_num(new int[] { 0, 0, 0, 0 }));
			fail("No deberia haber sido una prueba exitosa");
		}
		catch(ArithmeticException e){
			System.out.println("El test ha sido un exito");
		}
	}
	
	
	
	@Test
	// En este test hemos modificado el metodo a proposito para que de un fallo en la ejecucion, cambiando el contador de 0, a, -1, siendo asi que lea una cadena mas "inexistente"
	//daando lugar a un error ( index out of range), para ello haremos un try catch, y usaremos un fail si el programa se ejecuta correctamente, de lo contrario la prueba sera un exito mostrando asi "Prueba satisfactoria"
	public void testContarVocales() {
		try {
			System.out.println(CuentaCadenas.contarVocales('a', "acaddfdabasdf"));
			fail("Deberia haber salido un error");
		}
		catch(StringIndexOutOfBoundsException e1) {
			System.out.println("Prueba Satisfactoria");
		}
	}

}

