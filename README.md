# PROBLEMA

Deseja-se construir um sistema para manter um registro de artistas musicais e seus álbuns. Cada álbum possui várias músicas, 
as quais poderão ser consultadas pelo sistema. O sistema também deve permitir a busca de artistas por nome ou nacionalidade. 
O sistema também deve ser capaz de exibir um relatório dos álbuns de um artista, o qual pode ser ordenado por nome, ano, 
ou duração total do álbum. Um álbum pode ter a participação de vários artistas, sem distinção. Já a música pode possuir um ou 
mais autores e intérpretes (todos considerados artistas).
<br>


# Diagrama de Classes

Com base no problema acima proposto foi criado o seguinte diagrama de classes:

<a href="https://imgbb.com/"><img src="https://i.ibb.co/XSnZbM5/diagrama-Classes.jpg" alt="diagrama-Classes" border="0"></a>

# Desenvolvimento em JAVA

Para tanto criou-se um projeto denominado "Musica", com quatro classes: 
<br>
* Artista
* Album
* Musica
* ClassePrincipal
<br>

**a) Classe Artista:** <br>
Armazenará as informações principais de Artista, adotando a programação orientada a objetos. 

> >	public int id; <br>
> >	public String name; <br>
> > public String nacionalidade; <br>

Obs: Na modelagem de dados os atributos foram listados como "Privates", contudo foi no momento utilizados no Java como se fossem públicos. Posteriormente serão adaptados. 
<br>

**b) Classe Album:** <br>
Armazenará as informações principais de Album, adotando a programação orientada a objetos. 

> > public int id; <br>
> >	public String name; <br>
> >	public int ano; <br>

**c) Classe Musica:** <br>
Armazenará as informações principais de Musica, adotando a programação orientada a objetos.

> >	public int id; <br>
> >	public String name; <br>
> >	public int duracao; <br>

**d) ClassePrincipal:** <br>
Executará algumas ações testando o armazenamento de dados e posteriormente, requerendo que o usuário insira certos dados para serem expostos na tela. <br>

# Criação 

Com base no código desenvolvido acima, criou-se o seguinte:
<a href="https://imgbb.com/"><img src="https://i.ibb.co/Jjk2Vbj/Diagrama2.jpg" alt="Diagrama2" border="0"></a>
<br>
Para tanto codificou-se da seguinte forma dentro da **ClassePrincipal** : <br>

> >		Artista artista1 = new Artista(); 
> >		artista1.id = 1;
> >		artista1.name = "Michal Jackson"; 
> >		artista1.nacionalidade = "USA";
> >		
> >		Album album1 = new Album(); 
> >		album1.ano = 1980; 
> >		album1.id = 1; 
> >		album1.name = "Thriller"; 
> >		
> >		Musica musica1 = new Musica(); 
> >		musica1.id = 1; 
> >		musica1.name = "We are the World"; 
> >		musica1.duracao = 250; 
> >		
> >		Artista artista3 = new Artista(); 
> >		artista3.id = 3;
> >		artista3.name = "James Hetfield"; 
> >		artista3.nacionalidade = "USA";
> >		
> >		Album album3 = new Album();
> >		album3.id = 3;
> >		album3.ano = 1983;
> >		album3.name = "Kill 'Em All";
> >		
> >		Musica musica3 = new Musica(); 
> >		musica3.id = 3; 
> >		musica3.name = "Seek and Destroy";
> >		musica3.duracao = 360;
	
# ENTRADA DE DADOS

O código após apresentar os artistas já cadastrados, solicita ao usuário que preencha alguns dados de forma a permitir que sejam identificados e posteriormente, impressos na tela, para tanto utiliza-se o "Scanner", devidamente introduzido no início do código com **Scanner sc = new Scanner(System.in)**. Para tanto codificou-se de forma a solicitar dados do artista, album e música, assim:

> > Artista artista2 = new Artista(); <br>
> >		System.out.println("Digite o nome do Artista:"); <br>
> >		artista2.name = sc.nextLine(); <br>
> >		System.out.println("Digite a sua nacionalidade:"); <br>
> >		artista2.nacionalidade = sc.nextLine(); <br>

Foram requeridos também entrada de dados para Album e Musica.
	
# CÓDIGO EM EXECUÇÃO
O código aqui desenvolvido pode ser visto em execução no seguinte link:

[![Projeto Java](https://i.ibb.co/17hbksQ/tumbyoutubemetallica.jpg)](https://www.youtube.com/watch?v=T-R0MgiGMAY&feature=youtu.be)
