package DrCasa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AutoinmuneTest {
	
	private AutoInmune lupus;
	
	@Before
	public void inicializarFixture () {
		// Fixture - Precondiciones
		lupus = new AutoInmune();
	}

	@Test
	public void siNoPasaronDiasNoEsAgresiva() {
		AutoInmune lupus = new AutoInmune();
		
		// Acción
		boolean esAgresiva = lupus.esAgresiva();
		
		// Validaciones - Postcondiciones
		Assert.assertFalse(esAgresiva);
	}
	
	@Test
	public void siPasoMasDeUnMesEsAgresiva () {
		for (int i = 0; i< 31; i++) {
			lupus.pasarUnDia();
		}
	}
	
}
