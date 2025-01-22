public class primeWrapper {
    public static void main(String [] args)
    {
        int num=30;
        Integer iNum = num;
        int x = iNum;
        System.out.println("iNum : "+iNum+", x:"+x);

    //  Float fNum = new Float(27.9f);
        Float fNum = Float.valueOf(27.9f);
        float y = fNum.floatValue();
        System.out.println("y :"+y);

    // Character ch = new Character('I'); 
        Character ch = Character.valueOf('I');
        char c = ch.charValue();
        System.out.println("c:"+c);

    //  Double dNum = new Double(27.99);
        Double dNum = Double.valueOf(27.99);
        double z = dNum.doubleValue();
        System.out.println("z:"+z);
    }
}