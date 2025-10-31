
public class ClasseTerinador extends ClassePessoa{

	String especialidade;
	
	public ClasseTerinador(int idPar, String nomePar, int idadePar,
			String especialidadePar){
		
		super(idPar, nomePar, idadePar);
		
		this.especialidade = especialidadePar;
	}
	
	public void setEspecialidade(String especialidadePar){
		this.especialidade = especialidadePar;
	}
	
	public String getEspecialidade(){
		return especialidade;
	}
	@Override
	public void mostrarInformacoes(){
		System.out.println("Dados de Treinador");
		super.mostrarInformacoes();
		System.out.println("__________________");
	}
}
