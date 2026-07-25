class Solution {
    public int maxProduct(int n) {
        String s=Integer.toString(n);
        int[]numbers=new int[s.length()];
          int len=numbers.length;
        for(int i=0;i<len;i++){
            numbers[i]=n%10;
            n=n/10;
        }
        int product=0;
        if(numbers.length==2){
            return (numbers[0]*numbers[1]);
        }
      
        Arrays.sort(numbers);
        return (numbers[len-1]*numbers[len-2]);
        
    }
}