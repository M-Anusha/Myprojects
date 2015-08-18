package com.anusha.copy;

public class Ass3 {
	public static int findlarge(int arr[]){  

		 int lar=arr[0];  

        for(int i=1;i<arr.length;i++){  
        	 

            if(lar<arr[i])  

                lar=arr[i];  

        }  

        return lar;  

 } 
}
