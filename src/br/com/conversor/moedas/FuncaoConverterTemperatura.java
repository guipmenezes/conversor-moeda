package br.com.conversor.moedas;

import javax.swing.JOptionPane;

public class FuncaoConverterTemperatura {

	public void converterCelsiusParaKelvin(double temperatura) {
		double temperaturaKelvin = temperatura + 273;
		temperaturaKelvin = (double) Math.round(temperaturaKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, "A temperatura é: " + temperaturaKelvin + " Kelvins");
	}
	
	public void converterCelsiusParaFahrenheit(double temperatura) {
		double temperaturaFahrenheit = ((temperatura * 9) + 160) / 5;
		temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é: " + temperaturaFahrenheit + " Fahrenheit");
	}
}
