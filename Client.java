/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.util.Scanner;

/**
 * This is the main class 
 * User will choose a math software and sorting method to sort an integer array
 * @author melodytribble & yuehoe
 */
public class Client {
    public static void main(String[] args){
        
        MathSoftware m = null;
        SortingMethod sm = null;
        
        //unsorted arrays to be sorted
        int [] a = { 2, 4, 5, 10, 7, 14, 3, 9, 1};
        int [] b = { 8, 10, 2, 5, 9, 3, 2, 45};
        // ask user to choose a software, sets software
        System.out.println("Please select your desired math software");
        System.out.println("1. Mathematica, 2. MTool, 3. MyMath: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        switch(i){
            case 1:
                m = new Mathematica();  
                break;
            case 2:
                m = new MTool();
                break;
            case 3:
                m = new MyMath();
                break;
            default:
            //an integer other than 1-3 is chosen
            System.out.println("Wrong number!!");
        }
        //sorts array using default method for the software
        m.mathSort(a);
        
        //asks user if they want to choose a diferent sorting method
        System.out.println("Please select your desired sorting method");
        System.out.println("1. Bubble Sort, 2. Insertion Sort, 3. Merge Sort: ");
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        //sets sorting method
        switch(j){
            case 1:
                sm = new BubbleSort();
                m.setSortStrategy(sm);
                break;
            case 2:
                sm = new InsertionSort();
                m.setSortStrategy(sm);
                break;
            case 3:
                sm = new MergeSort();
                m.setSortStrategy(sm);
                break;
            default:
            System.out.println("Wrong number!!");
        }
        //sorts array using chosen sort method
        m.mathSort(b);
    }  
}
