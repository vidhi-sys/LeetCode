class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currentSurplus = 0, start = 0;

    for (int i = 0; i < gas.length; ++i) {
        totalGas += gas[i];
        totalCost += cost[i];
        currentSurplus += gas[i] - cost[i];

        if (currentSurplus < 0) {
            start = i + 1;
            currentSurplus = 0;
        }
    }

    return (totalGas >= totalCost) ? start : -1;
        
    }
}