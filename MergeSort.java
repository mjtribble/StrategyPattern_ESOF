/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author melodytribble
 */
public class MergeSort implements SortingMethod {
    
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
    
    public MergeSort(){
        System.out.println("New MergeSort Object created!\n");
    }
  
    @Override
    public int[] performSort(int[] a) {
        System.out.println("Starting Merge Sort\nUnsorted ");
        printArray(a);
        mergeSort(a);
        System.out.println("Sorted ");
        printArray(a);
        return a;
    }
    
    private int[] mergeSort(int[] a) {
        this.array = a;
        this.length = a.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        return a;
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
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

