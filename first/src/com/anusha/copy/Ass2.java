package com.anusha.copy;

public class Ass2 {
	public static int[] rotate(int arr[])
	{
		int rot[]=new int[arr.length];
		for(int i=0;i<=arr.length;i++)
		{
			if(i==(arr.length-1))
			rot[0]=arr[i];
			rot[i]=arr[i-1];
			
		}
		return rot;
		
	}
	public static void main(String[] args)
	{
		int a[]=new int[args.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			System.out.println(a);
		}
		rotate(a);
	}

}