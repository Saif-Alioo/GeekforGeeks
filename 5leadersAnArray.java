class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    if (j == arr.length - 1) {
                        l.add(arr[i]);
                    }
                }
                else{
                    break;
                }
            }
        }
        l.add(arr[arr.length - 1]);
        return l;
    }
}
