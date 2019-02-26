/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author teel6
 */
public class QuickSort {
    private int array[];
    private int length;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 15;
        int[] input = new int[number];
        for(int i = 0; i < number; i++){
            int Random = (int)(Math.random()*100);
            System.out.println(Random);
            input[i] = Random;
        }
        QuickSort sorter = new QuickSort();
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
private void quicksort(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex)/2];
        while(i <= j){
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i <= j){
                swap(i,j);
                i++;
                j--;
            }
            if(lowerIndex < j){
                quicksort(lowerIndex, j);
            }
            if(i < higherIndex){
                quicksort(i, higherIndex);
            }
        }
        }
public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quicksort(0, length - 1);
    }
 
private void swap(int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
}
