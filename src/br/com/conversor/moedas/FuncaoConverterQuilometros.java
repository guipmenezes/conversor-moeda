package br.com.conversor.moedas;

import javax.swing.JOptionPane;

public class FuncaoConverterQuilometros {

	public void converterKmParaMilhas(double valorRecebido) {
		double comprimentoMilhas = valorRecebido * 0.62137;
		comprimentoMilhas = (double) Math.round(comprimentoMilhas * 100d)/100;
		JOptionPane.showMessageDialog(null, "São " + comprimentoMilhas + " milhas de comprimento");
	}
	
	public void converterKmParaPes(double valorRecebido) {
		double comprimentoPes = valorRecebido * 3280.8;
		comprimentoPes = (double) Math.round(comprimentoPes + 100d)/100;
		JOptionPane.showMessageDialog(null, "São " + comprimentoPes + " Pés (ft) de comprimento");
	}
	
	public void converterKmParaAnosLuz(double valorRecebido) {
		double comprimentoAnosLuz = valorRecebido * 0.00000000000010570;
		comprimentoAnosLuz = (double) Math.round(comprimentoAnosLuz * 100d)/100;
		JOptionPane.showMessageDialog(null, "São " + comprimentoAnosLuz + "Anos Luz de comprimento");
	}
}
