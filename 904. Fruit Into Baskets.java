class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>(2);
        int result = 0, i = 0, j = 0;

        while(j < fruits.length){
            map.put(fruits[j],j);
            if(map.size() > 2){
                int minIndex = fruits.length, minFruit = 0;
                for(Integer fruit : map.keySet()){
                    if(map.get(fruit) < minIndex){
                        minIndex = map.get(fruit);
                        minFruit = fruit;
                    }
                }
                
                i = minIndex + 1;
                map.remove(minFruit);
            }
            result = Math.max(result,j-i+1);
            j++;
        }

        return result;
    }
}
