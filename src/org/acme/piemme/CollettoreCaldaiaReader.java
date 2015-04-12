package org.acme.piemme;

/**
 * Design Pattern: Composite
 * Role: ConcreteComponent
 */
public class CollettoreCaldaiaReader implements MeasureReader {

	@Override
	public double read() {
		int temperaturaMandataEsempio = 6516; // just a simple value
		return temperaturaMandataEsempio;
	}

}
