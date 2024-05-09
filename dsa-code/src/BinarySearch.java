public class BinarySearch {
    // [1,4,6,7,8,12] find 5
    public static void main(String[] args) {
        int[] arry = new int[]{1,4,6,7,8,12};
        System.out.println(findCelling(0,arry.length-1,5,arry));
        System.out.println(findFloor(0,arry.length-1,5,arry));
    }

    static int findCelling(int start, int end, int target,int[] arry){
        if(target > arry[arry.length-1]){
            return -1;
        }
        if(start > end){
            System.out.println("Start -> "+ start + "End ->"+ end +" - "+ arry[start]);
            return arry[start];
        }
        int mid = start + (end - start) / 2;
        if(target <  arry[mid]){
            return findCelling(start,mid-1,target,arry);
        }
        if(target > arry[mid]){
            return findCelling(mid+1,end,target,arry);
        }
        return arry[mid];
    }

    static int findFloor(int start, int end, int target,int[] arry){
        if(target > arry[arry.length-1]){
            return -1;
        }
        if(start > end){
            System.out.println("End -> "+ end + " - "+ arry[end]);
            return arry[end];
        }
        int mid = start + (end - start) / 2;
        if(target <  arry[mid]){
            return findFloor(start,mid-1,target,arry);
        }
        if(target > arry[mid]){
            return findFloor(mid+1,end,target,arry);
        }
        return arry[mid];
    }
}
