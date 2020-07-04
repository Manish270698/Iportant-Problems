package ImportantPrograms;

import java.io.*;
public class Coins {
	static long dp[] = new long[100];
	public static void main(String args[]) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		long n = 100;
		long i;
                
                //Initialize array with required values so it can be reused later
		for(i=1;i<n;i++)
		{
			long r = dp[(int)i/2]+dp[(int) (i/3)]+dp[(int) (i/4)];
			dp[(int) i] = Math.max(i,r);
		}
		
                while(true){
                try{
		String s = stdin.readLine();//throws IOException
		n = Long.parseLong(s);
                }
                catch(Exception e){break;} //Breaks the loop when the input is null
			
		System.out.println(getmax(n));
                }
	}
	public static long getmax(long n)
	{
		if(n==0)return 0;
                
		else if(n<100 && dp[(int) n]!=0)
                return ( dp[(int) n]);
          //For larger values      
		else 
            return Math.max(n,getmax(n/2)+getmax(n/3)+getmax(n/4));
		
	}
	
}
