package br.com.conversor.moedas;

import javax.swing.JOptionPane;

public class FuncaoConverterMoeda {

	public void converterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.30;
		moedaDolar = (double) Math.round(moedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaDolar + " Dolares");
	}
	
	public void converterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.21;
		moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaEuro + " Euros");
	}
	
	public void converterReaisParaLibras(double valorRecebido) {
		double moedaLibras = valorRecebido / 5.96;
		moedaLibras = (double) Math.round(moedaLibras * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaLibras + " Libras");
	}
	
	public void converterReaisParaPA(double valorRecebido) {
		double moedaPA = valorRecebido / 0.035;
		moedaPA = (double) Math.round(moedaPA * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaPA + " Pesos Argentinos");
	}
	
	public void converterReaisParaPC(double valorRecebido) {
		double moedaPC = valorRecebido / 5.96;
		moedaPC = (double) Math.round(moedaPC * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaPC + " Pesos Chilenos");
	}
	
	public void converterReaisParaKwanza(double valorRecebido) {
		double moedaKwanza = valorRecebido / 0.012;
		moedaKwanza = (double) Math.round(moedaKwanza * 100d) /100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaKwanza + " Kwanzas");
	}
}
