package Interviewcode;

public class mergetwoarrays {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int[] b= {50,60,70,80,90,100,120};
		int ar=a.length;
		int br=b.length;
		int cr=ar+br;
		int [] c=new int[cr];
		for(int i=0;i<ar;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<br;i++)
		{
			c[ar+i]=b[i];
		}
		for(int i=0;i<cr;i++)
		{
			System.out.print(c[i]+"  ");
		}
		
		

	}

}
