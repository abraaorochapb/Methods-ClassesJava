import Entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("-----Triangulo X-----");
        System.out.print("Diga o valor do lado a do triangulo x:");
        x.a = sc.nextInt();

        System.out.print("Diga o valor do lado b triangulo x:");
        x.b = sc.nextInt();

        System.out.print("Diga o valor do lado c triangulo x:");
        x.c = sc.nextInt();

        System.out.println("-----Triangulo Y-----");
        System.out.print("Diga o valor do lado a triangulo y:");
        y.a = sc.nextInt();

        System.out.print("Diga o valor do lado b triangulo y:");
        y.b = sc.nextInt();

        System.out.print("Diga o valor do lado c triangulo y:");
        y.c = sc.nextInt();

        int somaDasAreas = x.area() + y.area();

        System.out.printf("A soma das areas dos dois triangulos é igual a: %d", somaDasAreas);

        sc.close();
    }
}