package laba6;

import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        int [] arrayInt = getMaxAndMinValue(15,654,541,2,0,1000);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int [] getMaxAndMinValue(int...v){

        Arrays.sort(v);

        int[] arrayInt = new int [2];

        arrayInt[0]= v[0];
        arrayInt[1]= v[v.length - 1];

        return arrayInt;
    }

}
