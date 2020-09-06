package Collection_L.Collection_Output.ListIterator_L;

import java.util.*;

public class JavaListOutput {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("Hello, ");
        all.add("Hello, ");
        all.add("World, ");

        ListIterator<String> iter = all.listIterator();
        while (iter.hasNext()) {
            String str = iter.next();  // 由后向前输出
            // System.out.println(str);
        }
        while (iter.hasPrevious()) {
            String str = iter.previous();  // 由后向前输出
            System.out.println(str);
        }
    }
}
