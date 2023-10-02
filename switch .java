class Main {
  public static void main(String[] args) {

    double a = 42.5, b = 6.5;
    char operator = '-';

    switch (operator) {
      case '+':
        System.out.println("result = " + (a + b));
        break;
      case '-':
        System.out.println("result = " + (a - b));
        break;
      case '*':
        System.out.println("result = " + (a * b));
        break;
      case '/':
        System.out.println("result = " + (a / b));
        break;

      default:
        System.out.println("Invalid Operator");
    }
  }
}