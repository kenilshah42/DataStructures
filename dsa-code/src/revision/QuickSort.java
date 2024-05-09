package revision;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.List;public class QuickSort {    public static void main(String args[]){        List<Integer> array = Arrays.asList(2,9,3,1,0,8,7);        System.out.println("sorted -> "+ quickSort(array));    }    static List<Integer> quickSort(List<Integer> array){        if(array.size() <= 1){            return array;        }else if(array.size() == 2){            int temp = array.get(0);            array.set(0,array.get(1));            array.set(1,temp);            return array;        }else{            int pivot = array.get(array.size() / 2);            List<Integer> smaller = new ArrayList<>();            List<Integer> larger = new ArrayList<>();            for(int value : array){                if(value < pivot){                    smaller.add(value);                }                if(value > pivot){                    larger.add(value);                }            }            List<Integer> left = quickSort(smaller);            left.add(pivot);            List<Integer> right = quickSort(larger);            left.addAll(right);            return left;        }    }}