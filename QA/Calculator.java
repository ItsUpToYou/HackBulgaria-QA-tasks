public class Calculator {

  public int evaluate(String expression) 
  {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum -= Integer.valueOf(summand);
    return sum;
  }
  

  
  public int sum(int a,int b)
  {
	  int sum = a + b;
	  return sum;
  }
}