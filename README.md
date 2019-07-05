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
> >     public String nacionalidade; <br>

Obs: Na modelagem de dados os atributos foram listados como "Privates", contudo foi no momento utilizados no Java como se fossem públicos. Posteriormente serão adaptados. 
<br>

**b) Classe Album:** <br>
Armazenará as informações principais de Album, adotando a programação orientada a objetos. 

> > 	public int id; <br>
> >	public String name; <br>
> >	public int ano; <br>

**c) Classe Musica:** <br>
Armazenará as informações principais de Musica, adotando a programação orientada a objetos.

> >	public int id; <br>
> >	public String name; <br>
> >	public int duracao; <br>

**d) ClassePrincipal:** <br>
Executará algumas ações testando o armazenamento de dados e posteriormente, requerendo que o usuário insira certos dados para serem expostos na tela. <br>
