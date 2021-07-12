public class GreatestCommonDivisor {
    public static void main(String []args){ 
        if (args.length != 2){
            System.err.println("ERROR: Es muessen exakt zwei Argumente angegeben Werden!");
            return;
        }
        GreatestCommonDivisor calc = new GreatestCommonDivisor();
        int aIn = Integer.parseInt(args[0]);
        int bIn = Integer.parseInt(args[1]);
        int ggt = calc.mod(aIn, bIn);
        System.out.println("a: " + aIn + ", b: " + bIn + " - ggt: " + ggt);
    }
     
    public int ggT (int aIn, int bIn){
        int r;
        int a = aIn;
        int b = bIn;
         
        while (b != 0){
            r = mod(a, b);
            a = b;
            b = r;
        }
         
        return a;
    }
    
    public int mod(int a, int b){
        int rest = a;
        while (rest >= b) {
            rest = rest - b;
        }
        return rest;
    }
}