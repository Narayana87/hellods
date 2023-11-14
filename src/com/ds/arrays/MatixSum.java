package com.ds.arrays;

public class MatixSum {
    public static void main(String[] args) {
        int[][] theArray = {{10,20,30},
                            {11,21,31},
                            {12,22,32}};
        int sum = 0;
        int sum2 = 0;
        System.out.println("Size of the Array "+ theArray.length);
        for(int i = 0; i<1; i++){
            for (int j = 0; j < 1; j++){
                for (int k =0; k < 1; k++){
                   // System.out.println(theArray[0][0]+", "+theArray[1][1] + " ,"+theArray[2][2]);
                    System.out.println(theArray[i][i]+", "+theArray[j+1][j+1] + " ,"+theArray[k+2][k+2]);
                    System.out.println(theArray[k][k]+", "+theArray[j+1][j+1] + " ,"+theArray[k][k]);
                    sum += theArray[i][i] + theArray[j+1][j+1]+theArray[k+2][k+2];
                    sum2 += theArray[i+2][i+2] + theArray[j+1][j+1]+theArray[k][k];
                }

            }
        }
        System.out.println("Sum of the right diagnoal Matrix is : "+sum);
        System.out.println("Sum of the left diagnoal matrix is : "+sum2);

        System.out.println(divide(2,3));
    }

   static  int divide(int a, int b){
        int c = -1;
        try{
            c = a/b;
        }catch(Exception e){
            System.err.print("Exception");
        }finally
        {System.err.println("finally");
        }
        return c;
    }
}

