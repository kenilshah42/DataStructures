package org.example.revised;public class findPeakElement2 {    public static void main(String args[]){        int[] array = {11,13,15,17};        //int[] array = {6,5,4,3,2,3,2};        System.out.println("Peak ->"+ findPeak(0,array.length-1,array));    }//    static int findPeak(int start,int end,int[] array){//        if(start > end){//            return -1;//        }//        int mid = start + (end-start)/2;//        if(mid < end && array[mid] > array[mid+1]){//            return array[mid];//        }else if(mid > start && array[mid-1] > array[mid]){//            return array[mid-1];//        }else if(array[start] > array[mid]){//            return findPeak(start,mid-1,array);//        }else if(array[start] < array[mid]){//            return findPeak(mid,end,array);//        }else if(start == mid && array[mid] < array[end]){//            return end;//        }//        return array[mid];//    }    static int findPeak(int start,int end,int[] array){        if(start > end){            return -1;        }        if(start == end){            return start;        }        int mid = start + (end-start)/2;        if(mid < end && array[mid] > array[mid+1]){            return mid;        }else if(mid > start && array[mid] < array[mid-1]){            return mid-1;        }else if(array[start] == array[mid] && array[mid] == array[end]){            if(start < end && array[start] > array[start+1]){                return start;            }            start++;            if(start < end && array[end] < array[end-1]){                return end-1;            }            end--;            return findPeak(start,end,array);        }        else if(array[start] > array[mid]){            return findPeak(start,mid-1,array);        }else if(array[start] < array[mid] || (array[start] == array[mid] && array[mid] < array[end])){            return findPeak(mid+1,end,array);        }else if(start == mid && array[mid] < array[end]){            return end;        }        return mid;    }}