class Prime 
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,5,6,7,8,9};
	    for(int i=0;i<a.length;i++)
		{
			 int temp=0;
			for(int j=2;j<=i-1;j++)
			{
				if(a[i]%j==1)
				{
					temp=temp+1;
				}
			}
				if(temp==0)
				{
					System.out.println(a[i]);
				}
			
		}
	}

}
