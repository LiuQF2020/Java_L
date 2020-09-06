package Collection_L.List_L.ArrayList_L;

import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        // 为List接口进行实例化
        List<String> all = new ArrayList<>();
        all.add("Hello");


        // 重复数据
        all.add("Hello");
        all.add("World.");
        // System.out.println(all);

        /*
        在JDK1.8之后Iterable父接口之中定义有一个forEach()方法：
	    输出支持：default void (Consumer<? super T> action)
         */
        all.forEach((str) -> {
            System.out.print(str + ", ");
        });


    }
}
