import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		Artista artista1 = new Artista();
		artista1.id = 1;
		artista1.name = "Michal Jackson";
		artista1.nacionalidade = "USA";
		
		Album album1 = new Album();
		album1.ano = 1980;
		album1.id = 1;
		album1.name = "Thriller";
		
		Musica musica1 = new Musica();
		musica1.id = 1;
		musica1.name = "We are the World";
		musica1.duracao = 250;
		
		Artista artista3 = new Artista();
		artista3.id = 3;
		artista3.name = "James Hetfield";
		artista3.nacionalidade = "USA";
		
		Album album3 = new Album();
		album3.id = 3;
		album3.ano = 1983;
		album3.name = "Kill 'Em All"; 
		
		Musica musica3 = new Musica();
		musica3.id = 3;
		musica3.name = "Seek and Destroy";
		musica3.duracao = 360;
		
		System.out.println("O c�digo do artista �: " + artista1.id + ", o seu nome em nosso banco de dados �: " + artista1.name + ", nascido em : " + artista1.nacionalidade );
		System.out.println("Um de seus principais �lbuns �: " + album1.name + " lan�ado em " + album1.ano + ".");
		System.out.println("Neste �lbum, a m�sica" + musica1.name + "foi o principal destaque com cerca de " + musica1.duracao + " segundos de dura��o.");
		System.out.println("=============================================================================================");
		System.out.println("O artista cadastrado de ID " + artista3.id + " � conhecido como " + artista3.name + " nascido nos " + artista3.nacionalidade + " . ");
		System.out.println("Seu primeiro album lan�ado foi o chamado " + album3.name + " no ano de " + album3.ano + " onde a principal m�sica foi" + musica3.name + ".");
	
		System.out.println("=============================================================================================");

		System.out.println("Agora por favor, preencha os dados abaixo referente ao novo artista:");
		
		Artista artista2 = new Artista();
		System.out.println("Digite o nome do Artista:");
		artista2.name = sc.nextLine();
		System.out.println("Digite a sua nacionalidade:");
		artista2.nacionalidade = sc.nextLine();
		
		System.out.println("O artista digitado � : " + artista2.name + ", cuja nacionalidade �: " + artista2.nacionalidade);
		System.out.println(" =============================================================================================");
		
		Musica musica2 = new Musica();
		System.out.println("Digite a m�sica mais famosa deste artista:");
		musica2.name = sc.nextLine();
		System.out.println("Digite a dura��o desta m�sica em segundos:");
		musica2.duracao = sc.nextInt();
		
		System.out.println("A m�sica mais famosa do artista " + artista2.name + " , � " + musica2.name + " , com dura��o de " + musica2.duracao + " segundos." );
		System.out.println(" =============================================================================================");

		Album album2 = new Album();
		System.out.println("O album mais famoso, foi lan�ado em que ano? ");
		album2.ano = sc.nextInt();	
		
		System.out.println("O artista " + artista2.name + " , lan�ou seu album mais famamoso em  " + album2.ano + " , cuja principal m�sica � : " + musica2.name + " . ");
		
		
		sc.close();
		
		
	}

}
