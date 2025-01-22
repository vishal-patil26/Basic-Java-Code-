public class string {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "World";
        String s4 = "hello";

        String s5 = new String("World");

        System.out.println(s1.concat(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s3.replace('r','R'));

        System.out.println(s1.contains("Hel"));
        System.out.println(s2.contains("e"));
        System.out.println(s1.contains("Hi"));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s5.hashCode());
    }
    
}
