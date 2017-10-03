import java.awt.EventQueue;

public class Usuarios {
	public static class Usuarios_{
	public String nombre_usuario;
	public String contrasena_usuario;
	public String correo_usuario;
	
	//public calendar fecha_usuario;
 
    // Constructor de la clase
    public Usuarios_(String nombre_usuario, /*String contrasena_usuario,*/ String correo_usuario) {
        this.nombre_usuario = nombre_usuario;
        //this.contrasena_usuario = contrasena_usuario;
        this.correo_usuario = correo_usuario;
        }
	}
	// Método para imprimir el array de Personas
    public void imprimeArrayPersonas(Usuarios_[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + "Usuario: " + array[i].nombre_usuario + " - Contraseña: " + array[i].contrasena_usuario + " - Email: " + array[i].correo_usuario);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        System.out.println("Lista Usuarios");

	}

}
