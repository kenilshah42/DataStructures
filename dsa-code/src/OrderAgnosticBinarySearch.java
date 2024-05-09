public class OrderAgnosticBinarySearch {
    public static void main(String args[]){
        //int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(agnosticBinarySearch(0,array.length,2,array,(array[0] < array[array.length-1])));
    }
    static int agnosticBinarySearch(int start,int end,int target,int[] array, boolean isAsc){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == array[mid]){
            return mid;
        }
        if(isAsc){
            if(target < array[mid]){
                return agnosticBinarySearch(start,mid-1,target,array,isAsc);
            }else{
                return agnosticBinarySearch(mid+1,end,target,array,isAsc);
            }
        }else {
            if(target < array[mid]){
                return agnosticBinarySearch(mid+1,end,target,array,isAsc);
            }else{
                return agnosticBinarySearch(start,mid-1,target,array,isAsc);
            }
        }
    }
}
