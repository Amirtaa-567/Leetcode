class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            int value = 0;
            if (x == 'I') value = 1;
            else if (x == 'V') value = 5;
            else if (x == 'X') value = 10;
            else if (x == 'L') value = 50;
            else if (x == 'C') value = 100;
            else if (x == 'D') value = 500;
            else if (x == 'M') value = 1000;
            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);
                int nextValue = 0;
                if (next == 'I') nextValue = 1;
                else if (next == 'V') nextValue = 5;
                else if (next == 'X') nextValue = 10;
                else if (next == 'L') nextValue = 50;
                else if (next == 'C') nextValue = 100;
                else if (next == 'D') nextValue = 500;
                else if (next == 'M') nextValue = 1000;
                if (value < nextValue) {
                    num -= value;
                    continue;
                }
            }
            num += value;
        }
        return num;
    }
}
