public class Demo13 {
    public static void main(String[] args) {

        final int x = 32;
        byte Byte = x; 
        final int y = 10*(int)Math.random();
        // byte Byte1 = y; -> Y is a runtime constant
        short Short1 = 355;               // -> narrowing primitive conversion : Compile time constant : should be in the value range 
        char CHar1 = 65; 

        byte Byte1 = 12;
        // char Char = Byte1;                 //error -> Byte1 is a variable

        final byte Byte2 = 123;
        char Char1 = Byte2;                 // widening narrowing primitive conversion

        //Char = Short;                     //error -> Short is a variable

        
        final int Int4 = 65;
        byte Byte3 = Int4;
        short Short2 = Int4;
        char Char2 = Int4;

        final long Long5 = 123;
        // byte Byte4 = Long5;                -> error

        long Long1 = Byte;
        float Float6 = Long1;          // ->

        long Long6 = 1234567891123L;
        System.out.println(Double.MAX_VALUE);
    }
}
