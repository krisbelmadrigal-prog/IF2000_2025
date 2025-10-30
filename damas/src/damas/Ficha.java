package damas;

public class Ficha {
    
private String color; // "R" para roja o "B" para negra

    public Ficha(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return color;
    }
}