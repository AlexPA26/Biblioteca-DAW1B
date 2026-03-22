class Libro
{
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString()
    {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}

class Biblioteca
{
    private Libro[] inventario;
    private int contador;

    public Biblioteca(int capacidad)
    {
        this.inventario = new Libro[capacidad];
        this.contador = 0;
    }


}

public class GestionBiblioteca
{
    public static void main(String[] args)
    {
        Biblioteca miBiblio = new Biblioteca(3);

        // miBiblio.agregar(new Libro("Libro 1", "Autor 1"));
        // miBiblio.agregar(new Libro("Libro 2", "Autor 2"));
        // miBiblio.agregar(new Libro("Libro 3", "Autor 3"));

        // miBiblio.mostrar();
    }
}