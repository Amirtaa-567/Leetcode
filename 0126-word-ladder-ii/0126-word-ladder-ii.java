class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord,
                                           List<String> wordList) {
        List<List<String>> result = new ArrayList<>();

        HashSet<String> words = new HashSet<>(wordList);

        if (!words.contains(endWord)) {
            return result;
        }

        HashMap<String, List<String>> parents = new HashMap<>();
        HashSet<String> current = new HashSet<>();
        current.add(beginWord);

        boolean found = false;

        while (!current.isEmpty() && !found) {
            words.removeAll(current);

            HashSet<String> next = new HashSet<>();

            for (String word : current) {
                char[] chars = word.toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    char original = chars[i];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) {
                            continue;
                        }

                        chars[i] = c;
                        String newWord = new String(chars);

                        if (words.contains(newWord)) {
                            next.add(newWord);

                            parents.putIfAbsent(newWord, new ArrayList<>());
                            parents.get(newWord).add(word);

                            if (newWord.equals(endWord)) {
                                found = true;
                            }
                        }
                    }

                    chars[i] = original;
                }
            }

            current = next;
        }

        if (!found) {
            return result;
        }

        List<String> path = new ArrayList<>();
        path.add(endWord);

        dfs(endWord, beginWord, parents, path, result);

        return result;
    }

    public void dfs(String word, String beginWord,
                    HashMap<String, List<String>> parents,
                    List<String> path,
                    List<List<String>> result) {
        if (word.equals(beginWord)) {
            List<String> current = new ArrayList<>(path);
            Collections.reverse(current);
            result.add(current);
            return;
        }

        if (!parents.containsKey(word)) {
            return;
        }

        for (String parent : parents.get(word)) {
            path.add(parent);
            dfs(parent, beginWord, parents, path, result);
            path.remove(path.size() - 1);
        }
    }
}
