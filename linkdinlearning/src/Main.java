public class Main {
    public static void main(String[] args) {
        class Answer{
            static String truncate(String s, int maxLength) {
                // The bug lives in the code below.
                return s.substring(0, Math.max(s.length(), maxLength));
            }        }
    }
}
