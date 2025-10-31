import java.util.ArrayList;
import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {

		ClasseAtleta obat_1 = new ClasseAtleta(1, "Mikael", 17, "Futebol");
		ClasseAtleta obat_2 = new ClasseAtleta(2, "Letícia", 16, "Hipismo");

		obat_1.mostrarInformacoes();
		obat_2.mostrarInformacoes();
		
		Scanner sc =  new Scanner(System.in);
		ArrayList<ClasseAtleta> atleta_var = new ArrayList<>();
	}

}
