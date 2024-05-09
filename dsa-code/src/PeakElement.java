public class PeakElement {
    public static void main(String args[]){
        int[] array = {0,2,1,0};
        System.out.println(findPeak(0,array.length-1,array));
    }
    static int findPeak(int start,int end,int[] array){
        if(start == end){
            return start;
        }
        int mid = start + (end - start) / 2;
        if(array[mid] > array[mid+1]){
            return findPeak(start,mid,array);
        }else{
            return findPeak(mid+1,end,array);
        }
    }
}
