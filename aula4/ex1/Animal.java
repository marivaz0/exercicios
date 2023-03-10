package edu.br.marielle.aula4.ex1;

/*Crie uma classe Animal que obedeça à seguinte descrição: possua os atributos nome (String), comprimento (float), número de patas (int), cor (String), ambiente (String) e velocidade média (float).
Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos de classe.
Encapsule os atributos.
Crie um método verDados, sem parâmetros e do tipo void, que, quando chamado, imprime na tela os dados do animal.
Crie uma classe Teste, com o método main, crie um objeto da classe Animal, atribua valores aos seus atributos e chame o método verDados.*/

public class Animal {
	private String nome, cor, ambiente;
	private float comprimento, vel_media;
	private int numero_patas;
	
	public Animal(String nome, String cor, String ambiente, float comprimento, float vel_media, int numero_patas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.vel_media = vel_media;
		this.numero_patas = numero_patas;
	}
	
	
	
	public void verDados() {
		System.out.println("Nome: " + this.nome + "\nComprimento: " + this.comprimento + " cm");
		System.out.println("Número de patas: " + this.numero_patas + "\nCor: " + this.cor);
		System.out.println("Ambiente: " + this.ambiente + "\nVelocidade Média: " + this.vel_media + " m/s");
	}
	
	/* Generate - toString()
	   a1.toString()
	@Override
	public String toString() {
		return "Animal \n nome=" + nome + " \n cor=" + cor + "\n ambiente=" + ambiente + "\n comprimento=" + comprimento
				+ "\n vel_media=" + vel_media + "\n numero_patas=" + numero_patas;
	}*/

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getVel_media() {
		return vel_media;
	}
	public void setVel_media(float vel_media) {
		this.vel_media = vel_media;
	}
	public int getNumero_patas() {
		return numero_patas;
	}
	public void setNumero_patas(int numero_patas) {
		this.numero_patas = numero_patas;
	}
}
