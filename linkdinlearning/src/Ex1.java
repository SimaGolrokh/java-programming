public class Ex1 {// debugging exercise , it should return just the first 3 char
    public static void main(String[] args) {
        class Answer{
            static String truncate(String s, int maxLength) {
                // The bug was .max, which show the whole msg. when it is min it shows the char we want
                return s.substring(0, Math.min(s.length(), maxLength));
            }

            static String reverse(String s) {
                // The bug was = sign ,without it the reverse string did not have the last char
                StringBuilder reversed = new StringBuilder();
                for (int i = s.length()-1; i >= 0; i--) {
                    reversed.append(s.charAt(i));
                }
                return reversed.toString();
            }
        }
        String s = "hello";
        int maxLength = 3;
        String result = Answer.truncate(s, maxLength);

        String result1 = Answer.reverse(s);
        System.out.println(result1);


    }

}
