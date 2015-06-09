// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
// Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.

public boolean makeBricks(int small, int big, int goal) {
  if (goal % 5 > small) return false;
  if (goal > big*5 + small*1) return false;
  return true;
  
}
// Given 3 int values, a b c, return their sum. However,
// if one of the values is the same as another of the values, it does not count towards the sum. 
public int loneSum(int a, int b, int c) {
  
  List<Integer> nums = new ArrayList<Integer>();

  nums.add(a);
  nums.add(b);
  nums.add(c);

  pop(nums); 
  
  return sum(nums);
}

private void pop(List<Integer> list){
 for (int i = 0; i < list.size(); i++) {
    
    Integer cur = list.remove(i);
    
    if (!list.contains(cur))
      list.add(i, cur);
    else {
      do {
        list.remove(cur);
      } while (list.contains(cur));
    }
  }
}

private Integer sum(List<Integer> list) {
     Integer sum = 0; 
     
     for (Integer i : list)
         sum += i;
         
     return sum;
}

// Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count. 
public int luckySum(int a, int b, int c) {
  List<Integer> nums = new ArrayList<Integer>();
  
  nums.add(a);
  nums.add(b);
  nums.add(c);
  
  int sum = 0;
  int our13 = nums.indexOf(13);
  
  if (our13 != -1) { 
    for (int i = 0; i < our13; i++){
      sum += nums.get(i);
    }
  } else { sum = a + b + c; }
  
  return sum;
}

// Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. 
// Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
public int noTeenSum(int a, int b, int c) {
  int sum = 0;
  int[] nums = {a, b, c};  
  
  for (int num : nums)
    if (!isTeen(num)) { sum += num; }
  
  return sum;
}

private boolean isTeen(int n){ return n <= 19 && n >= 13 && n != 15 && n != 16; }

// For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().

public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

private int round10(int num){
  if (num % 10 >= 5) { 
    num += 10 - (num % 10); 
  } else { num -= num % 10; }
  
  return num;
}


// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more.
// Note: Math.abs(num) computes the absolute value of a number. 
public boolean closeFar(int a, int b, int c) {
  int min = Math.min(Math.abs(a - b), Math.abs(a - c));
  int max = Math.max(Math.abs(a - b), Math.abs(a - c));

  int bcDiff = Math.abs(b - c);

  return (min <= 1 && max > 1 && bcDiff > 1);
  
}



// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
public int blackjack(int a, int b)
{
	if(a > 21)
	{
		if(b > 21)
			return 0;
		return b;
	}
	if(a < b && b <= 21)
		return b;
	return a;
}

// Given three ints, a b c, one of them is small, one is medium and one is large.
// Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
public boolean evenlySpaced(int num1, int num2, int num3) {
  
  int min12 = Math.min(num1, num2);
  int min23 = Math.min(num2, num3);
  
  int max12 = Math.max(num1, num2);
  int max23 = Math.max(num2, num3);

  int a = Math.min(min12, min23);
  int c = Math.max(max12, max23); 
  int b = num1 + num2 + num3 - (a + c);
    
  return (2 * b == a + c);
}

// We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
public int makeChocolate(int small, int big, int goal)
{
	int maxBig = goal/5;
	if(maxBig <= big)
		goal -= maxBig*5;
	else
		goal -= big*5;
	if(goal <= small)
		return goal;
	return -1;
}

