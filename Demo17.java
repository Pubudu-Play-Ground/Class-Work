public class Demo17 {
    public static void main(String[] args) {
        byte myByte =-10;
        
        char myChar = (char)myByte;
        //System.out.println(Integer.toBinaryString(myByte));
        int myInt = myChar;
        short myShort = (short)myChar;
        byte myByte1= (byte)myChar;

        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(myByte1);
        System.out.println(Integer.toBinaryString(myInt));

        System.out.println("---------------------------");

        char myChar1 = (char) (myByte &0xff);   // to take a unsign variable
        //System.out.println(Integer.toBinaryString(myByte&0xFF));
        int myInt2 = myChar1;
        short myShort1 = (short)myChar1;
        byte myByte2 = (byte)myChar1;

        System.out.println(myInt2);
        System.out.println(myShort1);
        System.out.println(myByte2);
        System.out.println(Integer.toBinaryString(myInt2));

    }
}
