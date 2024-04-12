package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;

	// Declarando e criando um construtor, vídeo 58 -> Não tem tipo de retorno
	public Anime() {
		System.out.println("Dentro do construtor sem argumentos");
	}

	// Declarando e criando um construtor, vídeo 58 -> PODE SER CONSIDERADO UMA
	// SOBRECARGA DE CONSTRUTORES
	public Anime(String nome, String tipo, int episodios, String genero) {
		this();
		System.out.println("Dentro do construtor com argumentos");
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}
	
	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome, tipo, episodios, genero);
		System.out.println("Dentro do construtor com argumentos");
		this.estudio = estudio;
	}

	public void imprimeDadosAnime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);

	}

	public void imprimeDadosAnime2() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
		System.out.println(this.estudio);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEpisodios() {
		return episodios;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}


}