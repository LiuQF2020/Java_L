package Map_L.Map_Output;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaMapOutput {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        // 将Map集合变为Set集合
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        /*
        Iterator<Map.Entry<String, Integer>> iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> me = iter.next();
            System.out.println(me.getKey() + " = " + me.getValue());
        }

         */
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
