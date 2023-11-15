import java.util.Scanner;

public class Producto {

    String nombre;
    double precio;
    String codigo;
    int cantidad;
    
    String marca;

    public Producto() {
    }

    public Producto(String nombre, double precio, String codigo, int cantidad, String marca) {
    }

    public void ingresarProducto(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingres el nombre del producto: ");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el codigo del procuto: ");
        this.codigo=sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad= sc.nextInt();

    }





}