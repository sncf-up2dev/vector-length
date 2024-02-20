package fr.sncf.d2d.training;

public class Vector2D {
    double x;
    double y;

    double length() {
        return Math.sqrt(x * x + y * y);
    }
}
