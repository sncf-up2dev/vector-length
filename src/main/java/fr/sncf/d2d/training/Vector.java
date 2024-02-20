package fr.sncf.d2d.training;

public class Vector {
    double[] components;

    double length() {
        double sqr = 0;
        for (double component: components) {
            sqr += component * component;
        }
        return Math.sqrt(sqr);
    }
}
