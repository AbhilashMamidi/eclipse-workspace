package package1;

public class Pattern2 
{
	static int  hcf(int m,int n)
    {
    	while(m!=n)
    	{
    		if(m>n)
    		{
    			m=m-n;
    		}
    		else
    		{
    			n=n-m;
    		}
    	}
    	return m;
    }
    public static void main(String[] args) 
    {
    
    System.out.println(hcf(35, 56));
    }
} 
