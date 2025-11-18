import java.util.Scanner;

public  class Ejercicio20MainProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto producto1 = new Producto("Leche",1.10);
        Producto producto2 = new Producto("Miel", 3.80);

        System.out.println("La " + producto1.nombre + " tiene un precio de " + producto1.precio + "€");
        System.out.println("La " + producto2.nombre + " tiene un precio de " + producto2.precio + "€");


        System.out.println("Introduce el precio nuevo del producto1: ");
        try{
            producto1.actualizarPrecio(sc.nextDouble());
            System.out.println("La " + producto1.nombre + " tiene un precio nuevo de " + producto1.precio + "€");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Introduce el precio nuevo del producto2: ");
        try{
            producto2.actualizarPrecio(sc.nextDouble());
            System.out.println("La " + producto2.nombre + " tiene un precio nuevo de " + producto2.precio + "€");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
