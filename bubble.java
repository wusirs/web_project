import java.util.Arrays;

public class bubble{
	public static void main(String[] args){
		int[] nums = {14,19,8,9,1,78,29,45,23};

		 for(int i = 0; i < nums.length; i++){				                         System.out.print(nums[i]);
		}


		for(int i=0; i<nums.length - 1; i++){
			for(int j = 0; j < nums.length - i - 1; j ++){
				if(nums[j] > nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}

		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]);
		}

		System.out.println();
		System.out.println(Arrays.toString(nums));
	}
}
