/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author melodytribble
 */
public class BubbleSort implements SortingMethod{
    
    public BubbleSort(){
        System.out.println("New BubbleSort Object created!\n");
    }
    
    
    @Override
    public int[] performSort(int[] a){
        System.out.println("Starting Bubble Sort\nUnsorted ");
        printArray(a);
        bubbleSort(a);
        System.out.println("Sorted ");
        printArray(a);
        return a;
    }

       
   private static void bubbleSort(int[] intArray) {
            int n = intArray.length;
            int temp = 0;

            for(int i=0; i < n; i++){
                    for(int j=1; j < (n-i); j++){

                            if(intArray[j-1] > intArray[j]){
                                    //swap the elements!
                                    temp = intArray[j-1];
                                    intArray[j-1] = intArray[j];
                                    intArray[j] = temp;
                            }
                    }
            }
    }
   
   private void printArray(int[] a){
       String output = "Array = ";
       for(int i=0; i<a.length; i++){
           output += a[i]+ " ";
       }
       System.out.println(output);
   }
}
