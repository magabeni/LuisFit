
public class ClasseAtleta extends ClassePessoa{

	String modalidade;
	
	public ClasseAtleta(int idPar, String nomePar, int idadePar,
			String modalidadePar){
		
		super(idPar, nomePar, idadePar);
		
		this.modalidade = modalidadePar;
	}
	
	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidadePar) {
		this.modalidade = modalidadePar;
	}
	@Override
	public void mostrarInformacoes(){
		System.out.println("Dados do Atleta");
		super.mostrarInformacoes();
		System.out.println("_______________");
	}
	
}
