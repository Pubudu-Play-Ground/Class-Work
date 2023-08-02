public class Demo14 {
    public static void main(String[] args) {
        byte myByte = 10;
        int myInt = myByte;

        System.out.println(Integer.toBinaryString(myInt));

        int myInt2 = Integer.parseInt(Integer.toBinaryString(myInt));

        //System.out.printf("%032d\n",myInt);
        System.out.printf("%032d",myInt2);

        int z = 10;       //variable
        final int x=z;    //runtime constant
        // byte y1 = x;
        

        final int x1 = 12; //compile time constant
        final int y3 = x1; //compile time constant
        byte z2=y3;

        final byte mybyte1 = (byte)Math.random();  //runtime constant
        final int myInt3 = mybyte1;                //runtime conatant

        
    }
}
