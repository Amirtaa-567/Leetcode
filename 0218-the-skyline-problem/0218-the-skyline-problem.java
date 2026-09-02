class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> points = new ArrayList<>();

        for (int[] b : buildings) {
            points.add(new int[]{b[0], -b[2]});
            points.add(new int[]{b[1], b[2]});
        }

        points.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 1);

        List<List<Integer>> result = new ArrayList<>();
        int previous = 0;

        for (int[] point : points) {
            int x = point[0];
            int h = point[1];

            if (h < 0) {
                int height = -h;
                map.put(height, map.getOrDefault(height, 0) + 1);
            } else {
                int count = map.get(h);

                if (count == 1) {
                    map.remove(h);
                } else {
                    map.put(h, count - 1);
                }
            }

            int current = map.lastKey();

            if (current != previous) {
                result.add(Arrays.asList(x, current));
                previous = current;
            }
        }

        return result;
    }
}