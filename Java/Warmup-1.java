// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
public boolean sleepIn(boolean weekday, boolean vacation)
{	return (!weekday || vacation);	}


// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
{	return (aSmile == bSmile);	}


// Given two int values, return their sum. Unless the two values are the same, then return double their sum.
public int sumDouble(int a, int b) {
  return (a == b ? 2 * (a + b) : a + b);
}

// /* Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.
public int diff21(int n) {
  int  difference = 21 - n;
  return (difference >= 0 ? difference : -2 * difference);
}



// We have a loud talking parrot.
// The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 or after 20.
// Return true if we are in trouble. 
public boolean parrotTrouble(boolean talking, int hour)
{	return (talking && (hour < 7 || hour > 20));	}


// Given 2 ints, a and b
// return true if one if them is 10 or if their sum is 10.
public boolean makes10(int a, int b) {
  return (a == 10 || b == 10 || a + b == 10);
}


// Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number. 
public boolean nearHundred(int n) {
  return ( isWithin10(n, 100) || isWithin10(n, 200) );
}

private boolean isWithin10(int n, int bound){
  return (Math.abs(n - bound) <= 10);
}


// Given 2 int values, return true if one is negative and one is positive.
// Unless the parameter "negative" is true, then they both must be negative.
public boolean posNeg(int a, int b, boolean negative) {
  return ( negative ? (!isPositive(a) && !isPositive(b)) : (isPositive(a) && !isPositive(b)) || (isPositive(b) && !isPositive(a)) ); 
}

private boolean isPositive(int n){
  return (n > 0);
}


// Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged.
// Note: use .equals() to compare 2 strings. 
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0,3).equals("not")){
    return (str);
  }
  return ("not " + str);
}


// Given a non-empty string and an int n, return a new string where the char at index n has been removed.
// The value of n will be a valid index of a char in the original string.
// (i.e. n will be in the range 0..str.length()-1 inclusive). 
public String missingChar(String str, int n)
{	return (str.substring(0, n) + str.substring(n+1, str.length()));	}


// Given a string, return a new string where the first and last chars have been exchanged
public String frontBack(String str) {
  if (str.length() == 0)
    return str;
    
  char[] string = str.toCharArray();
  
  char first = string[0];
  char last = string [str.length() - 1];
  
  string[0] = last;
  string[str.length() - 1] = first;
  
  return new String(string);
}



// Given a string, we'll say that the front is the first 3 chars of the string.
// If the string length is less than 3, the front is whatever is there.
// Return a new string which is 3 copies of the front. 
public String front3(String str) {
  String front, returnStr = new String();

  if (str.length() < 3)
    front = str;
  else
    front = str.substring(0, 3);
  
  for (int i = 0; i < 3; i++)
    returnStr += front;  
  
  return returnStr;
}


// Given a string, take the last char and return a new string with the last char added at the front and back,
// so "cat" yields "tcatt". The original string will be length 1 or more. 
public String backAround(String str)
{
	int len = str.length() - 1;
	return (str.charAt(len) + str + str.charAt(len));
}

// Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
public boolean or35(int n) {
  return n % 3 ==0 || n % 5 ==0;
}

// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there. 
public String front22(String str) {
  String front = str.substring(0, str.length() < 2 ? str.length() : 2);
  return front + str + front;
}

// Given a string, return true if the string starts with "hi" and false otherwise.
public boolean startHi(String str) {
  return str.length() > 2 ? str.substring(0, 2).equals("hi") : str.equals("hi");
}


// Given two temperatures, return true if one is less than 0 and the other is greater than 100. 
public boolean icyHot(int temp1, int temp2) {
  int[] array = {temp1, temp2};
  
  boolean lessThanZero = false, greaterThanHundred = false;
  
  for (int i = 0; i < array.length; i ++){
    lessThanZero = lessThanZero ? true : array[i] < 0;
    greaterThanHundred = greaterThanHundred ? true : array[i] > 100;
  }
  
  return lessThanZero && greaterThanHundred;
}


// Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
public boolean in1020(int a, int b) {
  int[] array = {a, b};
  
  for (int i = 0; i < array.length; i ++){
    if (array[i] <= 20 && array[i] >= 10)
      return true;
  }
  
  return false;
}


// Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
public boolean hasTeen(int a, int b, int c) {
  int[] array = {a, b, c};
  
  for (int i = 0; i < array.length; i++){
    if (array[i] >= 13 && array[i] <= 19)
      return true;
  } return false;
}


// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 2 int values, return true if one or the other is teen, but not both. 
public boolean loneTeen(int a, int b) {
  return isTeen(a) ^ isTeen(b); // ^ is the exclusive-or, XOR, gate
}

private boolean isTeen(int i){
  return i <= 19 && i >= 13;
}



// Given a string, if the string "del" appears starting at index 1,
// return a string where that "del" has been deleted. Otherwise, return the string unchanged. 
public String delDel(String str) {
  return str.length() > 3  ? ((str.substring(1, 4).equals("del")) ? (str.substring(0, 1) + str.substring(4)) : (str)) : str;
}



// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 
public boolean mixStart(String str) {
  return str.length() < 3 ? false : str.substring(1,3).equals("ix");
}


// Given a string, return a string made of the first 2 chars (if present),
// however include first char only if it is 'o' and include the second only if it is 'z',
// so "ozymandias" yields "oz". 
public String startOz(String str) {
  String ret = new String();
  if (str.length() >= 1 && str.substring(0, 1).equals("o"))
    ret += "o";
  if (str.length() >= 2 && str.substring(1, 2).equals("z"))
    ret += "z";
  return ret;
}



// Given three int values, A B C, return the largest. 
public int intMax(int a, int b, int c)
{
	int max = a;
	if(b > max)
		max = b;
	if (c > max)
		max = c;
	return max;
}


// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
// Note that Math.abs(n) returns the absolute value of a number.
public int close10(int a, int b) {
  return distanceFrom10(a) == distanceFrom10(b) ? 0 : (distanceFrom10(a) < distanceFrom10(b) ? a : b);
}

private int distanceFrom10(int n){
  return Math.abs(10 - n);
}


// Given 2 int values, return true if they are both in the range 30..40 inclusive,
// or they are both in the range 40..50 inclusive.
public boolean in3050(int a, int b) {
  return (in3040(a) && in3040(b)) || (in4050(a) && in4050(b));
}

private boolean in3040(int n) {
  return n >= 30 && n <= 40;
}

private boolean in4050(int n) {
  return n >= 40 && n <= 50;
}


// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
// or return 0 if neither is in that range.
public int max1020(int a, int b) {
  return in1020(Math.max(a, b)) ? Math.max(a, b) : (in1020(Math.min(a, b)) ? Math.min(a, b) : 0);
}

private boolean in1020(int n) {
  return n >= 10 && n <= 20;
}


// Return true if the given string contains between 1 and 3 'e' chars. 
public boolean stringE(String str) {
  int count = 0;
  
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'e')
      count++;
  }
  return count <= 3 && count >= 1;
}



// Given two non-negative int values, return true if they have the same last digit,
// such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7. 
public boolean lastDigit(int a, int b) 
{	return (a % 10 == b % 10);	}


// Given a string, return a new string where the last 3 chars are now in upper case.
// If the string has less than 3 chars, uppercase whatever is there.
// Note that str.toUpperCase() returns the uppercase version of a string.
public String endUp(String str) {
  int index = str.length() > 3 ? str.length() - 3 : 0;
  
  return str.substring(0, index) + str.substring(index).toUpperCase();
}



// Given a non-empty string and an int N, return the string made starting with char 0,
// and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on.
// N is 1 or more
public String everyNth(String str, int n) {
  String reply = new String();
  
  for (int counter = 0; counter < str.length(); counter += n){
    reply += str.charAt(counter);
  }
  
  return reply;
}

