package br.com.fiapride.model;

public class Veiculos {
	private String individuo;
	private String placa;
	private double gasolina;
	
	public Veiculos(String individuo, String placa) {
		this.setIndividuo(individuo);
		this.setPlaca(placa);
		this.setGasolina(0.0);
	}
	
	public void adicionarGasolina(double volume) {
		// Regra de negócio : volume deve ser positivo
		if(volume <= 0.0) {
			System.out.println("Quantidade de volume inválido!");
			return;
		}
		gasolina+=volume;
		System.out.println("Gasolina adiciona com sucesso. Gasolina atual: " + this.gasolina);
	}
	
	public void gastarGasolina(double volume) {
		// Regra de negócio: O volume deve ser positivo e a gasolina deve ser suficiente
		if(volume <= 0.0) {
			System.out.println("Quantidade de volume inválido!");
			return;
		}
		if(this.gasolina < volume) {
			 System.out.println("Erro: gasolina insuficiente.");
	         return;	
		}
		gasolina -= volume;
		System.out.println("Gasolina restante: " + this.gasolina);
	}
	
	public String getIndividuo() {
		return this.individuo;
	}
	
	private void setIndividuo(String individuo) {
		this.individuo = individuo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	private void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public double getGasolina() {
		return this.gasolina;
	}
	
	private void setGasolina(double volume) {
		if(volume >= 0) {
			this.gasolina = volume;
		}else {
			System.out.println("Erro de Segurança: Tentativa de definir valor negativo bloqueada!");
		}
	}

}
