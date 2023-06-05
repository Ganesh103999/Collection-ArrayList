/*
ProblemStatement
Collection - ArrayList
1)toArray
2)Add
3)toString

*/

public class myToArrayInArrayList 
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
		int[] a=list.myToArray();
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
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
	int[] myToArray()
	{
		int[] c=new int[index];
		for(int i=0; i<index; i++)
		{
			c[i]=a[i];
		}
		return c;
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
}


			
/*
Expected Output:
11 22 33 44 55 11 22 33 44 55 22 33 44 55 

*/
