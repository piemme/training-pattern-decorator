package org.acme.piemme;

/**
 * Design Pattern: Composite
 * Role: Decorator
 */
public class DecoratorMeasureReader implements MeasureReader {
	
	protected final MeasureReader decoratedMeasureReader;

	public DecoratorMeasureReader(MeasureReader decoratedMeasureReader) {
		this.decoratedMeasureReader = decoratedMeasureReader;
	}
	
	@Override
	public double read() {
		return this.decoratedMeasureReader.read();
	}

}
