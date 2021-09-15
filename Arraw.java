package org.itstep;

import java.util.Random;

public class Arraw {

    public static int size = 10;
    public static int[] arr = new int[size];

    public static void main(String[] args) {
        fillOrder();
        //fillRandom ();
        arr = new int []{1,5,8,6,4,3,2,7,9,2};
        //arr[0] = 1;
        //arr[1] = 3;
        //arr[2] = 6;
        //print();
        //revers();
        //print();
        System.out.println(max());
        System.out.println (find(6));

    }
    public static void fillOrder() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
        }
        public static void print() {
            for (int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        //вывести рандомное значение
            public static void fillRandom() {
                Random random = new Random();
                for (int i = 0; i < arr.length; i++) {
                arr [i] = random.nextInt(90) + 10;
                }
            }
        public static int max() {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++)
                if (max < arr[i]) max = arr[i];
            //System.out.println(max());
            return max;
    }
    //переставить элементы массива местами
        public static void revers(){
            for (int i = 0; i < (size / 2); i++)
                swap(i, size - i - 1);

        }
        //замена элементов массива местами
        public static void swap(int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
           //найти элемент в массиве
          public static int find(int element) {
              int index = -1;
              for (int i = 0; i < size; i++)
                  if (arr[i] == element)
                      index = i;
              return index;
          }
}