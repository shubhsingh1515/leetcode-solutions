class Spreadsheet {
    HashMap<String,Integer>hm=new HashMap<>();
    public Spreadsheet(int rows) {
    }
    
    public void setCell(String cell, int value) {
        hm.put(cell,value);
    }
    
    public void resetCell(String cell) {
        hm.put(cell,0);
    }
    
    public int getValue(String formula) {
        int ind=formula.indexOf('+');
        String s1=formula.substring(1,ind);
        String s2=formula.substring(ind+1);
        int l=Character.isLetter(s1.charAt(0))?hm.getOrDefault(s1,0):Integer.parseInt(s1);
        int r=Character.isLetter(s2.charAt(0))?hm.getOrDefault(s2,0):Integer.parseInt(s2);
        return l+r;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
