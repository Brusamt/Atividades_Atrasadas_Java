package br.edu.fatec.model;

public class Moto extends Veiculo{
	private int cv;
	
	public Moto (String placa, String modelo, String marca, int cv) {
		super(placa, modelo, marca);
		this.cv = cv;
	}
	
	public void grau() {
		System.out.println("Empinando a moto...");
	}   
	
	public int getCv() {
		return cv;
	}
	
	public void setCv(int cv) {
		this.cv = cv;
	}
	
	@Override
	public String toString() {
		return "Veículo: "
				+ "\n Placa: " + getPlaca()
				+ " | Modelo: " + getModelo()
				+ " | Marca: " + getMarca()
				+ "\n Moto: "
				+ "\n Potência: " + cv+"cv";
	}

	

	
	

}

