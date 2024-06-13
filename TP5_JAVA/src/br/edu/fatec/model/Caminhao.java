package br.edu.fatec.model;

public class Caminhao extends Veiculo {
	private double capacidade_carga;
	
	public Caminhao(String placa, String modelo, String marca, double capacidade_carga) {
		super(placa, modelo, marca);
		this.capacidade_carga = capacidade_carga;
	}
	
	public Double getCarga() {
		return capacidade_carga;
	}
	
	public void setCarga(Double capacidade_carga) {
		this.capacidade_carga = capacidade_carga;
	}
	
	public void acoplarReboque() {
		System.out.println("O caminhão acoplou um reboque!");
	}
	
	@Override
	public String toString() {
		return "Véiculo: "
				+ "\n Placa: " + getPlaca()
				+ " | Modelo: " + getModelo()
				+ " | Marca: " + getMarca()
				+ "\n Caminhão: "
				+ "Capacidade de carga: " + capacidade_carga+"Kg";
	}

}
