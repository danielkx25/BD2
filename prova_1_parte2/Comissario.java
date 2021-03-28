package prova_1_parte2;
import java.util.ArrayList;

public class Comissario extends Tripulante{

	private ArrayList<String> idiomas= new ArrayList<String>();
	
	public void adicionaIdioma(String idioma) {
		this.idiomas.add(idioma);
		System.out.println("Idioma adicionado!");
	}
	public void imprimeIdiomas() {
		System.out.println("Idiomas:");
		for(String i:idiomas) {
			System.out.println(i);
		}
	}
	
	public void imprimeDados() {
		System.out.println("Id: "+this.getId());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Função: Comissário");
		System.out.println("Endereço: "+this.getEndereco());
		System.out.println("Telefone: "+this.getTelefone());
		System.out.println("Data de admissão: "+this.getDataAdmissao());
		this.imprimeIdiomas();
	}
}
