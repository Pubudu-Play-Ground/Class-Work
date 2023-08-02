public class Demo20 {
    public static void main(String[] args) {
        // convert any data type to a string [primitive/reference]
        int x= 10;
        String s = x+"";
        
        boolean my = true;
        String s2 = my+"";

        // string -> primitive data type

        /*wrappers
         * Byte
         * Short
         * Character   --> "ABC".charAt(index)
         * Integer
         * Long
         * Double
         * Floeat
         * 
         */

         String myStr = "10";
         int Int = Integer.valueOf(myStr);

         String myStr2 = "0.23";
         double Dou = Double.valueOf(myStr2);
         boolean myB = Boolean.valueOf(myStr2);
         System.out.println(myB);

         String mystr3 = "jdfgadciu";
         long Long1 = Long.valueOf(mystr3);




    }
}
