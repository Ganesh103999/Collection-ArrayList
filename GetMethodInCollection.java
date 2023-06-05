public class GetMethodInCollection
{
	public static void main(String[] args)
	{
		


/*
ProblemStatement
Collection - ArrayList
1)get
2)add
3)tostring

*/

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
	private Object a[]=new Object[5];
	private int index=0;
	public void myAdd( T data)
	{
		if(index>=a.length)
		grow();
		a[index++]=data;
	}
	public Object myGet(int ind) 
	{
		for(int i=0; i<a.length;i++)
		{
			if(i==ind)
			return a[i];
		}
		return "out of range";
	}
	public void grow()
	{
		Object[] b=new Object[a.length*2];
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
/*

OutPut
44
*/
