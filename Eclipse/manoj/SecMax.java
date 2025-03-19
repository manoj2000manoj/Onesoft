package manoj;

public class SecMax {
	public static void main(String[]args) {
		int[] nums= {24,6,95,38,65,78,104};
		int max=nums[0];
		int secmax=max;
		int thimax=secmax;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				
				thimax=secmax;
				secmax=max;
				max=nums[i];
			}
		
		if(nums[i]>secmax && nums[i]!=max) {
			secmax=nums[i];
		}
		if(nums[i]>thimax && nums[i]!=secmax && nums[i]!=max) {
			thimax=nums[i];
		}
	}
	System.out.println(secmax);
	System.out.println(thimax);

}
}


