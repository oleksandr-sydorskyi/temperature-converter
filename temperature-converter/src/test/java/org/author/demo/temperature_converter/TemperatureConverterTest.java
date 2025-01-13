package org.author.demo.temperature_converter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureConverterTest {

    private static final double DELTA = 0.01;
    private static final double[] CELSIUS_VALUES = { 0.0, -17.78, -273.15, 10.0, 100.0, -10.0, -100.0 };
    private static final double[] FAHRENHEIT_VALUES = { 32.0, 0.0, -459.67, 50.0, 212.0, 14.0, -148.0 };
    private static final double[] KELVIN_VALUES = { 273.15, 255.37, 0.0, 283.15, 373.15, 263.15, 173.15 };

    @Test
    public void testFahrenheitToCelsius() {
        for (int i = 0; i < FAHRENHEIT_VALUES.length; ++i) {
            double fahrenheit = FAHRENHEIT_VALUES[i];
            double expected = CELSIUS_VALUES[i];
            double actual = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
            assertEquals(expected, actual, DELTA);
        }
    }
    
	@Test
	public void testFahrenheitToKelvin() {
		for (int i = 0; i < FAHRENHEIT_VALUES.length; ++i) {
			double fahrenheit = FAHRENHEIT_VALUES[i];
			double expected = KELVIN_VALUES[i];
			double actual = TemperatureConverter.fahrenheitToKelvin(fahrenheit);
			assertEquals(expected, actual, DELTA);
		}
}
	
	@Test
	public void testCelsiusToFahrenheit() {
		for (int i = 0; i < CELSIUS_VALUES.length; ++i) {
			double celsius = CELSIUS_VALUES[i];
			double expected = FAHRENHEIT_VALUES[i];
			double actual = TemperatureConverter.celsiusToFahrenheit(celsius);
			assertEquals(expected, actual, DELTA);
		}
	}

	@Test
	public void testCelsiusToKelvin() {
		for (int i = 0; i < CELSIUS_VALUES.length; ++i) {
			double celsius = CELSIUS_VALUES[i];
			double expected = KELVIN_VALUES[i];
			double actual = TemperatureConverter.celsiusToKelvin(celsius);
			assertEquals(expected, actual, DELTA);
		}
	}

	@Test
	public void testKelvinToFahrenheit() {
		for (int i = 0; i < KELVIN_VALUES.length; ++i) {
			double kelvin = KELVIN_VALUES[i];
			double expected = FAHRENHEIT_VALUES[i];
			double actual = TemperatureConverter.kelvinToFahrenheit(kelvin);
			assertEquals(expected, actual, DELTA);
		}
	}

	@Test
	public void testKelvinToCelsius() {
		for (int i = 0; i < KELVIN_VALUES.length; ++i) {
			double kelvin = KELVIN_VALUES[i];
			double expected = CELSIUS_VALUES[i];
			double actual = TemperatureConverter.kelvinToCelsius(kelvin);
			assertEquals(expected, actual, DELTA);
		}
	}
	
    // Простий тест для виклику main методу
    @Test
    public void testMainMethod() {
        // Викликаємо main метод для покриття
        TemperatureConverter.main(new String[] {});
        TemperatureConverter converter = new TemperatureConverter();
    }
}
