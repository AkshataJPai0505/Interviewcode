package Interviewcode;

public class minvalueinarray {

	public static void main(String[] args) {
		int a[]= {7,8,9,4,6,5,2};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
					{
				min=a[i];
					}
		}
		System.out.println("The maximum value is "+min);

	}


	}


