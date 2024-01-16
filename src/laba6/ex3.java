package laba6;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int [] primer = {15,10,5,35};
        Arrays.sort(primer);

        System.out.println("min = " + primer[0]);
        System.out.println("max = " + primer[primer.length - 1]);
        System.out.println("middle = " + (primer[0] + primer [primer.length - 1]/primer.length));
    class Exc3 {
            int[] arrayInt = getValue();

         static int[] getValue(int... v) {
                Arrays.sort(v);

                int[] arrayInt = new int[3];
                arrayInt[0] = v[0];
                arrayInt[1] = v[v.length - 1];
                arrayInt[2] = v[v.length / 4];

                return arrayInt;
            }
        }
    }
}

