package lojinha;


public class Carro {
        //atributos
    private String placa;
	private String potencia;
	private String modelo;
	private String cor;
	private String marca;
	private String ano;
	private String preco;
        
    
    //construtor

    public Carro(String placa, String potencia, String modelo, String cor, String marca, String ano, String preco) {
        this.placa = placa;
        this.potencia = potencia;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }
    
    //métodos de acesso

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    


}
