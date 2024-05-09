public class TwoSum {
    public static void main(String args[]){
        int[] array = {2,3,4};
        System.out.println(findSum(0,array.length-1,6,array));
    }

    static int[] findSum(int start,int end, int target,int[] array){
        if(start > end){
            return new int[]{-1,-1};
        }
        int mid = start + (end - start) / 2;
        if(array[mid] > target){
            return findSum(start,mid - 1, target, array);
        }else{
            if(mid < end && array[mid] + array[mid + 1] > target){
                return findSum(start, mid, target, array);
            }else if(mid > start && array[mid] + array[mid - 1] < target){
                return findSum(mid, end, target, array);
            }else{
                System.out.println("Called --> "+ mid);
                return new int[]{mid,mid+1};
            }
        }
    }
}
