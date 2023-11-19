public class Main {
   public static void main(String[] args) {
       // Crea un objeto Car
       Car car1 = new Car();

       // Establece los atributos del coche
       car1.setMarca("Toyota");
       car1.setModelo("Camry");
       car1.setAnio(2022);

       // Muestra la información del coche
       System.out.println("Información del coche:");
       System.out.println("Marca: " + car1.getMarca());
       System.out.println("Modelo: " + car1.getModelo());
       System.out.println("Año: " + car1.getAnio());
   }
}

class Car {
    // Atributos de la clase Car
    private String marca;
    private String modelo;
    private int anio;

    // Constructor de la clase Car
    public Car() {
        // El constructor no recibe argumentos ya que se pueden establecer los valores más tarde
    }

    // Métodos para establecer los atributos
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Métodos para obtener los atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }
}
