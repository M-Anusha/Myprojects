package com.anusha.copy;

public class First_class 
{
	public static int findlarge(int arr[]){  

        int lar=0;  

        for(int i=1;i<arr.length;i++){  
        	if(lar<arr[i])  

                lar=arr[i];  
        }  

        return lar;  
} 

public static void main(String[] args)
	{

	}
}
