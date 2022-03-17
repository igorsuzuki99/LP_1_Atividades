package loja;

public class Fornecedor {

	//atributos
	String nome;
	String estado;
	String cidade;
	int telefone;
	String email;
	
	//metodo construtor
	public Fornecedor(String nome, String estado, String cidade, int telefone, String email)
	{
		this.nome=nome;
		this.estado=estado;
		this.cidade=cidade;
		this.telefone=telefone;
		this.email=email;
	}
	
	//métodos de acesso aos atributos
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int novotelefone) {
		telefone=novotelefone;
	}
	
	// métodos -> ações
	
		public void anunciar() {
			System.out.println("anunciando ");
		}
		
		public void orcar() {
			System.out.println("realizando orçamento ");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//instanciando objts
		Fornecedor F1 = new Fornecedor("João", "SP", "Campinas", 30001234, "joão@gmail.com");
		F1.anunciar();
		
		Fornecedor F2 = new Fornecedor("Pedro", "MG", "Belo Horizonte", 30038888, "pedro@hotmail.com");
		F2.orcar();
		
		Fornecedor F3 = new Fornecedor("Henrique", "ES", "Vitória", 30302222, "Henrique@outlook.com");
		
	}

}