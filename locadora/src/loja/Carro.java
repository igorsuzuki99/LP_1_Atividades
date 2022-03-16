
package loja;

public class Carro {

	// atributos da classe -> características
	
	private String placa;
	private double potencia;
	private String modelo;
	private String cor;
	private String marca;
	private boolean cambio_automatico;
	private int ano;
	private float preco;
	
	//método construtor executado apenas no ato da instancia
	
	public Carro(String plac, double poten, String modelo, String cor, 
			String marca, boolean cambio_automatico, int ano) 
	{
		placa=plac;
		potencia=poten;
		//this necessario quando nomes iguais de atributos e argumentos
		this.modelo=modelo; 
		this.cor=cor;
		this.cambio_automatico=cambio_automatico;
		this.ano=ano;
		this.marca=marca;

	}
	
	//métodos de acesso aos atributos
	public float getPreco() {
		return preco;
	}
	public void setPreco(float novopreco) {
		preco=novopreco;
	}
	
	// métodos -> ações
	
	public void andar() {
		System.out.println("andando");
	}
	
	public boolean frear() {
		System.out.println("freando");
		return true;
	}
	
	public void correr(int velocidade) {
		System.out.println("Estou correndo "+velocidade +"km/h");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando objetos da classe
		Carro C1 = new Carro("FDG6980", 1.6, "Fiesta", "prata", 
				"Ford", true, 2015); 
		
		//declarei e dps instanciei o objt
		Carro C2;
		C2 = new Carro("FVM8075", 2.0, "Gol", "branco", 
				"VW", false, 2012);
	}
	
}