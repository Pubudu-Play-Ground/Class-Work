public class Demo11 {
    public static void main(String[] args) {
        

        int id1 =10;
        String name1 = "Kasun";
        String address1 ="Kaluthara";

        int id2 = 11;
        String name2 = "Pubudu";
        String address2 = "Kandy";


        System.out.println("+-------+---------------+-----------------");
        System.out.printf("%s%s%s%s\n","\033[32;1mId\t|","\033[34mName\t|",
        "\033[35mAddress\t|","\033[0m");
        System.out.println("+-------+---------------+-----------------");
        System.out.printf("%s%s%s\n",id1+"\t|",name1+"\t|",address1+"\t|");
        System.out.printf("%s%s%s\n",id2+"\t|",name2+"\t|",address2+"\t\t|");
        System.out.println("+-------+---------------+-----------------");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //System.out.printf("%1$-10s %2$-10s %1$-10s %2$-10s %3$-10s %2$-10s",id1,name1,address1);
        //System.out.println();
         


        //System.out.printf("ID=%1$s Name=%2$s ID=%1$s Name=%2$s \n",id1,name1);

        
    }

}
