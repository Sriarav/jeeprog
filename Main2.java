import java.util.*;
import java.lang.*;
import java.io.*;
public class Main2 
{
	static void insertAndPrint(AbstractMap<Integer,String> map)
	{
	int[] array= {1,-1,0,2,-2};
	for(int x: array)
	{
		map.put(x,Integer.toString(x));
	}
		for(int k: map.keySet())
		{
			System.out.println(k+",");
		}
	}
	public static void main(String argv[])
	{
		HashMap<Integer,String>map= new HashMap<Integer,String>();
		insertAndPrint(map);
	}
}
