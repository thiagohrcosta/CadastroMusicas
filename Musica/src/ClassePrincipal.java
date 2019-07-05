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
		
		System.out.println("O código do artista é: " + artista1.id + ", o seu nome em nosso banco de dados é: " + artista1.name + ", nascido em : " + artista1.nacionalidade );
		System.out.println("Um de seus principais álbuns é: " + album1.name + " lançado em " + album1.ano + ".");
		System.out.println("Neste álbum, a música" + musica1.name + "foi o principal destaque com cerca de " + musica1.duracao + " segundos de duração.");
		System.out.println("=============================================================================================");
		System.out.println("O artista cadastrado de ID " + artista3.id + " é conhecido como " + artista3.name + " nascido nos " + artista3.nacionalidade + " . ");
		System.out.println("Seu primeiro album lançado foi o chamado " + album3.name + " no ano de " + album3.ano + " onde a principal música foi" + musica3.name + ".");
	
		System.out.println("=============================================================================================");

		System.out.println("Agora por favor, preencha os dados abaixo referente ao novo artista:");
		
		Artista artista2 = new Artista();
		System.out.println("Digite o nome do Artista:");
		artista2.name = sc.nextLine();
		System.out.println("Digite a sua nacionalidade:");
		artista2.nacionalidade = sc.nextLine();
		
		System.out.println("O artista digitado é : " + artista2.name + ", cuja nacionalidade é: " + artista2.nacionalidade);
		System.out.println(" =============================================================================================");
		
		Musica musica2 = new Musica();
		System.out.println("Digite a música mais famosa deste artista:");
		musica2.name = sc.nextLine();
		System.out.println("Digite a duração desta música em segundos:");
		musica2.duracao = sc.nextInt();
		
		System.out.println("A música mais famosa do artista " + artista2.name + " , é " + musica2.name + " , com duração de " + musica2.duracao + " segundos." );
		System.out.println(" =============================================================================================");

		Album album2 = new Album();
		System.out.println("O album mais famoso, foi lançado em que ano? ");
		album2.ano = sc.nextInt();	
		
		System.out.println("O artista " + artista2.name + " , lançou seu album mais famamoso em  " + album2.ano + " , cuja principal música é : " + musica2.name + " . ");
		
		
		sc.close();
		
		
	}

}
