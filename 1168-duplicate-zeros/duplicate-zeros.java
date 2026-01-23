class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList <Integer>list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                list.add(0);
                list.add(0);
            }
            else{
                list.add(arr[i]);
            }
        }
         for(int j=0;j<n;j++) {
            arr[j]=list.get(j);

         }

    }
}