import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String args[])
	{
		//List list=new LinkedList<>();//this is non-generic so accepts all kinds of datatypes
		List<Integer> list=new LinkedList<Integer>(); // this is generic only for integers
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println();
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		list.remove(0);
		list.remove(1);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		
		
		
	}

}
