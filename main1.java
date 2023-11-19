public class Main1 {
    public static void main(String[] args) {
        // Crea objetos de tipo Fruit
        Fruit manzana = new Fruit("Manzana", 2.5);
        Fruit banana = new Fruit("Banana", 1.8);

        // Calcula el costo total de comprar 2 kilogramos de cada fruta
        double costoManzana = manzana.calcularCosto(2);
        double costoBanana = banana.calcularCosto(2);

        // Muestra los costos en la consola
        System.out.println("Costo total de manzanas: $" + costoManzana);
        System.out.println("Costo total de bananas: $" + costoBanana);
    }
}

class Fruit {
    // Atributos de la clase Fruit
    private String nombre;
    private double precio;

    // Constructor de la clase Fruit
    public Fruit(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para calcular el costo total
    public double calcularCosto(int cantidad) {
        return precio * cantidad;
    }
}
