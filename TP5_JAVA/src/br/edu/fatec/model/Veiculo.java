package br.edu.fatec.model;

public class Veiculo {
	private String placa;
	private String modelo;
	private String marca;
	
	public Veiculo(String placa, String modelo, String marca) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ligar() {
		System.out.println("Ligando....");
		System.out.println("Ligado!");
	}
	
	public void desligar() {
		System.out.println("Desligando...");
		System.out.println("Desligado!");
	}
	
	
	@Override
	public String toString() {
		return "Véiculo: "
			  +"\n Placa: " + placa
			  +" | Modelo: " + modelo
			  +" | Marca: " + marca;
	}

}
