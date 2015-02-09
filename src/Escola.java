
public class Escola {
	
	private Integer qtTurmas;
	private String nome;
	private Integer qtAlunos;
	private String sigla;
	private Integer qtFuncionarios;
	private Integer ID;
	private Endereco endereco;
	
	public Escola(){
		
		this("Sem nome",0,0,"Sem sigla",0,-1,new Endereco());
	
	}
	
	public Escola(String nome,Integer qtTurmas,Integer qtAlunos,String sigla,Integer qtFuncionarios, 
		Integer ID, Endereco endereco){
		
		this.nome = nome;
		this.qtTurmas = qtTurmas;
		this.qtAlunos = qtAlunos;
		this.sigla = sigla;
		this.qtFuncionarios = qtFuncionarios;
		this.ID = ID;
		this.endereco = endereco;
	}

	public Integer getQtTurmas() {
		return qtTurmas;
	}

	public void setQtTurmas(Integer qtTurmas) {
		this.qtTurmas = qtTurmas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtAlunos() {
		return qtAlunos;
	}

	public void setQtAlunos(Integer qtAlunos) {
		this.qtAlunos = qtAlunos;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Integer getQtFuncionarios() {
		return qtFuncionarios;
	}

	public void setQtFuncionarios(Integer qtFuncionarios) {
		this.qtFuncionarios = qtFuncionarios;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
