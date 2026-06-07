public class ArithmeticOperatorEx1 {
    
    public static void main(String[] args) {
        int a=7/2;
		System.out.println(a);
		
		double b=7/2;
		System.out.println(b);
		
		double c=7.0/2;
		System.out.println(c);
		
		//int d=7.0/2; //error
		int d=(int)(7.0/2);
		System.out.println(d);
        
        //int/int => int
        //int/double => double
        //double/int => double
        //double/double => double
		a=7/2;
		System.out.println(a);
		a=-7/2;
		System.out.println(a);
		a=7/-2;
		System.out.println(a);
		a=-7/-2;
		System.out.println(a);
		
		a=7%2;
		System.out.println(a);
		a=-7%2;
		System.out.println(a);
		a=7%-2;
		System.out.println(a);
		a=-7%-2;
		System.out.println(a);	
		
		System.out.println(2/7);
		System.out.println(2%7);
       
		int v=8*3/2*6+9/4*2-8;      
		System.out.println(v);
		v=5/3*9%45*5+9*7/3;			
		System.out.println(v);
		v=12%56*9/4%3+90-8%6/2-8;	
		System.out.println(v);
	}
}
//Precedence

//()
//*/%
//+-
//=,+=,-=,*=,/=,%=
	
