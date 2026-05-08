import java.util.*;

// ================= SECOND LARGEST =================

class SecondLargest {

    public int getSecondLargest(int[] arr) {

        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        return (secMax == Integer.MIN_VALUE) ? -1 : secMax;
    }
}


// ================= LEADERS IN ARRAY =================

class Leaders {

    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}


// ================= EQUILIBRIUM POINT =================

class Equilibrium {

    public static int findEquilibrium(int arr[]) {

        int total = 0;

        for (int x : arr) {
            total += x;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            // right sum
            int rightSum = total - leftSum - arr[i];

            // equilibrium check
            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}