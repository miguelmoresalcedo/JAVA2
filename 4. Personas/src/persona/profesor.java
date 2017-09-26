package persona;

public class profesor extends persona{
	
	protected int numeroAsig;
	protected boolean tutor;
	
	
	public profesor(String dNI, String nombre, String apellido, double salario, int numeroAsig, boolean tutor) {
		super(dNI, nombre, apellido, salario);
		this.numeroAsig = numeroAsig;
		this.tutor = tutor;
	}


	protected int getNumeroAsig() {
		return numeroAsig;
	}


	protected void setNumeroAsig(int numeroAsig) {
		this.numeroAsig = numeroAsig;
	}


	protected boolean isTutor() {
		return tutor;
	}


	protected void setTutor(boolean tutor) {
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		return "profesor [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ ", numeroAsig=" + numeroAsig + ", tutor=" + tutor + "]";
	}

	

	
	
	

}
