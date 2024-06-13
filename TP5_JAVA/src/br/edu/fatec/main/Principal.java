package br.edu.fatec.main;
import br.edu.fatec.model.*;

public class Principal {

	public static void main(String[] args) {
		
	
		Moto Moto1 = new Moto ("aaa-aaaa", "Dr160", "Haojue", 15 );
		System.out.println(Moto1);
	      Moto1.ligar();
	      Moto1.desligar();
	      Moto1.grau();
	      
	      Carro carro = new Carro("aaa-aaaa", "Civic", "Honda", true, true);
	      System.out.println("___________________________________________________");
	      System.out.println(carro);
	      carro.ligar();
	      carro.drift();
	      carro.desligar();
	      
	      
	      
	      Caminhao caminhao = new Caminhao("aaa-aaaa", "FH 540", "Volvo", 200);
	      System.out.println("___________________________________________________");
	      System.out.println(caminhao);
	      caminhao.ligar();
	      caminhao.acoplarReboque();
	      caminhao.desligar();
	      

	}

}
