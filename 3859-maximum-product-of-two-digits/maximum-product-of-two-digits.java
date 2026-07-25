class Solution {
    public int maxProduct(int n) {
        String s=Integer.toString(n);
        int[]numbers=new int[s.length()];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=n%10;
            n=n/10;
        }
        int product=0;
        if(numbers.length==2){
            return (numbers[0]*numbers[1]);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
         for(int i=0;i<numbers.length;i++){
            pq.add(numbers[i]);
           
         }
         int num=pq.poll();
         product=num*pq.peek();
         return product;
       
        
    }
}