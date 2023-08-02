public class Demo12 {
    public static void main(String[] args) {
        byte Byte = 10;                // ->

        short Short = Byte;
        short Short1 = 355;            // ->

        char Char = 'A';
        char CHar1 = 65;               // -> 

        //Char = Byte;                 error -> 
        //Char = short;                error ->
        // short Short1 = Char;        error -> in char 16bits use : short 15bits use

        int Int1 = Byte;
        int Int2 = Short;
        int Int3 = Char;

        long Long1 = Byte;
        long Long2 = Short;
        long Long3 = Char;
        long Long4 = Int1;
        
        // float Float = 32.23;        error -> float 32bits double 64
        float Float1 = 32.23f;

        float Float2 = Char;
        float Float3 = Int1;
        float Float4 = Byte;
        float Flaot5 = Short;
        float Float6 = Long1;          // ->

        double Double = Float1;
        double Double1 = 32.23;

        double Double2 = Byte;
        double Demo113 = Short;
        double Double4 = Int1;
        double Double5 = CHar1;
        double Double6 = Long1;

    }
}
