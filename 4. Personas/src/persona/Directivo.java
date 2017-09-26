package persona;

public class Directivo extends persona{
	protected boolean Salesiano;
	protected char MañanaTarde;
	
	
	public Directivo(String dNI, String nombre, String apellido, double salario, boolean salesiano, char mañanaTarde) {
		super(dNI, nombre, apellido, salario);
		Salesiano = salesiano;
		MañanaTarde = mañanaTarde;
	}


	protected boolean isSalesiano() {
		return Salesiano;
	}


	protected void setSalesiano(boolean salesiano) {
		Salesiano = salesiano;
	}


	protected char getMañanaTarde() {
		return MañanaTarde;
	}


	protected void setMañanaTarde(char mañanaTarde) {
		MañanaTarde = mañanaTarde;
	}


	@Override
	public String toString() {
		return "Directivo [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ ", Salesiano=" + Salesiano + ", MañanaTarde=" + MañanaTarde + "]";
	}
	
	
	
	

}
