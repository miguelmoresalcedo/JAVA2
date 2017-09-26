package persona;

public class persona {
	String DNI;
	String nombre;
	String apellido;
	double salario;
	
	
	
	public persona(String dNI, String nombre, String apellido, double salario) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	@Override
	public String toString() {
		return "persona [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
	}
	
	
	
	

}
