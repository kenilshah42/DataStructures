package org.example.revised;

public class InfiniteArraySearch {
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(divideChunks(6,array));
    }
    static int divideChunks(int target,int[] array){
        //Initially chunk size of 2
        int start = 0;
        int end = 1;

        while(target > array[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return findElement(start,end,target,array);
    }

    static int findElement(int start, int end, int target,int[] arry){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target <  arry[mid]){
            return findElement(start,mid-1,target,arry);
        }
        if(target > arry[mid]){
            return findElement(mid+1,end,target,arry);
        }
        return mid;
    }
}
