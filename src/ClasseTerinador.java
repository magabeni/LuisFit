
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
}
