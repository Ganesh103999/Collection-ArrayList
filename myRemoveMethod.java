/*
ProblemStatement
Collection - ArrayList
1)Remove
2)Add
3)toString

*/

public class myRemoveMethod 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		MyArrayList<Integer> list=new MyArrayList<>();
		list.myAdd(11);
		list.myAdd(22);
		list.myAdd(33);
		list.myAdd(44);
		list.myAdd(55);
		list.myAdd(11);
		list.myAdd(22);
		list.myAdd(33);
		list.myAdd(44);
		list.myAdd(55);
		list.myRemove(22);
		System.out.println(list);
	}
	//EndOfMainMethod
}
class MyArrayList<T> 
{
	int[] a=new int[5];
	int index=0;
	public void myAdd(int data) 
	{
		if(index>=a.length)
		grow();
		a[index++]=data;
	}
	
	void myRemove(int inde)
	{
		if(inde<0 || inde>=index)
	
	    {
		System.out.println("out of bounds");
		System.exit(0);
	    }
	   for(int i=inde; i<index; i++)
	  {	
		a[i]=a[i+1];
	  }
	index--;
	}
	
	public void grow() 
	{
		int[] b=new int[a.length*2];
		for(int i=0; i<index; i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
	
	public String toString()
	{
		String s2="[";
		for(int i=0; i<index; i++)
		{
			if(i<index-1)
			s2=s2+a[i]+", ";
			else
			s2=s2+a[i];
		}
		s2=s2+"]";
		return s2;
	}
}


	