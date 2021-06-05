package miscellaneous;

public class HalfPyramid {

    public static void main(String[] args) {

        //Expected output : 12345

        //1234

        //123

        int num = 12345;
        int temp = num;

        while (temp>0)
        {
            int rev = temp % 10;
            temp = temp/10;
        }
        System.out.println();

    }
}
