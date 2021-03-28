package prova_1_parte2;

public class Predio implements Elevador{
	private int andarAtual;
	private int numAndares;
	private int capacElevador;
	private int pessoasElevador;
	private int pesoTotal;
	
	public Predio(int capacElevador, int pessoasElevador, int numAndares) {
		this.capacElevador=capacElevador;
		this.pessoasElevador=pessoasElevador;
		this.numAndares=numAndares;
	}
	
	
	public int getPesoTotal() {
		return pesoTotal;
	}


	public void setPesoTotal(int pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getNumAndares() {
		return numAndares;
	}
	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}
	public int getCapacElevador() {
		return capacElevador;
	}
	public void setCapacElevador(int capacElevador) {
		this.capacElevador = capacElevador;
	}
	public int getPessoasElevador() {
		return pessoasElevador;
	}
	public void setPessoasElevador(int pessoasElevador) {
		this.pessoasElevador = pessoasElevador;
	}
	
	public void entraPessoa(int peso) {
		if((this.pesoTotal + peso)<=this.capacElevador) {
			this.pesoTotal = this.pesoTotal + peso;
			this.pessoasElevador++;
			System.out.println("Entrou uma pessoa");
			System.out.println("Há "+this.pessoasElevador+" pessoas no elevador");
		}else {
			System.out.println("O elevador está cheio, espere a próxima viagem");
		}
		
	}
	
	public void saiPessoa(int peso) {
		if((this.pesoTotal - peso)>=0 && this.pessoasElevador>0) {
			this.pesoTotal = this.pesoTotal - peso;
			this.pessoasElevador = this.pessoasElevador-1;
			System.out.println("Saiu uma pessoa");
			System.out.println("Há "+this.pessoasElevador+" pessoas no elevador");
		}else {
			System.out.println("Peso digitado é incorreto ou não há mais pessoas para saírem");
		}
	}
	
	public void sobeAndar() {
		if(this.andarAtual==this.numAndares) {
			System.out.println("Já estamos no último andar");
		}else {
			this.andarAtual++;
			System.out.println("Subindo ^");
			System.out.println("Andar "+this.andarAtual);
		}
	}
	
	public void desceAndar() {
		if(this.andarAtual==0) {
			System.out.println("Já estamos no térreo e não há subterrâneo");
		}else {
			this.andarAtual--;
			System.out.println("Descendo v");
			System.out.println("Andar "+this.andarAtual);
		}
	}
	
	
	
}
