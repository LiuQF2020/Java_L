package Collection_L.Collection_Output.Iterator_L;

import java.util.*;

public class JavaCollectionOutput {
    public static void main(String[] args) {
        Set<String> all = new HashSet<>();
        all.add("Hello, ");
        all.add("Hello, ");
        all.add("World, ");

        Iterator<String> iter = all.iterator(); // 实例化iterator对象
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
