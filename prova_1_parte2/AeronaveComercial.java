package prova_1_parte2;

public class AeronaveComercial extends Aeronave{

	private int passageirosMax;
	private int passageirosEcon;
	private int passageirosExec;
	
	
	public int getPassageirosMax() {
		return passageirosMax;
	}
	public void setPassageirosMax(int passageirosMax) {
		this.passageirosMax = passageirosMax;
	}
	public int getPassageirosEcon() {
		return passageirosEcon;
	}
	public void setPassageirosEcon(int passageirosEcon) {
		this.passageirosEcon = passageirosEcon;
	}
	public int getPassageirosExec() {
		return passageirosExec;
	}
	public void setPassageirosExec(int passageirosExec) {
		this.passageirosExec = passageirosExec;
	}
	public void imprimeDados() {
		System.out.println("Máximo de passageiros: "+this.passageirosMax);
		System.out.println("Passageiros na economica: "+this.passageirosEcon);
		System.out.println("Passageiros na executiva: "+this.passageirosExec);
	}
	
}
