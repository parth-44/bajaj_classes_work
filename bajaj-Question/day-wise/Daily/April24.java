public class April24 {
}

// Search Insert Position
class SearchInsertSolution {

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return low;
    }
}

// Find Peak Element
class FindPeakSolution {

    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            }

            else {
                low = mid + 1;
            }
        }

        return low;
    }
}

// First Bad Version
class FirstBadVersionSolution extends VersionControl {

    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            }

            else {
                low = mid + 1;
            }
        }

        return low;
    }
}