package prova_1_parte2;

public class Piloto extends Tripulante{
	
	private int horasConcluidas;

	public int getHorasConcluidas() {
		return horasConcluidas;
	}

	public void setHorasConcluidas(int horasConcluidas) {
		this.horasConcluidas = horasConcluidas;
	}
	
	public void imprimeDados() {
		System.out.println("Id: "+this.getId());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Função: Piloto");
		System.out.println("Endereço: "+this.getEndereco());
		System.out.println("Telefone: "+this.getTelefone());
		System.out.println("Data de admissão: "+this.getDataAdmissao());
		System.out.println("Horas de voo concluídas: "+this.getHorasConcluidas());
		
	}
	

}
