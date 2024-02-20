package fr.sncf.d2d.training;

public class Main {

    public static void main(String[] args) {
        var vector = new Object() {
            double x;
            double y;

            double length() {
                return Math.sqrt(x * x + y * y);
            }
        };

        vector.x = 3;
        vector.y = 4;
        System.out.println(vector.length());
    }
}
