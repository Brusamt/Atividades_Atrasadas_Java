package br.edu.fatec.tp.main;
import java.util.Scanner;

import br.edu.fatec.tp.abstracao.Carro;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		      Scanner ler = new Scanner(System.in);
		      double vel;
		      String respCarro;

		      System.out.println("Digite as informações do seu carro:");

		      System.out.print("Marca: ");
		      String marca = ler.nextLine();

		      System.out.print("Modelo: ");
		      String modelo = ler.nextLine();

		      System.out.print("Placa: ");
		      String placa = ler.nextLine();

		      System.out.print("Motor: ");
		      String motor = ler.nextLine();

		      System.out.print("Chassi: ");
		      String chassi = ler.nextLine();

		      Carro meuCarro = new Carro(marca, modelo, placa, chassi, motor);

		     
		      System.out.println(" 1 - Ligar carro | 2 - Sair do carro | 3 - Abastecer");
		      int resp = ler.nextInt();
		      ler.nextLine();

		      if (resp == 1){
		         meuCarro.girarChave();
		         while (meuCarro.estado) {
	
		            System.out.println("Velocidade Atual: " + meuCarro.velAtual);
		            System.out.println(" 'A' - Acelerar | 'F' - Freiar: | 'B' Buzinar: | '0' Desligar:");
		            respCarro = ler.nextLine();

		            switch (respCarro.toUpperCase()) {
		               case "A":
		                  System.out.print("Km/h: ");
		                  vel = ler.nextDouble();
		                  ler.nextLine();
		                  meuCarro.acelerar(vel);
		                  break;
		               case "F":
		                  System.out.print("KM: ");
		                  vel = ler.nextDouble();
		                  ler.nextLine();
		                  meuCarro.desacelerar(vel);
		                  break;
		               case "B":
		                  meuCarro.buzinar();
		                  break;
		               case "0":
		                  meuCarro.girarChave();
		                  break;
		               default:
		                  return;
		            }
		         }
		      } else if (resp == 2){
		         return;
		      } else if (resp == 3){
		         System.out.println("Digite o valor do Litro: ");
		         double valorGasolina = ler.nextDouble();
		         meuCarro.abastecer(valorGasolina);
	

	}

	}
}
