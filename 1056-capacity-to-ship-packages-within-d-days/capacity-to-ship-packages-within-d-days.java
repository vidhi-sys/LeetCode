class Solution {
    public boolean possible(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int daysNeeded = 1; // Start with 1 day
        
        for (int weight : weights) {
            // If adding this weight exceeds capacity, we need a new day
            if (currentLoad + weight > capacity) {
                daysNeeded++;
                currentLoad = weight;
                
                // If we exceed the allowed days or if a single weight exceeds capacity
                if (daysNeeded > days || weight > capacity) {
                    return false;
                }
            } else {
                currentLoad += weight;
            }
        }
        
        return daysNeeded <= days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        // Find the minimum and maximum possible capacity
        int maxWeight = 0; // Maximum single weight
        int totalWeight = 0; // Sum of all weights
        
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }
        
        // Binary search between maxWeight and totalWeight
        int left = maxWeight;
        int right = totalWeight;
        int result = totalWeight;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (possible(weights, days, mid)) {
                result = mid;
                right = mid - 1; // Try for smaller capacity
            } else {
                left = mid + 1; // Need larger capacity
            }
        }
        
        return result;
    }
}