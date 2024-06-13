package br.edu.fatec.model;

public class Carro extends Veiculo{
	private boolean tetoSolar;
	private boolean tracaoDianteira;
	
	public Carro(String placa, String modelo, String marca, boolean tetoSolar, boolean tracaoDianteira) {
		super(placa, modelo, marca);
		this.tetoSolar = tetoSolar;
		this.tracaoDianteira = tracaoDianteira;
	}
	
	public void drift() {
		if( tracaoDianteira == true) {
			System.out.println("Pneu cantou!");
		}else {
			System.out.println("é necessário carro com tração dianteira para fazer Drift");
		}
	}
	
	public boolean getTetosolar() {
		return tetoSolar;
	}
	
	public void setTetosolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
	@Override
	public String toString() {
		return "Veículo: "
				+ "\n Placa: " + getPlaca()
				+ " | Modelo: " + getModelo()
				+ " | Marca: " + getMarca()
				+ "\n Carro: "
				+ "\n Teto solar: " + tetoSolar
				+ " | Tração Dianteira: " + tracaoDianteira;
	}

}
