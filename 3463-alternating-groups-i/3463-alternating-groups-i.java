class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;

        for (int i = 0; i < colors.length; i++) {
            // color[(i + 1) % color.length] if i+1 is smaller than color.length se to i+1
            // he hoga otherwise jo remainder aayega vo hoga
            if (colors[(i + 1) % colors.length] != colors[i]) {
                if (colors[i] == colors[(i + 2) % colors.length]) {
                    count += 1;
                }
            }
        }

        return count;
    }
}