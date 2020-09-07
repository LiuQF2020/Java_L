package Map_L.HashMap_L;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();

        System.out.println(map.put("one", 1)); // key不重复
        System.out.println(map.put("one", 101)); // key重复
    }
}
