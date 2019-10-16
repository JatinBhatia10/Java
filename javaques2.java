class l {
public boolean more14(int[] nums)
{
	int balance = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(nums[i] == 1)
			balance++;
		else if(nums[i] == 4)
			balance--;
	}
	return (balance > 0);
}
public static void main ()
{ l obj = new l();
    int[] nums = null;
 obj.more14(nums);
    
}
}