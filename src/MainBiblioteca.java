public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("", "Robert C. Martin", "9780132350884", 1, 15000.0);

        libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884", 1, 15000.0);
        Libro libro2 = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897", 3, 22000.0);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "9780307474728"); // Constructor de conveniencia

       
        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);
        System.out.println("¿Se aceptó el precio -100.0? " + precioAceptado + " (se mantiene el precio anterior)\n");

        
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        
        boolean p1 = libro1.prestar(); // presta unica copia (queda en 0)
        boolean p2 = libro1.prestar(); // intenta prestar sin copias - alto fallo


        libro1.devolver();
        libro1.setPrecioReposicion(18000.0);

    }
}
