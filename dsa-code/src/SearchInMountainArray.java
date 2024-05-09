public class SearchInMountainArray {
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = findPeak(0,array.length-1,array);
        int result = orderAgnosticSearch(0,peak,target,array,true);
        if(result == -1){
            result = orderAgnosticSearch(peak,array.length,target,array,false);
        }
        System.out.println(result);
    }

    static int findPeak(int start,int end, int[] array){
        if(start == end){
            return start;
        }
        int mid = start + (end - start)/2;
        if(array[mid] > array[mid + 1]){
            return findPeak(start,mid,array);
        }else{
            return findPeak(mid + 1,end,array);
        }
    }

    static int orderAgnosticSearch(int start,int end, int target, int[] array, boolean isAsc){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == array[mid]){
            return mid;
        }
        if(isAsc){
            if(target < array[mid]){
                return orderAgnosticSearch(start,mid-1,target,array,isAsc);
            }else{
                return orderAgnosticSearch(mid+1,end,target,array,isAsc);
            }
        }else{
            if(target < array[mid]){
                return orderAgnosticSearch(mid+1,end,target,array,isAsc);
            }else{
                return orderAgnosticSearch(start,mid-1,target,array,isAsc);
            }
        }
    }
}
