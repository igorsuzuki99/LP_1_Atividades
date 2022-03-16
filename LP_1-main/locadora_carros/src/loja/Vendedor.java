package loja;

public class Vendedor {
	//atributos
	String nome;
	int codigo;
	int telefone;
	String email;
	float salario;
	
	//metodo construtor
	public Vendedor(String nome, int codigo, int telefone, String email, float salario)
	{
		this.nome=nome;
		this.codigo=codigo;
		this.telefone=telefone;
		this.email=email;
		this.salario=salario;
	}	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			//instanciando objts
			Vendedor V1 = new Vendedor("Matheus", 12345, 39421258, "matheus@gmail.com", 2000);
			
			Vendedor V2 = new Vendedor("Débora", 54321, 32104587, "debora@gmail.com", 2500);
			
			Vendedor V3 = new Vendedor("Giovana", 12121, 32564509, "giovana@hotmail.com", 3000);
			System.out.println(V1.nome + " " + V3.codigo);
	}

}
