package ImportantPrograms;

import java.io.*;
public class Coins {
	static long a[] = new long[100];
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = 100;
		long i;
                
                //Initialize array with required values so it can be reused later
		for(i=1;i<n;i++)
		{
			long r = a[(int)i/2]+a[(int) (i/3)]+a[(int) (i/4)];
			a[(int) i] = Math.max(i,r);
		}
		
                while(true){
                try{
		String s = br.readLine();//throws IOException
		n = Long.parseLong(s);
                }
                catch(Exception e){break;} //Breaks the loop when the input is null
			
		System.out.println(getmax(n));
                }
	}
	public static long getmax(long n)
	{
		if(n==0)return 0;
                
		else if(n<100 && a[(int) n]!=0)
               		 return ( a[(int) n]);
          //For larger values      
		else 
           		 return Math.max(n,getmax(n/2)+getmax(n/3)+getmax(n/4));
		
	}
	
}
