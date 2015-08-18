package com.anusha.copy;
public class Median {


	public	String[] rotate(String [] args )
	{
		String []a=new String[args.length];
		int i=0;
		while(i<args.length-1)
		{
			a[i+1]=(args[i]);
			i++;
		}
		a[0]=(args[i]);
		i=0;
		while(i<args.length)
		{
			System.out.println(a[i]);
			i++;
		}
		return a;
	}
	public int median1(String [] a){
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(Integer.parseInt(a[j])>Integer.parseInt(a[j+1]))
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("median: "+a[a.length/2]);
		return Integer.parseInt(a[a.length/2]);
	}
	public static void main(String[] args) {
		Median m=new Median();
		m.rotate(args);
		m.median1(args);
	}

}


