class MultipliArray
{
	static boolean[] multipliArray(int[]a, int[]b)
	{
		boolean[] r;
		
		if(a!=null && b!=null)
		{
			if(a.length <= b.length)
			{
				r = new boolean[a.length];
			   
			}
			else
			{
				r = new boolean[b.length];
			}
			   
			for (int i=0; i<r.length; i++)
			{
				r[i] = (a[i]%b[i])==0 || (b[i]%a[i])==0;
			}   
		}
		else
		{
			r = null;
		}
		
		return r;
	}
	
	

	public static void main(String[] args) 
	{
		System.out.println("L'array a e:");
		int[] a = {2, 7, 8, 23, 7, 12, 7, 34, 89, 2, 7, 5};
		int i = 0;
		
		while (i < a.length)
		{
			System.out.print(a[i] + "|");
			i++;
		}
		System.out.printf("%n");
		
		System.out.println("l'array b e:");
		int[] b = {4, 14, 4, 2, 34, 12, 56, 1, 3, 90, 12, 15};
		int y = 0;
		
		while (y < b.length)
		{
			System.out.print(b[y] + "|");
			y++;
		}
		System.out.printf("%n");
		
		System.out.println("L'array r e:");
		boolean[]r;
		r = multipliArray(a,b);
		
		int z = 0;
		
		while (z < r.length)
		{
			System.out.print(r[z] + "|");
			z++;
		}
		System.out.printf("%n");
    }
}