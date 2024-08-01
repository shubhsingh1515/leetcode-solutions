class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        // for (int i = 0; i < details.length; i++) {
        //     String ageStr = details[i].substring(11, 13);
        //     int age = Integer.parseInt(ageStr);

        //     if (age > 60) {
        //         cnt++;
        //     }
        // }
        // return cnt;
        for (String detail : details) {
            if ( (detail.charAt(11) >= '6' ) && (detail.charAt(10) == 'M' || detail.charAt(10) == 'F' || detail.charAt(10) == 'O')) {
                if(detail.charAt(11)=='6' && detail.charAt(12)=='0'){
                    continue;
                }
                else{
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
