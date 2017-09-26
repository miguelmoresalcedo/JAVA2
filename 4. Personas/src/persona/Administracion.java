package persona;

public class Administracion extends persona{
	
	protected char genero;
	protected int extras;
	
	
	Administracion(String dNI, String nombre, String apellido, double salario, char genero, int extras) {
		super(dNI, nombre, apellido, salario);
		this.genero = genero;
		this.extras = extras;
	}


	protected char getGenero() {
		return genero;
	}


	protected void setGenero(char genero) {
		this.genero = genero;
	}


	protected int getExtras() {
		return extras;
	}


	protected void setExtras(int extras) {
		this.extras = extras;
	}


	@Override
	public String toString() {
		return "Administracion [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ ", genero=" + genero + ", extras=" + extras + "]";
	}
	
	
	
	
	
	

}
