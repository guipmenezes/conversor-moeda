package br.com.conversor.moedas;
import javax.swing.JOptionPane;

public class ConversorMoeda {
	
	public static void main(String[] args) {
		
		FuncaoConverter converter = new FuncaoConverter();
		
		while(true) {
			String options = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de moeda", "Conversor de temperatura"}, "Escolha").toString();
			switch(options)  {
				case "Conversor de moeda":
					String input = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(input);
					String optionsMoeda = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Reais para Dolar", "Reais para Euro", "Reais para Libra Esterlina", "Reais para Peso Argentino", "Reais para Peso Chileno"}, "Escolha").toString();
					switch(optionsMoeda) {
						case "Reais para Dolar":		
							converter.ConverterReaisParaDolar(valorRecebido);
					}
					switch(optionsMoeda) {
						case "Reais para Euro":
							converter.ConverterReaisParaEuro(valorRecebido);
					}
					switch(optionsMoeda) {
						case "Reais para Libra Esterlina":
							converter.ConverterReaisParaLibras(valorRecebido);
					}
					switch(optionsMoeda) {
						case "Reais para Peso Argentino":
							converter.ConverterReaisParaPA(valorRecebido);
					}
					switch(optionsMoeda) {
						case "Reais para Peso Chileno":
							converter.ConverterReaisParaPC(valorRecebido);
					}
					
					
			}
		}
	}
}
