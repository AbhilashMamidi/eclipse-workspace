package collection;

import java.util.Comparator;

public class MyComp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		if(o1<02)
		{
			return 1;
		}
		if(o1>o2)
		{
			return -1;
		}
		return 0;
	}

}
