package demo2;

public class buublesort {
	public static void main(String[]args) {
		
		int a[] = {20,30,10,40,50};
		int n = a.length;
		for(int i =0;i < n-1 ; i++)
		{
			for(int j = 0;j < n-1  ; j++)
			{
				int left= a[j];
				int right= a[j+1];
				
				if(left>right)
			   {
				int temp=left;
				 left=right;
				 right=temp;
				}
				
			}

	}

}
}

