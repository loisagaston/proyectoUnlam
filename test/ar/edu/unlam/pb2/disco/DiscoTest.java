package ar.edu.unlam.pb2.disco;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoTest {

	@Test
	public void queSePuedaCrearUnDisco() {
		
		//preparacion
		Double radiointerior=10.0;
		Double radioExterior=20.0;
		
		//ejecucion
		Disco pruebaDisco = new Disco(radiointerior,radioExterior);
		
		//verificacion
		assertNotNull(pruebaDisco);
	}
		
		@Test
		public void queSeObtengaPerimetroExterior() {
			Double radiointerior=10.0;
			Double radioExterior=20.0;
			Disco pruebaDisco = new Disco(radiointerior,radioExterior);
			Double perimetroExterior = pruebaDisco.permimetroExt();
			assertEquals(perimetroExterior, 125.66, 0.5);

			
			
		}



}
