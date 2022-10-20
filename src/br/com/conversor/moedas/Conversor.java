package br.com.conversor.moedas;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		try {
			FuncaoConverterMoeda converterMoeda = new FuncaoConverterMoeda();
			FuncaoConverterTemperatura converterTemperatura = new FuncaoConverterTemperatura();
			FuncaoConverterQuilometros converterQuilometros = new FuncaoConverterQuilometros();

			while (true) {
				String options = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Conversor de moeda", "Conversor de temperatura", "Conversor de Quilometros" },
						"Escolha").toString();
				switch (options) {
				case "Conversor de moeda":
					String inputMoeda = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorMoeda = Double.parseDouble(inputMoeda);
					String optionsMoeda = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
							JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "Reais para Dolar", "Reais para Euro", "Reais para Libra Esterlina",
									"Reais para Peso Argentino", "Reais para Peso Chileno", "Reais para Kwanzas" },
							"Escolha").toString();
					switch (optionsMoeda) {
					case "Reais para Dolar":
						converterMoeda.converterReaisParaDolar(valorMoeda);
					}
					switch (optionsMoeda) {
					case "Reais para Euro":
						converterMoeda.converterReaisParaEuro(valorMoeda);
					}
					switch (optionsMoeda) {
					case "Reais para Libra Esterlina":
						converterMoeda.converterReaisParaLibras(valorMoeda);
					}
					switch (optionsMoeda) {
					case "Reais para Peso Argentino":
						converterMoeda.converterReaisParaPA(valorMoeda);
					}
					switch (optionsMoeda) {
					case "Reais para Peso Chileno":
						converterMoeda.converterReaisParaPC(valorMoeda);
					}
					switch (optionsMoeda) {
					case "Reais para Kwanzas":
						converterMoeda.converterReaisParaKwanza(valorMoeda);
						break;
					}
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
					break;
				case "Conversor de Quilometros":
					String inputQuilometros = JOptionPane.showInputDialog("Insira uma quilometragem para converter");
					double valorQuilometros = Double.parseDouble(inputQuilometros);
					String optionsQuilometros = JOptionPane.showInputDialog(null, "Escolha um comprimento", "Menu",
							JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Milhas", "Pes", "Anos Luz" }, "Escolha")
							.toString();
					switch(optionsQuilometros) {
					case "Milhas":
						converterQuilometros.converterKmParaMilhas(valorQuilometros);
					}
					switch(optionsQuilometros) {
					case "Pes":
						converterQuilometros.converterKmParaPes(valorQuilometros);
					}
					switch(optionsQuilometros) {
					case "Anos Luz":
						converterQuilometros.converterKmParaAnosLuz(valorQuilometros);
					}
					break;
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
