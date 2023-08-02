import java.util.Calendar;

public class Demo16 {
    public static void main(String[] args) {
        byte myByte = 10;

        final int myInt = 10;
        byte myByte1 = myInt;

        int myInt1 = 10;
        byte myByte2 = (byte)myInt1;

        System.out.println(myByte2);

        byte myByte3 = (byte)259;
        System.out.println(myByte3);

        //byte myByte4 = (byte)(2>3);
        byte mybyte5 = (byte)(10+250);
        //byte myByte6 = (byte)"abc";

        Object a =25;
        byte myByte7 = (byte)a;

        Object b = "abcd";
        byte myByte8 = (byte)b;       //runtime error. compile time tyep cheking ok.-> reference datatype
                                      //class cast exception error

        // Calendar C = Calendar.getInstance();
        // byte myByte9 = (byte)C;


    }
}
