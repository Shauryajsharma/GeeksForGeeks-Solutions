class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int count =0;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<n; i++)
       {
         if(map.containsKey(a[i]))
            map.put(a[i],map.get(a[i])+1); 
         else 
         map.put(a[i],1);
       }
         for(int i=0; i<m; i++)
       {
         if(map.containsKey(b[i]))
            map.put(b[i],map.get(b[i])+1); 
         else 
         map.put(b[i],1);
       }
        for (Integer key : map.keySet()){

           count++;
       }
       return count;
    }
}