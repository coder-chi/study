package string;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/31 19:29
 */
public class Main {
    public static void main(String[] args) {
//        String a = "abc";
//        String b = "abc";
//        String c = new String("abc");
//        String d = "a" + "bc";
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(a==d);

        String abc = new String("0");
        System.out.println(abc == "0");

        String name = new String("Name");
        String name2 = new String("Name");
        System.out.println(name == name2);

    }
}
