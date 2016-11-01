/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author melodytribble, yuehoe
 */
public class InsertionSort implements SortingMethod {
    
    public InsertionSort(){
        System.out.println("New InsertionSort Object created!");
    }
    
    @Override
    public int[] performSort(int[] a) {
        System.out.println("Starting Insertion Sort\nUnsorted ");
        printArray(a);
        insertionSort(a);
        System.out.println("Sorted ");
        printArray(a);
        return a;
    }
    
    private int[] insertionSort(int[]a){
        for(int i=1; i<a.length; i++){
            int temp = a[i];
            int j;
            for(j=i-1; j>=0 && temp < a[j]; j--){
                a[j+1] = a[j];
            }
            a[j+1] = temp;
        }
        return a;
    }
    
    private void printArray(int[] a){
       String output = "Array = ";
       for(int i=0; i<a.length; i++){
           output += a[i]+ " ";
       }
       System.out.println(output);
   }
}
