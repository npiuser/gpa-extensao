package ufc.quixada.npi.gpa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Parecer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private Posicionamento posicionamento;
	
	@Column(columnDefinition="TEXT")
	private String parecer;
	
	private Date dataAtribuicao;
	
	private Date dataRealizacao;
	
	@ManyToOne
	@JoinColumn(name="parecerista_id")
	private Pessoa responsavel;
	
	private Date prazo;
	
	@OneToOne
	private Documento arquivo;
	
	@OneToMany(mappedBy = "parecer")
	private List<Pendencia> pendencias;
	
	public Parecer() {
	}

	public Parecer(Posicionamento posicionamento, String parecer, Date dataAtribuicao, Date dataRealizacao,
			Pessoa responsavel, Date prazo, Documento arquivo) {
		super();
		this.posicionamento = posicionamento;
		this.parecer = parecer;
		this.dataAtribuicao = dataAtribuicao;
		this.dataRealizacao = dataRealizacao;
		this.responsavel = responsavel;
		this.prazo = prazo;
		this.arquivo = arquivo;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Posicionamento getPosicionamento() {
		return posicionamento;
	}

	public void setPosicionamento(Posicionamento posicionamento) {
		this.posicionamento = posicionamento;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public Date getDataAtribuicao() {
		return dataAtribuicao;
	}

	public void setDataAtribuicao(Date dataAtribuicao) {
		this.dataAtribuicao = dataAtribuicao;
	}

	public Date getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public Pessoa getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public List<Pendencia> getPendencias() {
		return pendencias;
	}

	public void setPendencias(List<Pendencia> pendencias) {
		this.pendencias = pendencias;
	}

	public Documento getArquivo() {
		return arquivo;
	}

	public void setArquivo(Documento arquivo) {
		this.arquivo = arquivo;
	}

	public enum Posicionamento{
		FAVORAVEL("Favorável"), NAO_FAVORAVEL("Não Favorável");
		private String descricao;
		private Posicionamento(String descricao){
			this.descricao=descricao;
		}
		public String getDescricao(){
			return this.descricao;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parecer other = (Parecer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
