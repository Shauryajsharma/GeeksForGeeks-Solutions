class Geeks {
    // Complete this function
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum) {
        // Your code here, Geeks
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int i = 0; i < N; i++)
        {
            int temp = sum - arr[i];
            if (hset.contains(temp))
                return 1;
            else
                hset.add(arr[i]);
        }
        return 0;
    }
}