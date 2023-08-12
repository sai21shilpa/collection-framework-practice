import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<Integer>(20);//Generic as it holds only integers
		//with initial capacity of 20 and default value is 10 if not specified
		//List<Integer> =new ArrayList<>(); this is non-generic
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list.get(0));//index 0
		System.out.println(list.get(1));//index 1
		System.out.println(list.get(2));//index 2
		System.out.println(list.get(3));//index 3
		System.out.println(list.get(4));//index 4
		System.out.println(list.get(5));//index 5
		
		
		System.out.println();
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		list.remove(1); //insert the index so the second element 2 must be deleted
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
