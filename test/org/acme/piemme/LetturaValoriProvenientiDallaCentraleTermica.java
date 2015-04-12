package org.acme.piemme;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Design Pattern: Composite
 * Role: Client
 */
public class LetturaValoriProvenientiDallaCentraleTermica {

	@Test
	public void testLetturaTemperaturaMandata() {
		// ScalingValueMeasureReader e' il decoratore
		// CollettoreCaldaiaReader e' il decorato
		MeasureReader misurator = new ScalingValueMeasureReader(new CollettoreCaldaiaReader());
		assertEquals(65.10, misurator.read(), 0.1);
	}
}
