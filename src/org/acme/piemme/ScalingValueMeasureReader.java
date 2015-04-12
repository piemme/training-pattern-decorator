package org.acme.piemme;

/**
 * Design Pattern: Composite
 * Role: Concrete Decorator
 */
public class ScalingValueMeasureReader extends DecoratorMeasureReader {

	public ScalingValueMeasureReader(MeasureReader decoratedMeasureReader) {
		super(decoratedMeasureReader);
	}

	@Override
	public double read() {
		return scaleValue(super.read());
	}
	
	private double scaleValue(double valoreNonScalato) {
		return valoreNonScalato / 100;
	}
	
}
