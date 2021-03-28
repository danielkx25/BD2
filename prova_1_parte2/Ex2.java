package prova_1_parte2;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex2 {

	public static void main(String args[]) {
	int deu=0,escolha=0,tipoAero=0,pessMax=0,pessExe=0,pessEco=0;
	int deu2=0,capacidade=0,id=0,potencia=0,autonomia=0,deu3=0;
	String tipoProd, origem, destino,modelo, temp;
	ArrayList <AeronaveComercial> aeronavesCom = new ArrayList<AeronaveComercial>();
	ArrayList <AeronaveCarga> aeronavesCarga = new ArrayList<AeronaveCarga>();
	AeronaveComercial aeronaveCom;
	AeronaveCarga aeronaveCarga;
	Produto produto = new Produto();
	
	System.out.println("Bem-Vindo ao sistema de cadastro de aeronaves!");
	while(deu !=4) {
		System.out.println("Escolha uma opção:");
		System.out.println("1-Adicionar aeronave");
		System.out.println("2-Listar aeronaves comerciais");
		System.out.println("3-Listar aeronaves de carga e produtos");
		System.out.println("4-Terminar o programa");
		escolha=new Scanner(System.in).nextInt();
		switch(escolha) {
		case 1:
			deu2=0;
			deu3=0;
			System.out.println("Digite o número de identificação aeronave:");
			id=new Scanner(System.in).nextInt();
			System.out.println("Digite o modelo da aeronave:");
			modelo=new Scanner(System.in).nextLine();
			System.out.println("Digite a potência da aeronave:");
			potencia=new Scanner(System.in).nextInt();
			System.out.println("Digite a autonomia da aeronave:");
			autonomia=new Scanner(System.in).nextInt();
			System.out.println("Digite a origem aeronave:");
			origem=new Scanner(System.in).nextLine();
			System.out.println("Escolha o destino da aeronave:");
			destino=new Scanner(System.in).nextLine();
			System.out.println("Digite 1 para aeronave Comercial e 2 para aeronave de Carga");
			tipoAero=new Scanner(System.in).nextInt();
			if(tipoAero==1) {
				System.out.println("Qual o máximo de pessoas na aeronave?");
				pessMax=new Scanner(System.in).nextInt();
				while(deu2==0) {
					System.out.println("Quantas pessoas estão na classe executiva?");
					pessExe=new Scanner(System.in).nextInt();
					System.out.println("Quantas pessoas estão na classe economica?");
					pessEco=new Scanner(System.in).nextInt();
					if(pessExe+pessEco > pessMax) {
						System.out.println("A soma das duas classes não pode ser maior que o máximo!"
								+ "Tente novamente...");
					}else {
						deu2++;
					}
				}
				aeronaveCom=new AeronaveComercial();
				aeronaveCom.setId(id);
				aeronaveCom.setModelo(modelo);
				aeronaveCom.setAutonomia(autonomia);
				aeronaveCom.setPotMotores(potencia);
				aeronaveCom.setOrigem(origem);
				aeronaveCom.setDestino(destino);
				aeronaveCom.setPassageirosMax(pessMax);
			    aeronaveCom.setPassageirosExec(pessExe);
			    aeronaveCom.setPassageirosEcon(pessEco);
			    aeronavesCom.add(aeronaveCom);
			    System.out.println("Aeronave de passageiros inserida!");
			}
			if(tipoAero==2) {
				System.out.println("Qual o máximo de peso suportado pela aeronave?");
				capacidade=new Scanner(System.in).nextInt();
				System.out.println("Qual o tipo de produto transportado pela aeronave?");
				tipoProd=new Scanner(System.in).nextLine();
				aeronaveCarga=new AeronaveCarga();
				aeronaveCarga.setId(id);
				aeronaveCarga.setModelo(modelo);
				aeronaveCarga.setAutonomia(autonomia);
				aeronaveCarga.setPotMotores(potencia);
				aeronaveCarga.setOrigem(origem);
				aeronaveCarga.setDestino(destino);
				aeronaveCarga.setCapacidade(capacidade);
				aeronaveCarga.setTipoProduto(tipoProd);
				while(deu3==0) {
					System.out.println("Qual o nome do produto? Digite SAIR "
							+ "para terminar o cadastro");
					temp = new Scanner(System.in).nextLine();
					if(temp.equals("SAIR")) {
						deu3++;
						break;
					}else {
						produto = new Produto();
						produto.setNome(temp);
					}
					System.out.println("Qual o peso do produto?");
					produto.setPeso(new Scanner(System.in).nextFloat());
					System.out.println("Qual o destinatário do produto?");
					produto.setDestinatario(new Scanner(System.in).nextLine());
					aeronaveCarga.adicionaCarga(produto);
				}
				aeronavesCarga.add(aeronaveCarga);
				System.out.println("Aeronave de carga e produtos inseridos!");
			}
			
			break;
		
		case 2:
			System.out.println("Listando aeronaves de passageiros...");
			for(AeronaveComercial ac:aeronavesCom) {
				ac.imprimeDadosPrimarios();
				ac.imprimeDados();
				System.out.println("-----------------------------------------");
			}
			break;
		
		case 3:
			System.out.println("Listando aeronaves de carga...");
			for(AeronaveCarga ac:aeronavesCarga) {
				ac.imprimeDadosPrimarios();
				ac.imprimeDados();
				ac.imprimeCarga();
				System.out.println("-----------------------------------------");
			}
			break;
		
		}
	}
	}
}

