import java.util.LinkedList;

public class Main {

//    Написать метод, который в полученной на вход произвольной строке (например aaabbrrrrfll),
//    считает количество подряд идущих символов и на выходе возращает сторку вида: 3a;2b;4r;1f;2l

    public static void main(String[] args) {
        System.out.println(foo("aaabbrrrrfllaa"));
    }

    public static String foo(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : chars) {
            if (list.isEmpty() || list.getLast() == c) {
                list.add(c);
                continue;
            }
            foo1(list, stringBuilder);
            list.add(c);
        }
        foo1(list, stringBuilder);
        return stringBuilder.toString();
    }

    private static void foo1(LinkedList<Character> list, StringBuilder stringBuilder) {
        stringBuilder.append(list.size()).append(list.getLast()).append(";");
        list.clear();
    }
}
