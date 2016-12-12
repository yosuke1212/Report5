/**
 * Created by e165717 on 2016/12/13.
 */
public class Main {
    public static void main(String arg[]) {
        String str = "3．14";
        try {
            System.out.println(str.length());
            Double.parseDouble(str);
        } catch (java.lang.NullPointerException er) {
            System.out.println("NullPointerExceptionが発生しました");
            er.printStackTrace();
        }
    }
}