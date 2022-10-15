import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        Animal p = new Perro("canito","chapi");
        System.out.print("Ingrese la edad del perro=> " );
        int edad=sx.nextInt();
        p.setNombre("Choca");
        p.comer();
        p.caminar();
        p.sonido();
        p.edad(edad);

        System.out.println("----------------------------------");
        Animal g = new Perro("Darzy","doberman");
        System.out.print("Ingrese la edad del perro=> " );
        edad=sx.nextInt();
        g.setNombre("Mochita");
        g.comer();
        g.caminar();
        g.sonido();
        g.edad(edad);
    }
}
