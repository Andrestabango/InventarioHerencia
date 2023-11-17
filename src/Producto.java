import java.sql.SQLOutput;
import java.util.Scanner;

public class Producto {

    String nombre;
    double precio;
    String codigo;
    int cantidad,opcion;
    
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
        System.out.println("Ingrese la marca del producto: ");
        this.marca= sc.next();

    }

    public void imprimirProducto(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio del producto: "+precio);
        System.out.println("Codigo del prducto: "+codigo);
        System.out.println("Cantidad del producto: "+cantidad);
        System.out.println("Marca del producto: "+marca);
    }

public void menuPrincipal(){

        Scanner sc= new Scanner(System.in);
        System.out.println("MENU DE PRODUCTOS");
        System.out.println("1.ALIMENTOS");
        System.out.println("2.ELECTRODOMESTICOS");
        System.out.println("3.TECNOLOGIA");
        System.out.println("Ingrese el numero de la accion que desea hacer:");
        this.opcion=sc.nextInt();
        if(opcion==1){
            System.out.println("ALIMENTOS");
            Alimento a1=new Alimento();
            a1.ingresarProducto();
            a1.imprimirProducto();
        }
        else if(opcion==2){
            System.out.println("ELECTRODOMESTICOS");
            Electrodomestico e1=new Electrodomestico();
            e1.ingresarProducto();
            e1.imprimirProducto();
            }
        else if(opcion==3){
            System.out.println("TECNOLOGIA");
            Tecnologia t1=new Tecnologia();
            t1.ingresarProducto();
            t1.imprimirProducto();
            }
        }



    }




