
class Solution {
    public int[] avoidFlood(int[] rains) {
        int len = rains.length;
        Map<Integer, Integer> lastRainedDay = new HashMap<>();
        TreeSet<Integer> availableDryDays = new TreeSet<>();
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            int currentLake = rains[i];

            if (currentLake == 0) {
                result[i] = 1;
                availableDryDays.add(i);
            } else {
                result[i] = -1;

                if (lastRainedDay.containsKey(currentLake)) {
                    int lastDay = lastRainedDay.get(currentLake);
                    Integer chosenDryDay = availableDryDays.higher(lastDay);

                    if (chosenDryDay == null)
                        return new int[0];

                    result[chosenDryDay] = currentLake;
                    availableDryDays.remove(chosenDryDay);
                }

                lastRainedDay.put(currentLake, i);
            }
        }

        return result;
    }
}
