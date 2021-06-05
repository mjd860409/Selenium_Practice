package miscellaneous;

public class NewTest {

    public static void main(String[] args) {

        String s = "M@anasjyotidas";
        String arr[] = s.split( " ");
        String rev = "";

        for(int i = 0; i<arr.length; i++){
            String words = arr[i];
            String revWords = "";

            for (int j = words.length()-1; j>=0; j--){
                revWords = revWords + words.charAt(j) + " ";
            }

            rev = rev + revWords;

        }

        System.out.println(rev);

    }
}
