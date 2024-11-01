public class Pessoa {
    private String nome;
	private int idade;
	
	Pessoa(){}
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void mostrardDados() {
		System.out.println("Nome da pessoa que está alugando: "+this.nome);
		System.out.println("Idade da pessoa: "+this.idade);
	}

}

