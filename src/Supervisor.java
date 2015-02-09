import java.util.LinkedList;
import java.util.List;

public class Supervisor {
	
	
	private String nome;
	private List<String> telefones;
	private String matricula;
	
	public Supervisor(){
		
		this("Sem nome",new LinkedList<String>(),"Sem matricula");
	}
	
	public Supervisor(String nome,List<String>telefones,String matricula){
		
		this.nome = nome;
		this.telefones = telefones;
		this.matricula = matricula;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}
	
	
}

