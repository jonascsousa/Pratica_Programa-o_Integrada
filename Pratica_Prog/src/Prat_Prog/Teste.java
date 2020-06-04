package Prat_Prog;

public class Teste {

	public static void main(String[] args) {
		
		Pais pais = new Pais();


			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			pais.maiorPais();
			
			pais.tresPaises();
			
			pais.menorArea();

	}

}
