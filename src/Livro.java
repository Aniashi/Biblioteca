public class Livro {
    private String titulo;
	private String categoria;
	
	Livro(){}
	Livro(String titulo, String categoria){
		this.titulo = titulo;
		this.categoria = categoria;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void mostrarDados() {
		System.out.println("Titulo do livro: "+this.titulo);
		System.out.println("Categoria do livro: "+this.categoria);
	}

}

