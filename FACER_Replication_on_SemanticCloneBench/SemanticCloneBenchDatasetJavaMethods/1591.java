public class XYX {
public static double exp (double x, int n) {

    double sum = 1.0;

    double term = 1.0;

    for (int i = 1;

    i <= n; ++ i) {

        term *= x / i;

        sum += term;

    }

    return sum;

}

}