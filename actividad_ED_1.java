import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args) {

        int vt;
        int d;
        int vf;
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingrese la cantidad: ");
        int cantidad =teclado.nextInt();
        System.out.println("ingrese el valor del producto: ");
        int vu = teclado.nextInt();
        System.out.println("ingrese el articulo: ");
        String art = teclado.next();

        if (cantidad>20) {
            vt = vu * cantidad;
            d = vt *10/100;
            vf = vt - d;
            System.out.print("el valor final del producto "+ art + " es: " + vf);  
        }else{
            if (cantidad<10) {
                vt = cantidad * vu;
                System.out.print("el valor final del producto "+ art + " es: " + vt);
            }else{
                vt = vu * cantidad;  
                d = vt *5/100;
                vf = vt -d;
                System.out.print("el valor final del producto "+ art + " es: " + vf);
            }
        }
    }
}