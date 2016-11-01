/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *This is the MathSoftware SuperClass
 * @author melodytribble & yuehoe
 */
public abstract class MathSoftware{
    
    SortingMethod sm;
    
    /**
     * This will sort the array using the SortingMethod Interface
     * @param array is the integer array to be sorted
     * @return the sorted integer array
     */
    public int [] mathSort(int []array){
        sm.performSort(array);
        return array;
    }
    /**
     * This will set a new sorting method
     * @param s is a type of sorting method
     */
    public void setSortStrategy(SortingMethod s){
        sm = s;
    }
    
}
