package prova_1_parte2;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int escolha=0, deu=0, peso=0,capacidade=0,andares=0;
		System.out.println("Quantos andares tem o prédio?");
		andares=new Scanner(System.in).nextInt();
		System.out.println("Qual a capacidade máxima em kilos do elevador?");
		capacidade=new Scanner(System.in).nextInt();
		Predio predio= new Predio(capacidade,0,andares);
		System.out.println("Bem-vindo ao sistema de elevador!");
		System.out.println("Atualemente estamos no Térreo e temos 0 pessoas");
		while(deu != 5) {
			System.out.println("Escolha a operação desejada:");
			System.out.println("1-Entrada de uma pessoa");
			System.out.println("2-Saida de uma pessoa");
			System.out.println("3-Subir um andar");
			System.out.println("4-Descer um andar");
			System.out.println("5-Terminar o programa");
			escolha = new Scanner(System.in).nextInt();
			switch(escolha) {
			case 1:
				System.out.println("Por favor digite quantos kilos a pessoa que vai entrar tem:");
				peso=new Scanner(System.in).nextInt();
				predio.entraPessoa(peso);
				break;
			
			case 2:
				System.out.println("Por favor digite quantos kilos a pessoa que vai sair tem:");
				peso=new Scanner(System.in).nextInt();
				predio.saiPessoa(peso);
				break;
			case 3:
				predio.sobeAndar();
				break;
			case 4:
				predio.desceAndar();
				break;
			case 5:
				deu=5;
				System.out.println("Finalizado!");
				break;
			} 
			
		}
	}

}
