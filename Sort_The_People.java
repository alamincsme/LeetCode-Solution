import java.util.*;

public class Sort_The_People {
        public static String[] sortPeople(String[] names, int[] heights) {

            Map<Integer, List<String>> heightMap  = new TreeMap<>(Collections.reverseOrder());

            for (int i = 0 ; i < heights.length ; i ++) {
                int height =  heights[i];
                heightMap.computeIfAbsent(height, k -> new ArrayList<>()).add(names[i]);
            }

            List<String> sortedNames = new ArrayList<>();
            for (List<String> nameList : heightMap.values()) {
                Collections.sort(nameList);
                sortedNames.addAll(nameList);
            }

            return sortedNames.toArray(new String[0]);
        }

        public static void main(String[] args) {
            String[] ans = sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{150, 185, 150});
            for (String s : ans) {
                System.out.println(s);
            }
        }
    }


