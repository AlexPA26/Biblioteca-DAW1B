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

    public void agregar(Libro nuevoLibro)
    {
        if (contador < inventario.length)
        {
            inventario[contador] = nuevoLibro;
            contador++;
        }
        
        else
        {
            System.out.println("Capacidad máxima alcanzada.");
        }
    }

    public void mostrar()
    {
        System.out.println("=== LISTADO DE LIBROS ===");
        for (int i = 0; i < contador; i++)
        {
            System.out.println(inventario[i]);
        }
    }


}

public class GestionBiblioteca
{
    public static void main(String[] args)
    {
        Biblioteca miBiblio = new Biblioteca(3);

        miBiblio.agregar(new Libro("Libro 1", "Autor 1"));
        miBiblio.agregar(new Libro("Libro 2", "Autor 2"));
        miBiblio.agregar(new Libro("Libro 3", "Autor 3"));

        miBiblio.mostrar();
    }
}