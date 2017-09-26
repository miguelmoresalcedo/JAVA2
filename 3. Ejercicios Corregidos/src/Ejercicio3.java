import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// A partir de la clase URL de Java y con la ayuda del wordrefence, traducir
// palabras del espa�ol al ingl�s

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra = "salchicha";
		URL web = null;
		InputStream contenido = null; //InputStream: Tipo de dato que almacena bytes
		String pagWeb = "";
		
		try {
			web = new URL("http://www.wordreference.com/es/en/translation.asp?spen="+palabra);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		try {
			contenido = web.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Convertir InputStream en String
		pagWeb = getStringFromInputStream(contenido);
		
		System.out.println(pagWeb);
		
	}
	
	// convert InputStream to String
		private static String getStringFromInputStream(InputStream is) {

			BufferedReader br = null;
			StringBuilder sb = new StringBuilder();

			String line;
			try {

				br = new BufferedReader(new InputStreamReader(is));
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

			return sb.toString();

		}

}
