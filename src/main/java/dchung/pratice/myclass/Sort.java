package dchung.pratice.myclass;

import java.util.LinkedList;
import java.util.List;

/**
 * Sort
 */
public class Sort{

    public List<Integer> insertionSort(final List<Integer> numbers) {

        List<Integer> sortedList = new LinkedList<>();
        
        Sorting: for( Integer number:numbers){
            for(int i=0;i<sortedList.size();i++){
                if(sortedList.get(i) > number) {
                    sortedList.add(i,number);
                    continue Sorting;
                }
            }
            sortedList.add(sortedList.size(),number);
        }
        return sortedList;
    }



    public void bubbleSort(int[] numbers) {

        int temp;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=1;j<numbers.length-i;j++){
                if(numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;   
                }
            }
        }
    }

    public void bubbleSort2(int[] numbers) {
        int temp;
        boolean hasSwap = false;
        do{
            hasSwap = false;
            for(int i=0;i<numbers.length-1;i++){
                if(numbers[i] > numbers[i+1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    hasSwap = true;
                }
            }
        } while(hasSwap);
    }
    
    


}