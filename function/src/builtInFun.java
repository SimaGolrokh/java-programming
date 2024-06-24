public class builtInFun {// using the fun they already exist in java library
// creat a function that moves all the capital letter to the front of the string

     static String moveCapitalLettersToFront(String s) {
        StringBuilder result = new StringBuilder();
        int capitalIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                result.insert(capitalIndex++,c);
            }else {
                result.append(c);
            }
        }
        return result.toString();

    }


    public static void main(String[] args) {
        String s = "Hello World";
        String result = builtInFun.moveCapitalLettersToFront(s);
        System.out.println(result);
    }
}
