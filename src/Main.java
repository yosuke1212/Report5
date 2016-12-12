/**
 * Created by e165717 on 2016/12/13.
 */
public class Main {
    public static void main(String arg[]) {
        try {
            String str;
            int len;
            str = "3. 14";
            double value = Double.parseDouble(str);
            len = str.length();
            System.out.println(len);
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
            return;
        }

    }
}


