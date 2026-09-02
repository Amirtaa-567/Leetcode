class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();

        String current = "";
        int number = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                counts.push(number);
                strings.push(current);
                number = 0;
                current = "";
            } else if (ch == ']') {
                int count = counts.pop();
                String previous = strings.pop();

                StringBuilder temp = new StringBuilder(previous);

                for (int i = 0; i < count; i++)
                    temp.append(current);

                current = temp.toString();
            } else {
                current += ch;
            }
        }

        return current;
    }
}