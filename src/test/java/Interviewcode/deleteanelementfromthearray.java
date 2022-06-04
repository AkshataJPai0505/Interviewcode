package Interviewcode;

public class deleteanelementfromthearray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		int deleteitem=40;
		
		System.out.println("Array before deleting an element");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println("\n");
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(deleteitem==a[i])
			 {
				 for(int j=i;j<a.length-1;j++)
				 {
					 a[j]=a[j+1];
				 }
				 break;
			 }
              
		 }
		 
		 System.out.println("Array after deleting an element");
		 for(int i=0;i<a.length-1;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		

	}

}
