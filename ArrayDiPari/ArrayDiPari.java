class ArrayDiPari
{   
    public static int[] OnlyPari(int[] a)
	{       
        int[] b=new int[a.length];
        int i=0; int j=0;
       
        while(i<a.length)
		{           
            if(a[i]%2==0)
			{
                b[j]=a[i];
                j++;
            }
			
			i++;
        }
		
        return b;
    }          
 
    public static void main(String[] args)
	{   
        int[] a=new int[]{5,6,10,43,32,15,78,100,2,4,0};
        int[] b=new int[a.length];
        int i=0; int j=0;
           
        System.out.println("L'array e:");
           
        while(i<a.length)
		{
			System.out.println(a[i]);
			i++;
        }
           
        System.out.println("L'Array Di pari e il seguente:");
        b=OnlyPari(a);
       
        while(j<b.length)
		{
			System.out.println(b[j]);
			j=j+1;
        }
    }
}