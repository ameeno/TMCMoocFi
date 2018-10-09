public class StringUtils {

    public static boolean included(String word, String searched) {

        if (word == null || searched == null) {
            return false;
        }
        if(word.trim().toUpperCase().equals(searched.trim().toUpperCase())){return true;}
        return false;
    }
}
