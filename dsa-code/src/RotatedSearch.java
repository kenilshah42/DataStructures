public class RotatedSearch {
    public static void main(String args[]){
        int[] array = {6,7,1,2,3,4,5};
        int target = 6;
        int pivot = findPivot(0,array.length-1,array);
        if(pivot == -1){
            System.out.println(binarySearch(0,array.length-1,target,array));
        }
        if(array[pivot] == target){
            System.out.println(pivot);
        }
        if(target >= array[0]){
            System.out.println(binarySearch(0,pivot-1,target,array));
        }else {
            System.out.println(binarySearch(pivot+1,array.length-1,target,array));
        }
    }

    static int findPivot(int start, int end, int[] array){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(mid < end && array[mid] > array[mid+1]){
            return mid;
        }
        if(start < mid && array[mid] < array[mid - 1]){
            return mid-1;
        }
        if(array[start] >= array[mid]){
            return findPivot(start,mid-1,array);
        }else{
            return findPivot(mid+1,end,array);
        }
    }

    static int binarySearch(int start,int end,int target,int[] array){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target < array[mid]){
            return binarySearch(start,mid - 1,target,array);
        }else if(target > array[mid]){
            return binarySearch(mid+1,end,target,array);
        }else{
            return mid;
        }
    }
}
