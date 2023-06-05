/*
ProblemStatement
Collection - ArrayList
1)get
2)add
3)tostring

*/
public class MyGetMethod 
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
		System.out.println(list.myGet(3));
	}
	//EndOfMainMethod
}
class MyArrayList<T>
{
	int[] a=new int[5];
	int index=0;
	public void myAdd( int data)
	{
		if(index>=a.length)
		grow();
		a[index++]=data;
	}
	public Object myGet(int ind) 
	{
		for(int i=0; i<a.length; i++)
		{
			if(i==ind)
			return a[i];
		}
		return "out of range";
	}
	public void grow()
	{
		int[] b=new int[a.length*2];
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
	public String toString()
	{
		return null;
	}
}
