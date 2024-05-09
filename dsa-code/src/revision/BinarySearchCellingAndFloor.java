package revision;public class BinarySearchCellingAndFloor {    public static void main(String args[]){        int[] array = {1,2,3,6,7,8,9,10};        System.out.println(findCelling(0,array.length-1,4,array));        System.out.println(findFloor(0,array.length-1,4,array));        System.out.println(findElementIndex(0,array.length-1,4,array));    }    static int findCelling(int start,int end,int target,int[] arr){        if(target > arr[arr.length-1]) {            return -1;        }        if(start > end){            return arr[start];        }        int mid = start + (end - start) / 2;        if(target > arr[mid]){            return findCelling(mid+1, end, target, arr);        }        if(target < arr[mid]){            return findCelling(start, mid-1, target, arr);        }        return arr[mid];    }    static int findFloor(int start,int end,int target,int[] arr){        if(target > arr[arr.length-1]) {            return -1;        }        if(start > end){            return arr[end];        }        int mid = start + (end - start) / 2;        if(target > arr[mid]){            return findFloor(mid+1, end, target, arr);        }        if(target < arr[mid]){            return findFloor(start, mid-1, target, arr);        }        return arr[mid];    }    static int findElementIndex(int start,int end,int target,int[] arr){        if(target > arr[arr.length-1]) {            return -1;        }        if(start > end){            return start;        }        int mid = start + (end - start) / 2;        if(target > arr[mid]){            return findElementIndex(mid+1, end, target, arr);        }        if(target < arr[mid]){            return findElementIndex(start, mid-1, target, arr);        }        return mid;    }}