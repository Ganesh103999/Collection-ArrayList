/*

ProblemStatement
Implement Collectiomn List method
1) Add
2) toString
*/

public class MytoStringMethod 
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
		System.out.println(list);
	}
	//EndOfMainMethod
}
@SuppressWarnings("unchecked")
class MyArrayList<T>
{
	int[] a=new int[5];
	int index=0;
	@SuppressWarnings("unchecked")
	public void myAdd(int data)
	{
		if(index>=a.length)
		grow();
		a[index++]=data;
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
	@SuppressWarnings("unchecked")
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
