import java.util.*;
public class NextSmallestPalindrome {
	public static void main(String args[])
	{
		 int n;    
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 int arr[]=new int[n];

		 
		 //System.out.print("")
		 
		 for(int i=0;i<n;i++){
		 	arr[i]=sc.nextInt();	
		 }
		 for(int i=0;i<n;i++){
			 int result=0;
			 int inc=arr[i]+1;
			 while(result==0)
			 {
			 	result=check_palin(inc);
			 	inc++;
			 }
		 	System.out.print(result+" ");
		 }
		 sc.close(); 
	}
	public static int check_palin(int num)
	{
		int r,sum=0,temp;
		temp=num;    
		while(num>0)
		{    
			r=num%10;  //getting remainder	
			sum=(sum*10)+r;   
			num=num/10;    
		}    
		if(temp==sum)    
		{        
			return(sum);
		}	
		return 0;
	}
}
