public class XYX {
public static int mode (int [] [] arr) {

    int [] oneDArray = new int [arr.length * arr.length];

    for (int i = 0;

    i < arr.length; i ++) {

        for (int s = 0;

        s < arr.length; s ++) {

            oneDArray [(i * arr.length) + s] = arr [i] [s];

        }

    }

}

}