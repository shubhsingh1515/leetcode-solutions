class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0')
            return 0;

        if (s.length() == 1)
            return 1;

        int prevCount1 = 1, prevCount2 = 1;
        for (int i = 1; i < s.length(); i++) {
            int currentDigit = s.charAt(i) - '0';
            int twoDigitCombo = (s.charAt(i - 1) - '0') * 10 + currentDigit;
            int currentCount = 0;

            if (currentDigit > 0)
                currentCount += prevCount2;

            if (twoDigitCombo >= 10 && twoDigitCombo <= 26)
                currentCount += prevCount1;

            prevCount1 = prevCount2;
            prevCount2 = currentCount;
        }

        return prevCount2;
    }
}
