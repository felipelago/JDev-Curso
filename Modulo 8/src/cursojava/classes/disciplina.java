package cursojava.classes;

public class disciplina {
	private Double nota1;
	private String disciplina1;
	private Double nota2;
	private String disciplina2;
	private Double nota3;
	private String disciplina3;
	private Double nota4;
	private String disciplina4;
	
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public Double getNota4() {
		return nota4;
	}
	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}
	public String getDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina1 == null) ? 0 : disciplina1.hashCode());
		result = prime * result + ((disciplina2 == null) ? 0 : disciplina2.hashCode());
		result = prime * result + ((disciplina3 == null) ? 0 : disciplina3.hashCode());
		result = prime * result + ((disciplina4 == null) ? 0 : disciplina4.hashCode());
		result = prime * result + ((nota1 == null) ? 0 : nota1.hashCode());
		result = prime * result + ((nota2 == null) ? 0 : nota2.hashCode());
		result = prime * result + ((nota3 == null) ? 0 : nota3.hashCode());
		result = prime * result + ((nota4 == null) ? 0 : nota4.hashCode());
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
		disciplina other = (disciplina) obj;
		if (disciplina1 == null) {
			if (other.disciplina1 != null)
				return false;
		} else if (!disciplina1.equals(other.disciplina1))
			return false;
		if (disciplina2 == null) {
			if (other.disciplina2 != null)
				return false;
		} else if (!disciplina2.equals(other.disciplina2))
			return false;
		if (disciplina3 == null) {
			if (other.disciplina3 != null)
				return false;
		} else if (!disciplina3.equals(other.disciplina3))
			return false;
		if (disciplina4 == null) {
			if (other.disciplina4 != null)
				return false;
		} else if (!disciplina4.equals(other.disciplina4))
			return false;
		if (nota1 == null) {
			if (other.nota1 != null)
				return false;
		} else if (!nota1.equals(other.nota1))
			return false;
		if (nota2 == null) {
			if (other.nota2 != null)
				return false;
		} else if (!nota2.equals(other.nota2))
			return false;
		if (nota3 == null) {
			if (other.nota3 != null)
				return false;
		} else if (!nota3.equals(other.nota3))
			return false;
		if (nota4 == null) {
			if (other.nota4 != null)
				return false;
		} else if (!nota4.equals(other.nota4))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "disciplina [nota1=" + nota1 + ", disciplina1=" + disciplina1 + ", nota2=" + nota2 + ", disciplina2="
				+ disciplina2 + ", nota3=" + nota3 + ", disciplina3=" + disciplina3 + ", nota4=" + nota4
				+ ", disciplina4=" + disciplina4 + "]";
	}
	
	
	
}