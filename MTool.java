/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 * This a specific math software that inherits from the MathSoftware Super Class
 * @author melodytribble yuehoe
 */
public class MTool extends MathSoftware{
    
    SortingMethod sm;
    
    /**
     * This is the constructor
     * This will set the default sorting type to merge sort
     */    
    public MTool(){
        System.out.println("New MTool Object created!\nWill use merge sort by default.\n");
        sm = new MergeSort();
    }
    
    /**
     * This will sort the array using the SortingMethod interface
     * @param array is the integer array to be sorted
     * @return the sorted integer array
     */
    @Override
     public int [] mathSort(int []array){
         System.out.println("mathSort() called in the MTool Class");
        sm.performSort(array);
        return array;    
     }
     
    /**
     * This will set a new sorting method
     * @param s is a type of sorting method
     */
    @Override
    public void setSortStrategy(SortingMethod s){//do we need this?
         System.out.println("setSortStrategy() called in the MTool Class");
        sm = s;        
    }
    
}
