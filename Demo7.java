

public class Demo7 {
    public static void main(String[] args) {
        byte mybyte = -24;
        System.out.println(Integer.toBinaryString(mybyte));
        System.out.println(mybyte);

        int [] a ={1,2};
        int [] b = new int [2];
        for (int i : b) {
            b[i]=a[i];
        }
        System.out.println(a==b);


        
        


    }
}
