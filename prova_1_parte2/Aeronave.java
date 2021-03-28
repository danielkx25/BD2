package prova_1_parte2;

public class Aeronave {

	private int id;
	private String modelo;
	private int potMotores;
	private int autonomia;
	private String origem;
	private String destino;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotMotores() {
		return potMotores;
	}
	public void setPotMotores(int potMotores) {
		this.potMotores = potMotores;
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void imprimeDadosPrimarios() {
		System.out.println("Identificação: "+this.getId());
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Autonomia: "+this.getAutonomia()+"km");
		System.out.println("Potência: "+this.getPotMotores()+"kg de empuxo");
		System.out.println("Veio de: "+this.getOrigem());
		System.out.println("Vai para: "+this.getDestino());
	}
	
}
