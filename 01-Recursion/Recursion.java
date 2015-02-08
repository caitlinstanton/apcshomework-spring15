public class Recursion {

//Calculating factorials
public static int fact(int n) {
	if (n == 0) {
		return 1;
	}
	return n * fact(n - 1);
}

//Finding the nth Fibonnacci number (where the 0th number is 0)
public int fib(int n) {
	return fibHelp(n, 0, 1);
}
public int fibHelp(int n, int total, int prev) {
	if (n == 0) {
		return total;
	}
	int temp = total;
	total = total + prev;
	return fibHelp(n - 1, total, temp);
}

//Finding the length of a string
public static int len(String s){
	return lenHelp(s,0);
}
public static int lenHelp(String s, int total) {
	try {
		total = total + 1;
		return lenHelp(s.substring(1), total);
	} catch (Exception e){
		return total-1;
	}
}

//Counting the number of occurrences of a character in a string
public static int count(String s, char c) {
	return countHelp(s, c, 0);
}
public static int countHelp(String s, char c, int total) {
	try {
		if (s.charAt(0) == c) {
			total = total + 1;
		}
		return countHelp(s.substring(1), c, total);
	} catch (Exception e) {
		return total;
	}
}

//Calculating the number of bunny ears (2 for every odd numbered bunny, 3 for every even numbered bunny)
public int bunnyEars2(int bunnies) {
  return (bunnyEars2Odd(0,bunnies) * 2 + bunnyEars2Even(0,bunnies) * 3);
}
public int bunnyEars2Odd(int odds, int n) {
	if (n < 0) {
		return odds;
	}
	if (n % 2 == 1) {
		odds = odds + 1;
	} 
	return bunnyEars2Odd(odds, n - 1);
}
public int bunnyEars2Even(int evens, int n) {
	if (n < 0) {
		return evens;
	}
	if (n % 2 == 0 && !(n == 0)) {
		evens = evens + 1;
	} 
	return bunnyEars2Even(evens, n - 1);
}

//Calculating the sum of the digits in a number
public int sumDigits(int n) {
  return sumDigitsHelp(n,0);
}
public int sumDigitsHelp(int n, int total) {
	if (n < 10) {
		total = total + n;
		return total;
	}
	total = total + (n % 10);
	return sumDigitsHelp((n/10),total);
}

//Counting the number of occurrences of a string in another string
public int strCount(String str, String sub) {
	if (str.length() < sub.length()) {
		return 0;
	}
	if (str.substring(0,sub.length()).equals(sub)) {
		return 1 + strCount(str.substring(sub.length()), sub);
	} else { 
		return strCount(str.substring(1), sub);
	}
}

//Adding a * between each character of a string
public String allStar(String str) {
  return allStarHelp(str,"");
}
public String allStarHelp(String s, String newStr) {
        if (s.length() == 0) {
           return s;
        }
	if (s.length() == 1) {
		newStr = newStr + s;
		return newStr;
	}
	newStr = newStr + s.substring(0,1) + "*";
	return allStarHelp(s.substring(1),newStr);
}

}