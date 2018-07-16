package com.company;

import java.util.Random;

public class Main {
    private static long inicio=System.nanoTime();;

    public static void main(String[] args) {
	// write your code here


        int numero = 100;
        while (numero < 1000000) {
            int[] aArray = new int[numero];
            long startime = System.nanoTime();
            fillRandomArray(aArray);
            QuickSortclass.quicksort(aArray,0,aArray.length-1);
            long endtime = System.nanoTime();
            long deltatime = endtime - startime;
            System.out.println("numero: " + numero + " , "+ " tiempo: " + deltatime);
            numero += numero;



        }

        System.out.println("*******************************");





}
    private static void printArray( int[] aArray){
        for (int num :
                aArray) {
            System.out.println(num);
        }
    }

    private static void fillRandomArray(int[] rArray) {
        Random r = new Random();
        for (int i = 0; i < rArray.length; i++) {
            rArray[i] = r.nextInt();
        }
    }
    public static void imprimirVector(int vec[]){
        for(int i=0;i<vec.length;i++){
            System.out.print(vec[i]+" ");
        }
    }
}
