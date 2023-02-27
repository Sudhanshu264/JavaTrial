
// Jagged array



public class Array8{
	public static void main(String[] args){
		int nums[][]= new int[3][2];
		nums[0]=new int[4];
		nums[1]=new int[2];
		nums[2]=new int[3];
		nums[0][0]=3;
		nums[0][1]=9;
		nums[0][2]=9;
		nums[0][3]=9;
        nums[1][0]=5;
    	nums[1][1]=7;
		nums[2][0]=1;
		nums[2][1]=4;
        nums[2][2]=1;
		


		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		} 
	}
}








