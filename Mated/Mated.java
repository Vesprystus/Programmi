class Mated
{
	public static void main(String[] args)
	{
		int a=0; int b=0; int c=0; int d=0;
		int r=0;
		
		while(a<11)
		{
			while(b<11)
			{
				while(c<11)
				{
					while(d<11)
					{
						if((a+b+c+d)==11)
						{
							r++;
						}
						
						d++;
					}
					d=0;
					c++;
				}
				c=0;
				b++;
			}
			b=0;
			a++;
		}
		
		System.out.println(r);
	}
}