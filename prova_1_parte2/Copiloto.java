package prova_1_parte2;

public class Copiloto extends Tripulante{

	private int horasAcompanhadas;

	public int getHorasAcompanhadas() {
		return horasAcompanhadas;
	}

	public void setHorasAcompanhadas(int horasAcompanhadas) {
		this.horasAcompanhadas = horasAcompanhadas;
	}
	
	public void imprimeDados() {
		System.out.println("Id: "+this.getId());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Fun��o: Copiloto");
		System.out.println("Endere�o: "+this.getEndereco());
		System.out.println("Telefone: "+this.getTelefone());
		System.out.println("Data de admiss�o: "+this.getDataAdmissao());
		System.out.println("Horas de voo acompanhadas: "+this.getHorasAcompanhadas());
		if(this.horasAcompanhadas > 3000) {
			System.out.println("OBS: Copiloto j� possui mais de 3000 horas e pode ser PROMOVIDO.");
		}
	}
	
}
