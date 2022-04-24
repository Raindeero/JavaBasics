import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Program in process");

        //Create and use classes
        Human rus = new Human();
        Human uz = new Human();
        Human belorus = new Human("Slava", 190);
        uz.name = "Azamat";
        rus.Say();
        uz.Say();
        belorus.Say();
        System.out.println(uz.height);

        //OOP

        //Inheritance
        Student kz = new Student();
        kz.Tell();

        //Abstraction (class Human dont have argument course)
        Student mld = new Student(190, 88, 3);
        mld.SaySomething();

        //Polymorphism
        mld.Say();

        //Anonim class
        new Student(){
            void speech(){
                this.name = "Arnold";
                this.SaySomething();
                System.out.println("This is Hidden class func");
            }
        };

        //Interface
        Test_Interface a = new My_Test_Interface_class();
        System.out.println(a.story("Tail") + " " +  a.nums(13));


        /*
        //Output and input
        int first, second;
        String operation;
        System.out.print("Write first operand: ");
        first = num.nextInt();
        System.out.print("Write second operand: ");
        second = num.nextInt();
        System.out.print("Type of operation (+, -, /, *): ");
        operation = num.next();

        calc(first, second, operation);
        */
        //chess();

        /*
        //Loop
        for(int i=1; i<=10; i++){
            System.out.print(" " + i);
        }
        System.out.println("");
        //Array
        int[] nums = new int[] {17, 23, 10, 16, 18, 23, 10, 16};
        for (int j : nums) {
            System.out.print(" " + j);
        }
        */
    }

    //funcs
    public static void chess(){
        //Double array, loops, conditions CHEESS DESK
        char[][] chess = new char[8][8];
        String ch;
        int flag=1;
        while(flag<=18){
            System.out.print("-");
            flag++;
        }
        System.out.println("");
        for(int i=1; i<9; i++){
            System.out.print("|");
            for(int j=1; j<9; j++){
                if(i%2==0){
                    if(j%2==1) ch = "  ";
                    else ch = "##";
                    System.out.print(ch);
                }else{
                    if(j%2==1) ch = "##";
                    else ch = "  ";
                    System.out.print(ch);
                }
            }
            System.out.print("|");
            System.out.println("");
        }
        flag=1;
        while(flag<=18){
            System.out.print("-");
            flag++;
        }
    }

    public static void calc(int first, int second, String operation){
        int result=0;
        //switch
        switch (operation) {
            case "+" -> result = first + second;
            case "-" -> result = first - second;
            case "*" -> result = first * second;
            case "/" -> result = first / second;
            default -> System.out.println("Wrong operation");
        }
        System.out.println("Result is: " + result);
    }
}