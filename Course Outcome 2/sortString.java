import java.util.*;
public class sortString
{
	public static void main(String[] args)
	{
		String s, str;
		String array[] = new String[10];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the String:");
		s=r.nextLine();
		array = s.split(" ");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].compareTo(array[j])>0)
				{
					str = array[i];
					array[i] = array[j];
					array[j] = str;
				}
			}
		}
		System.out.println("Sorted Order: ");
		for (int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		r.close();
	}
}
