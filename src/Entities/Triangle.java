package Entities;

public class Triangle {
    public int a;
    public int b;
    public int c;

    public int area(){
        int p = (a + b + c) / 2;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
