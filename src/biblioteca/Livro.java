package biblioteca;

public class Livro {
	
	private String Titulo;
    private String Autor;
    private int AnoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.AnoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return Titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public int getAnoPublicacao() {
		return AnoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + Titulo + ", autor=" + Autor + ", anoPublicacao=" + AnoPublicacao + "]";
	}
    
}
