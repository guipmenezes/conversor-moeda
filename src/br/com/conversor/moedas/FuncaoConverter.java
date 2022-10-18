package br.com.conversor.moedas;

import javax.swing.JOptionPane;

public class FuncaoConverter {

	public void ConverterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.30;
		moedaDolar = (double) Math.round(moedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaDolar + " Dolares");
	}
	
	public void ConverterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.21;
		moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaEuro + " Euros");
	}
	
	public void ConverterReaisParaLibras(double valorRecebido) {
		double moedaLibras = valorRecebido / 5.96;
		moedaLibras = (double) Math.round(moedaLibras * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaLibras + " Libras");
	}
	
	public void ConverterReaisParaPA(double valorRecebido) {
		double moedaPA = valorRecebido / 0.035;
		moedaPA = (double) Math.round(moedaPA * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaPA + " Pesos Argentinos");
	}
	
	public void ConverterReaisParaPC(double valorRecebido) {
		double moedaPC = valorRecebido / 5.96;
		moedaPC = (double) Math.round(moedaPC * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaPC + " Pesos Chilenos");
	}
}
