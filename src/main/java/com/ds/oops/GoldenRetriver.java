package com.ds.oops;

public class GoldenRetriver extends  Dog{
    @Override
    public void makenoise() {
        super.makenoise();
        System.out.println("Make golden Retriver Noise");
    }

    public static void main(String[] args) {
        Dog dog = new GoldenRetriver();
        dog.makenoise();
    }
    int binarySearch(int arr[], int l, int r, int x){
        if( r >= l){
            int mid = l+(r-1)/2;
            if(arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l,mid + 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
