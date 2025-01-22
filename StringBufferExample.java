public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer("World");
        StringBuffer s3 = new StringBuffer("World");
        StringBuffer s4 = new StringBuffer("hello");

        StringBuffer s5 = new StringBuffer("World");

        System.out.println(s1.append(s2));

        System.out.println(s2.toString().equals(s3.toString()));
        System.out.println(s1.toString().equals(s3.toString()));
        System.out.println(s1.toString().equalsIgnoreCase(s4.toString()));
        System.out.println(s3.replace(s3.indexOf("r"), s3.indexOf("r") + 1, "R"));

        System.out.println(s1.indexOf("Hel") != -1);
        System.out.println(s2.indexOf("e") != -1);
        System.out.println(s1.indexOf("Hi") == -1); 

        System.out.println(s1.toString().hashCode());
        System.out.println(s2.toString().hashCode());
        System.out.println(s3.toString().hashCode());
        System.out.println(s5.toString().hashCode());
    }
}
