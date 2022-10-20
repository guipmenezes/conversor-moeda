package br.com.conversor.moedas;

import javax.swing.JOptionPane;

public class ConversorMoeda {

	public static void main(String[] args) {

		try {
			FuncaoConverterMoeda converterMoeda = new FuncaoConverterMoeda();
			FuncaoConverterTemperatura converterTemperatura = new FuncaoConverterTemperatura();

			while (true) {
				String options = JOptionPane
						.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] { "Conversor de moeda", "Conversor de temperatura" }, "Escolha")
						.toString();
				switch (options) {
				case "Conversor de moeda":
					String inputMoeda = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(inputMoeda);
					String optionsMoeda = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
							JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "Reais para Dolar", "Reais para Euro", "Reais para Libra Esterlina",
									"Reais para Peso Argentino", "Reais para Peso Chileno", "Reais para Kwanzas" },
							"Escolha").toString();
					switch (optionsMoeda) {
					case "Reais para Dolar":
						converterMoeda.ConverterReaisParaDolar(valorRecebido);
					}
					switch (optionsMoeda) {
					case "Reais para Euro":
						converterMoeda.ConverterReaisParaEuro(valorRecebido);
					}
					switch (optionsMoeda) {
					case "Reais para Libra Esterlina":
						converterMoeda.ConverterReaisParaLibras(valorRecebido);
					}
					switch (optionsMoeda) {
					case "Reais para Peso Argentino":
						converterMoeda.ConverterReaisParaPA(valorRecebido);
					}
					switch (optionsMoeda) {
					case "Reais para Peso Chileno":
						converterMoeda.ConverterReaisParaPC(valorRecebido);
					}
					switch (optionsMoeda) {
					case "Reais para Kwanzas":
						converterMoeda.ConverterReaisParaKwanza(valorRecebido);
						break;
					}
				default:
					break;
				case "Conversor de temperatura":
					String inputTemperatura = JOptionPane.showInputDialog("Insira uma temperatura em Celsius");
					double valorTemperatura = Double.parseDouble(inputTemperatura);
					String optionsTemperatura = JOptionPane.showInputDialog(null, "Escolha uma escala", "Menu",
							JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Kelvin", "Fahrenheit" }, "Escolha")
							.toString();
					switch (optionsTemperatura) {
					case "Kelvin":
						converterTemperatura.converterCelsiusParaKelvin(valorTemperatura);
					}
					switch (optionsTemperatura) {
					case "Fahrenheit":
						converterTemperatura.converterCelsiusParaFahrenheit(valorTemperatura);
					}
				}
				switch (JOptionPane.showConfirmDialog(null, "Deseja continuar", "Informação", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE)) {
				case 1:
					JOptionPane.showMessageDialog(null, "Programa se encerrando");
					throw new RuntimeException();
				}

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Programa encerrado");
		}
	}
}
