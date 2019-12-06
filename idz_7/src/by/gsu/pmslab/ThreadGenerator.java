package by.gsu.pmslab;



import java.util.Scanner;

public class ThreadGenerator {

    private char choice,ignore;
    private Scanner in = new Scanner(System.in);
    private int numberThread;
    private int borderValue;
    private int result;
    private int number;

    public void execute() throws java.io.IOException {
        int[] array;
        System.out.println("Enter number of thread");
        numberThread = in.nextInt();

        if (numberThread > 1) {
            array = new int[numberThread];
            for (int i = 1; i <= numberThread; i++){
                ClaculatorThread threadGenerator = new ClaculatorThread();
                    do {
                        System.out.println("\nChoice operation");
                        System.out.println("\tChoice \n1-Plus\n2-Minus\n3-Multiply\nq-Exit");
                        choice = (char) System.in.read();
                        do {
                            ignore = (char) System.in.read();
                        } while (ignore != '\n');
                    } while (choice < '1' | choice > '3' & choice != 'q');

                    if (choice == 'q') break;

                System.out.println("Enter number for thread " + i + ":");
                array[i - 1] = in.nextInt();
                borderValue = array[i - 1];
                number = threadGenerator.calculator(numberThread,borderValue);


                switch (choice) {
                    case '1':
                        result += number;
                        break;
                    case '2':
                        result -= number;
                        break;
                    case '3':
                        if (i == 1){
                            result = 1;
                            result *= number;
                        } else result *= number;
                }
            }
        }

    }

    public int getResult(){
        return result;
    }
}
