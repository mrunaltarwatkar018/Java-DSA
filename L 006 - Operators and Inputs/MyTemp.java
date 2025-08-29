import java.util.Scanner;

public class MyTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // taking Single Word Input
        // System.out.println("What is your name:");
        // String firstName = sc.next();
        // System.out.println("Hi, " + firstName);

        // taking Whole Sentence Input
        // System.out.println("What is your name:");
        // String name = sc.nextLine();
        // System.out.println("Hi, " + name);

        // taking Input as a interger
        // System.out.println("What is your name:");
        // String firstName = sc.next();
        // System.out.println("What is your age:");
        // int age = sc.nextInt();
        // System.out.println("Hi, " + firstName + "your age is "+ age + " years old");

        // whie taking address as Input, it not take address through command line
        // System.out.println("What is your name:");
        // String firstName = sc.next();
        // System.out.println("What is your age:");
        // int age = sc.nextInt();
        // System.out.println("What is your address:");
        // String address = sc.nextLine();
        // System.out.println("Hi, " + firstName + "your age is "+ age + " years old");
        // System.out.println("You live in " + address);
        
        // here also same, not allow to take input 
        // System.out.println("What is your name:");
        // String firstName = sc.next();
        // System.out.println("What is your address:");
        // String address = sc.nextLine();
        // System.out.println("Hi, " + firstName);
        // System.out.println("You live in " + address);

        // TO solve this, use like this
        // System.out.println("What is your name:");
        // String firstName = sc.next();
        // System.out.println("What is your age:");
        // int age = sc.nextInt();
        // System.out.println("What is your address:");
        // sc.nextLine();  // just to ignore "\n"
        // String address = sc.nextLine();
        // System.out.println("Hi, " + firstName + "your age is "+ age + " years old");
        // System.out.println("You live in " + address);

        // or use line wise, take all as a string
        // System.out.println("What is your name:");
        // String firstName = sc.next();
        // System.out.println("What is your age:");
        // String ageInput = sc.next();
        // int age = Integer.parseInt(ageInput); // Wrapper Classes
        // System.out.println("What is your address:");
        // sc.nextLine();  // just to ignore "\n"
        // String address = sc.nextLine();
        // System.out.println("Hi, " + firstName + "your age is "+ age + " years old");
        // System.out.println("You live in " + address);

        // int age;
        // Integer myAge;

        // Operators



        // unary
        int op1 = 10;
        // op1++;
        // op1--;
        int y = --op1; // 9
        int x = ++op1; //10
        // System.out.println(op1 +" "+ x + " "+y);
        // op = 10;
        int z = op1++; //z = 10 
        // op = 11
        int a = op1--; //a = 11
        // op = 10
        
        // int op = 15;
        // int ans = op++ + ++op - --op - op++;
        // System.out.println(op + " " + ans);

        // boolean correct = true;
        // System.out.println(correct); 
        // System.out.println(!correct);

        // int val1 = 10; // pos -> -(val+1) -> -11
        // System.out.println(~val1);

        // System.out.println(10/3);
        // 0110001111 >> 2
        // 0001100011

        // 0110001111 << 2
        // 1000111100



        // int val2 = -10;
        // System.out.println(~val2); //-(val+1) 9

        boolean vall1 = true;
        boolean vall2 = true;
        boolean vall3 = false;
        boolean vall4 = false;

        int test = 10;
        // boolean ansss = (++test == 11);
        // System.out.println(ansss);
        // System.out.println( vall3 && (++test == 11) );
        // System.out.println(test);

        // System.out.println( vall1 || (++test == 11) );
        // System.out.println(test);
        // int res = (6>5)?(test++):(test--);
        // System.out.println(test); //11
        // System.out.println(res); //10
        // System.out.println(op1 +" "+ x + " "+y+" "+ z +" "+ a);

        int x11 = 5;

        // x11 = x11+10;
        // x11 += 10;
        // x11 = x11-10;
        // x11 -= 10;

        int x22 = (27 + 40) - x11++ * 5 / 2 + 9 % 100;
        System.out.println(x22);

        sc.close();

    }
}



