public class Main {


    class Solution {
        public int reverse(int x) {
            String int2String = "" + x;
            String reversed = "";
            for (int i = 0; i < int2String.length(); i++) {
                reversed += int2String.charAt(int2String.length() - i) - 1;
            }
            return Integer.parseInt(reversed);
        }

    }



}
