package assignment2;

class FindMinimumLength {
    public static int minSubArrayLen(int goal, int[] nums) {
        int minimumLength = nums.length;
        int r = 0;
        int l = 0;
        int current = 0;
        int len = 0;
        while (r < nums.length) {
        	current += nums[r];
        	//System.out.println("current" + current);
        	while (current >= goal && l < r) {
        		current -= nums[l];
        		if(current >= goal) minimumLength = Math.min(len, minimumLength);
        		len -= 1;
        		l += 1;	
        	}
        	len += 1;
        	//System.out.println("len" + len);
        	r += 1;
        	if(current >= goal) minimumLength = Math.min(len, minimumLength);
        	
        }
        return minimumLength;
    }
    
    public static void main(String[] args) {
    	int[] array1 =   {1,2,3,1};
    	System.out.println(minSubArrayLen(11, array1)); 
    	int[] array2 =   {5, 6, 8, 2};
    	System.out.println(minSubArrayLen(7, array2));
    }
}

