import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        String[] name = new String[5];
        name[0]="Shridhar";
        name[1]="Divya";
        name[2]="Abhishek";
        name[3]="Manish";
        name[4]="Rushi";

      Arrays.sort(name);

        for(String str:name)
        {
            System.out.println(str);
        }
    }
}