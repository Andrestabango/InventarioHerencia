public class Main {
    public static void main(String[] args) {

        //Producto p1 = new Producto("Producto genérico 1",0,"C001",0,"Sin marca");
        Producto p1= new Producto();
        p1.ingresarProducto();
        Alimento a1=new Alimento();
        a1.ingresarProducto();
        Electrodomestico e1=new Electrodomestico();
        e1.ingresarProducto();

    }
}