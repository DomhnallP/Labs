package lab3;

public class sortString
{
	String data;
	int highest;

	public sortString(String data)
	{
		this.data = data;
		highest = Integer.MIN_VALUE;
		
		for(int i=0;i<data.length();i++)
		{
			if((int)data.charAt(i)>highest)
			{
				highest= (int)data.charAt(i);
			}
		}
	}
}
