package prova_1_parte2;

import java.util.ArrayList;

public class AeronaveCarga extends Aeronave{

	private int capacidade;
	private String tipoProduto;
	ArrayList <Produto> produtos = new ArrayList<Produto>();
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public void imprimeDados() {
		System.out.println("Capacidade: "+this.capacidade+"Kg");
		System.out.println("Tipo de produto: "+this.tipoProduto);
	}
	public void adicionaCarga(Produto produto) {
		this.produtos.add(produto);
		System.out.println("Produto adicionado!");
	}
	public void imprimeCarga() {
		System.out.println("Listando produtos desse avião...");
		for(Produto p:produtos) {
			System.out.println("Nome: "+p.getNome());
			System.out.println("Peso: "+p.getPeso()+"Kg");
			System.out.println("Destinatario: "+p.getDestinatario());
			System.out.println("*************************************************");
		}
	}
	
}
