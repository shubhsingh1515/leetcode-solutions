class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int[] smallerThanPivot = new int[nums.length];  
        int[] largerThanPivot = new int[nums.length];  
        int pivotCount = 0;  
        int smallerIndex = 0;  
        int largerIndex = 0;  

        for (int number : nums) {  
            if (number <pivot) {  
                smallerThanPivot[smallerIndex++] = number;  
            } else if (number >pivot) {  
                largerThanPivot[largerIndex++] = number;  
            } else {  
                pivotCount++; 
            }  
        }  
 
        while (pivotCount > 0) {  
            smallerThanPivot[smallerIndex++] =pivot;  
            pivotCount--;  
        }  
 
        for (int i = 0; i < largerIndex; i++) {  
            smallerThanPivot[smallerIndex++] = largerThanPivot[i];  
        }  

        return smallerThanPivot; 
    }
}
