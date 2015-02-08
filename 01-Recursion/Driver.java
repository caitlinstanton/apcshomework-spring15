public class Driver {

	public static void main(String[] args) {
		Recursion r = new Recursion();
	
		System.out.println(r.fact(4));
		System.out.println(r.fact(10));
	
		System.out.println(r.fib(4));
		System.out.println(r.fib(6));
		
		System.out.println(r.len("EVERYTHING"));
		System.out.println(r.len(""));
		
		System.out.println(r.count("occupy", 'c'));
		System.out.println(r.count("qwertyuiop", 'z'));
		
		System.out.println(r.bunnyEars2(4));
		System.out.println(r.bunnyEars2(10));
		
		System.out.println(r.sumDigits(132));
		System.out.println(r.sumDigits(0));
		
		System.out.println(r.strCount("catcowcow", "cat"));
		System.out.println(r.strCount("caitlin", "lin"));
		
		System.out.println(r.allStar("caitlin"));
		System.out.println(r.allStar("HELLO"));
	}
}
	
