
/*
ProblemStatement
implement collection List 
1) AddAt(int index,T  data)
2)toString

*/
public class myAddAtMethod
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
		list.myAdd(66);
		list.myAdd(77);
		list.myAdd(88);
		list.myAdd(99);
		list.myAdd(11);
		list.myAddAt(13, 100);
		System.out.println(list);
	}
	//EndOfMainMethod
}
class MyArrayList<T>
{
	int[] a=new int[5];
	int index=0;
	@SuppressWarnings("unchecked")
	public void myAdd( int data)
	{
		if(index>=a.length)
		grow();
		a[index++]=data;
	}
	@SuppressWarnings("unchecked")
	public void myAddAt(int ind,int data)
	{
		if(index>=a.length)
		grow();
		int i=index;
		for(;i>ind; i--)
		a[i]=a[i-1];
		a[i]=data;
		index++;
	}
	@SuppressWarnings("unchecked")
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
		String s="[";
		for(int i=0; i<index; i++)
		{
			if(i<index-1)
			s=s+a[i]+", ";
			else
			s=s+a[i];
		}
		s=s+"]";
		return s;
	}
}

