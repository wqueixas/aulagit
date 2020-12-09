package exercicios.exercicio06;

public class Ebook {
    private String titulo, autor;
    private int totalPag, atualPag;

    public Ebook(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = paginas;
    }

    public void mostrarPagina() {
        System.out.println("\tPágina: " + this.atualPag);
    }

    public void mostraCapa() {
        System.out.printf("\nTitulo: %s\n\tAutor: %s, %d páginas\n\n", titulo, autor, totalPag);
    }

    public void avancarPagina() {
        folheiaPag(1);
        mostrarPagina();
    }

    public void retrocederPagina() {
        folheiaPag(-1);
        mostrarPagina();
    }
    public void irPagina( int p ) {
        if (p >= 0 && p <= this.totalPag) {
            this.atualPag=p;
        } else {
            System.out.println("Página inválida!");
            mostraCapa();
        }
        mostrarPagina();
    }

    private void folheiaPag(int valor) {
        if (valor > 0) {
            if (this.atualPag < totalPag) {
                this.atualPag++;
            } else {
                System.out.println("O livro tem apenas " + this.totalPag + " páginas");
            }
        }
        if (valor < 0) {
                if (this.atualPag <= this.totalPag && this.atualPag > 0) {
                    this.atualPag--;
                } else {
                    System.out.println("Chegamos ao inicio do livro");
                }
            }
        }
    }


