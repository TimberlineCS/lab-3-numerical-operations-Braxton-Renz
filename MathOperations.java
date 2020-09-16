public class MathOperations{
  public static void main(String args[]){
    //Challenge 1
    double a1 = 37.9;
    double a2 = 1004.128;
    int b1 = 12;
    int b2 = 18;
    System.out.println(57.2 * (b1 / b2) + 1);
    System.out.println(57.2 * ((double)b1 / b2) + 1);//39.1333
    System.out.println(15 - b1 * (a1 * 3) + 4);//-1345.399999
    System.out.println(15 - b1 * ((int)a1 * 3) + 4);//-1313
    System.out.println(15 - b1 * (int)(a1 * 3) + 4);//-1313

    //Challenge 2
    int num = 1234;
    int newNum = (num%10)*1000;
    num = num/10;
    newNum = newNum + (num%10)*100;
    num = num/10;
    newNum = newNum + (num%10)*10;
    num = num/10;
    newNum = newNum + (num%10);
    System.out.print(newNum);
  }
}