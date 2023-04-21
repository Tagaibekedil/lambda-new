import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringReverter stringReverter;
        List<String>list=new ArrayList<>();
        stringReverter = str -> {

            char[] chars = str.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                list.add( String.valueOf(chars[i]));
            }str=String.valueOf(list);
            return str;
        };
        System.out.println(stringReverter.revert("Собака"));
        list.forEach(str-> System.out.print(str));



    }

    @FunctionalInterface
    interface StringReverter {
        String revert(String str);
    }
}