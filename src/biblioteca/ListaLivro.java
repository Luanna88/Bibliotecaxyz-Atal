package biblioteca;

public class ListaLivro {
	
	private Livro[] livros;
	private int tamanho;
	
	public ListaLivro(int capacidade) {
		livros = new Livro[capacidade];
		tamanho = 0; 
	}
	
	public void adicionarLivro(Livro livro) {
		if (tamanho < livros.length) {
			livros[tamanho++] = livro;
		} else {
			System.out.println("A lista está cheia!");
		}
	}
	
	public void listaLivros() {
		for (int i = 0; i < tamanho;i++) {
			System.out.println(livros[i]);
		}
	}
	
	public void ordenarPorTitulo() {
		quickSortPorTitulo(0, tamanho - 1); 
	}

	public void ordenarPorAutor() {
		quickSortPorAutor(0, tamanho -1);
	}
	
	private void quickSortPorTitulo(int inicio, int fim) {
		if (inicio < fim) {
			int indicePivo = particionarPorTitulo(inicio, fim);
			quickSortPorTitulo(inicio, indicePivo - 1); 
			quickSortPorTitulo(indicePivo + 1, fim); 
		}
	}
	
	 private int particionarPorTitulo(int inicio, int fim) {
		Livro pivo  = livros[fim]; 
		int i = inicio - 1; 
		
		for (int j= inicio; j < fim; j++) {
			if(livros[j].getTitulo().compareTo(pivo.getTitulo()) <= 0) {
				i++;
				
				Livro temp = livros[i]; 
				livros[i] = livros[j]; 
			}
		}
		
		Livro temp = livros[i + 1] ;
		livros[i + 1] = livros[fim];
		livros[fim] = temp; 
		
		return i + 1;
	 }
	 
	 private void quickSortPorAutor(int inicio, int fim) {
		 if (inicio < fim) {
			 int indicePivo = particionarPorAutor(inicio, fim);
			 quickSortPorAutor(inicio, indicePivo - 1);
			 quickSortPorAutor(indicePivo + 1, fim);
		 }
	 }
	 
	 private int particionarPorAutor(int inicio, int fim) {
		 Livro pivo = livros[fim];
		 int i = inicio -1;
		 
		 for (int j = inicio; j < fim; j++) {
			 if (livros[j].getAutor().compareTo(pivo.getAutor()) <= 0 ) {
				 i++;
				 
				 Livro temp  = livros[i];
				 livros[i] = livros[j];
				 livros[j] = temp;
						 
			 }
		 }
		 
		 	Livro temp = livros[i + 1];
	        livros[i + 1] = livros[fim];
	        livros[fim] = temp;

	        return i + 1;
	 }

}
