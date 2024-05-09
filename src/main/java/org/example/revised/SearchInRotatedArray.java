package org.example.revised;public class SearchInRotatedArray {    public static void main(String args[]){        int[] array = {11,13,15,17};        int target = 11;        int pivot = findPivot(0,array.length-1, array);        System.out.println(findElement(0,pivot,array,target));        System.out.println(findElement(pivot+1,array.length-1,array,target));    }    static int findPivot(int start, int end, int array[]){        if(start > end){            return -1;        }        int mid = start + (end - start) / 2;        if(mid < end && array[mid] > array[mid+1]){            return mid;        }else if(start < mid && array[mid] < array[mid-1]){            return mid-1;        }else if(array[start] > array[mid]){ // if start is greater than mid that means all the elements after mid are smaller so we need to discard mid and other elements on right            return findPivot(start, mid-1, array);        }else if(array[start] < array[mid]){            return findPivot(mid,end,array);        }else if(start == mid && mid < end){            return findPivot(mid+1,end,array);        }        return mid;    }    static int findElement(int start,int end, int array[], int target){        if(start > end){            return -1;        }        int mid = start + (end - start) / 2;        if(target > array[mid]){            return findElement(mid + 1, end, array, target);        }else if(target < array[mid]) {            return findElement(start, mid -1 , array, target);        }        return mid;    }}