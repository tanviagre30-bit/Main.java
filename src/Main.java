import java.util.Scanner;
public class Main {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print(&quot;Enter first number: &quot;);
int a = sc.nextInt();

System.out.print(&quot;Enter second number: &quot;);
int b = sc.nextInt();

System.out.println(&quot;1. Addition&quot;);

System.out.println(&quot;2. Subtraction&quot;);
System.out.println(&quot;3. Multiplication&quot;);
System.out.println(&quot;4. Division&quot;);

System.out.print(&quot;Enter your choice: &quot;);
int choice = sc.nextInt();

switch (choice) {

case 1:
System.out.println(&quot;Addition = &quot; + (a + b));
break;

case 2:
System.out.println(&quot;Subtraction = &quot; + (a - b));
break;

case 3:
System.out.println(&quot;Multiplication = &quot; + (a * b));
break;

case 4:
System.out.println(&quot;Division = &quot; + (a / b));
break;

default:
System.out.println(&quot;Invalid choice&quot;);
}

sc.close();
}
}
