public class VariableSizeSubarray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3};
        int k = 7;
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println("Max length of subarray with sum <= " + k + " is: " + maxLength);
    }
}