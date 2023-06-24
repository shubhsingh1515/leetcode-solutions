class Solution {
    public int reverse(int x) {
    long sum=0;
    while (x!=0) {
      int dig =x%10;
      sum=sum*10+dig;
      x/=10;
    }

    return ((sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE) ? 0 : (int) sum);
  }
}

