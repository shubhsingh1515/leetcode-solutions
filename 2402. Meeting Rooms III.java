class Solution {
    public int mostBooked(int n, int[][] m) {
        int[] c = new int[n];
        long[] t = new long[n];

        Arrays.sort(m, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] x : m) {
            int s = x[0], e = x[1];
            int r = -1;
            long min = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (t[i] <= s) {
                    t[i] = e;
                    c[i]++;
                    r = -1;
                    break;
                }
                if (t[i] < min) {
                    min = t[i];
                    r = i;
                }
            }

            if (r != -1) {
                t[r] += e - s;
                c[r]++;
            }
        }

        int res = 0;
        for (int i = 1; i < n; i++)
            if (c[i] > c[res]) res = i;
        return res;
    }
}
