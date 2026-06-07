public class ConditionalOperatorEx {

	public static void main(String[] args) {
		int a=10,b=5;
		int c=a++<b--?a++*++b/a:--b%a++-++b/b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
//a++<b-- = 10<5(false)     :Using current value
//so, --b%a++-++b/b--       :Using updated value
// 3%11-4/4
//3-1
//c=2
