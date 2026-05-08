class CapacityToShipPackages {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            int dayCount = 1;
            int sum = 0;

            for (int w : weights) {

                if (sum + w > mid) {
                    dayCount++;
                    sum = 0;
                }

                sum += w;
            }

            if (dayCount <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
