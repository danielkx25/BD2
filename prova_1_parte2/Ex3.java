package prova_1_parte2;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		int escolha=0,id=0,deu=0,horas=0,tipo=0,deu2=0;
		String nome, endereco, telefone, dataAdm, idioma="";
		ArrayList <Tripulante>  tripulantes = new ArrayList<Tripulante>();
		Tripulante tripulante;
		Piloto piloto;
		Copiloto copiloto;
		Comissario comissario;
		
		while(deu==0) {
			System.out.println("Escolha uma opção:");
			System.out.println("1-Adicionar Tripulante");
			System.out.println("2-Listar Tripulantes ");
			System.out.println("3-Encerrar sistema");
			escolha=new Scanner(System.in).nextInt();
			switch(escolha) {
			case 1:
				deu2=0;
				id++;
				System.out.println("Digite o nome do tripulante:");
				nome=new Scanner(System.in).nextLine();
				System.out.println("Digite o endereço do tripulante:");
				endereco=new Scanner(System.in).nextLine();
				System.out.println("Digite o telefone do tripulante:");
				telefone=new Scanner(System.in).nextLine();
				System.out.println("Digite a data de admissão do tripulante:");
				dataAdm=new Scanner(System.in).nextLine();
				System.out.println("Digite o tipo de tripulante:"
						+ "1-Piloto, 2-Copiloto, 3-Comissário");
				tipo=new Scanner(System.in).nextInt();
				switch(tipo) {
				case 1:
					System.out.println("Digite quantas horas de voo o piloto tem:");
					horas=new Scanner(System.in).nextInt();
					piloto = new Piloto();
					piloto.setId(id);
					piloto.setNome(nome);
					piloto.setEndereco(endereco);
					piloto.setTelefone(telefone);
					piloto.setDataAdmissao(dataAdm);
					piloto.setHorasConcluidas(horas);
					tripulantes.add(piloto);
					System.out.println("Piloto adicionado!");
					break;
				case 2:
					System.out.println("Digite quantas horas de voo acompanhadas o copiloto tem:");
					horas=new Scanner(System.in).nextInt();
					copiloto = new Copiloto();
					copiloto.setId(id);
					copiloto.setNome(nome);
					copiloto.setEndereco(endereco);
					copiloto.setTelefone(telefone);
					copiloto.setDataAdmissao(dataAdm);
					copiloto.setHorasAcompanhadas(horas);
					tripulantes.add(copiloto);
					System.out.println("Copiloto adicionado!");
					if(horas>3000) {
						System.out.println("************************************");
						System.out.println("Copiloto "+nome+" pode ser PROMOVIDO!");
						System.out.println("************************************");
					}
					break;
				case 3:
					comissario = new Comissario();
					System.out.println("Digite os idiomas dominados pelo comissário: "
							+ "Digite SAIR para terminar o cadastro");
					while(deu2==0) {
						System.out.println("Idioma:");
						idioma=new Scanner(System.in).nextLine();
						if(idioma.equals("SAIR")) {
							deu2++;
							break;
						}else {
							comissario.adicionaIdioma(idioma);
						}
					}
					comissario.setId(id);
					comissario.setNome(nome);
					comissario.setEndereco(endereco);
					comissario.setTelefone(telefone);
					comissario.setDataAdmissao(dataAdm);
					tripulantes.add(comissario);
					System.out.println("Comissário adicionado!");
						
					break;
				}
				break;
				
			case 2:
				System.out.println("Listando tripulantes...");
				for(Tripulante t:tripulantes) {
					t.imprimeDados();
					System.out.println("************************************");
					
				}
				break;
			case 3:
				System.out.println("Fim do programa!");
				deu++;
				break;
			}
		}

	}

}
