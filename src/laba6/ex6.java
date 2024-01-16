package laba6;

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {

        int[] arrayInt = new int [4];
        arrayInt[0] = 12;
        arrayInt[1] = 19;
        arrayInt[2] = 0;
        arrayInt[3] = 15;

        int [] arrayIntResult = ex6.getArray(arrayInt, 2);
        System.out.println(Arrays.toString(arrayIntResult));

        int [] arrayIntResult1 = ex6.getArray(arrayInt, 4);
        System.out.println(Arrays.toString(arrayIntResult1));


    }
    public static int[] getArray(int[] arraysInt, int value){
        if (value >= arraysInt.length){
            return arraysInt;
        }
        int [] arrayResult = new int [value];

        for(int i = 0; i < value; i++) {
            arrayResult[i] = arraysInt[i];
        }
        return arrayResult;
    }
}



