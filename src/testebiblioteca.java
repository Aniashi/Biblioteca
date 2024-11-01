public class testebiblioteca {
    public static void main(String[] args) {
		Pessoa alguem = new Pessoa("Aniel", 19);
		alguem.mostrardDados();
		Emprestimo livro = new Emprestimo(4415542, "10/02/2025");
		livro.mostrarDados();
		Livro nietzsche= new Livro("Quando Nietzsche chorou", "Romance");
		nietzsche.mostrarDados();
		
		

	}
}
