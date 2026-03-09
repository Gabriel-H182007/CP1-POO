package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculos veiculo1 = new Veiculos("Carlos", "ABC-1234");
		veiculo1.adicionarGasolina(50);
		veiculo1.gastarGasolina(100);
		System.out.println("Dono: " + veiculo1.getIndividuo() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getGasolina());

		

	}

}
