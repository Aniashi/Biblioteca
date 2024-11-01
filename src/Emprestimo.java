public class Emprestimo {
    private int matricula;
	private String prazo;
	
	
	Emprestimo(){}
	Emprestimo(int matricula, String prazo){
		this.matricula = matricula;
		this.prazo = prazo;
	}
	

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getPrazo() {
		return prazo;
	}
	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}
	public void mostrarDados() {
		System.out.println("Número da matricula: "+this.matricula);
		System.out.println("Prazo para entrega: "+this.prazo);
	}
}