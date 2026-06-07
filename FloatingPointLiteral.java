public class FloatingPointLiteral {
    public static void main(String[] args){
        double d=123.4567; //Normal floating point literal
 //       double d1=1.234567e+2; //Exponential Floating point Literal
        double d11=1.23456457*100; 
        System.out.println(d);
        //System.out.println(d1);
        System.out.println(d11);

        double d2= 12____31___23.123___123_1;
        //double d3= __12___31___23.123___123_; //Not Allowed
        System.out.println(d2);
        double d3=098.99; //Not Allowed
        //double d4=0b1011.1101;//Binary not allowed in floating point literal
        //double d5=0x64.33;//Hexadecimal not allowed in floating point literal
        System.out.println(d3);
        double ddd=0125.987;//Nothing loke Octal
        //double d1=0b1001.101;//Error
        double dddd=0x1.9p2;//Hexadecimal floating point literal
        System.out.println(ddd);
        System.out.println(dddd);

        double c1=.5;
        double d1=5.;
        System.out.println(c1);
        System.out.println(d1);


    }
}
