package main;
import java.util.Scanner;

import GasPumps.*;

public class Driver {
    public static void main(String[] args)
    {
        System.out.println(" ----------------------------------------");
        System.out.println("|     Chirag Khandhar | A20438936        |");
        System.out.println("|    SSA | Final Project | GasPump       | ");
        System.out.println(" ----------------------------------------");
        System.out.println("|          Select GasPump                |");
        System.out.println("|             1. GP1                     |");
        System.out.println("|             2. GP2                     |");
        System.out.println(" ----------------------------------------");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1)
        {
            pump1();
        }
        else if( choice == 2)
        {
            pump2();
        }
        else
        {

            System.out.println("|           Invalid Pump Selected        |");
            System.out.println("|                  ---                   |");
            System.out.println("|                Terminated              |");
            System.out.println(" ----------------------------------------");
        }
    }

    static void pump1()
    {
        Scanner sc = new Scanner(System.in);
        GP1 gp1 = new GP1();

        System.out.println(" ----------------------------------------");
        System.out.println("|             GasPump1                   |");
        System.out.println(" ----------------------------------------");
        System.out.println("|                                        | ");
        System.out.println("|          Menu of Operation             |");
        System.out.println("|          0. Activate(int)              |");
        System.out.println("|                                        | ");
        System.out.println("|          1. Start()                    |");
        System.out.println("|                                        | ");
        System.out.println("|          2. PayCredit                  |");
        System.out.println("|                                        | ");
        System.out.println("|          3. Reject()                   |");
        System.out.println("|                                        | ");
        System.out.println("|          4. Cancel()                   |");
        System.out.println("|                                        | ");
        System.out.println("|          5. Approved()                 |");
        System.out.println("|                                        | ");
        System.out.println("|          6. PayCash(int)               |");
        System.out.println("|                                        |");
        System.out.println("|          7. StartPump()                |");
        System.out.println("|                                        |");
        System.out.println("|          8. PumpLiter()                |");
        System.out.println("|                                        |");
        System.out.println("|          9. StopPump()                 |");
        System.out.println("|                                        |");
        System.out.println("|          q. Quit the program           |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Please make a note of these operations |");
        System.out.println("|                                        |");
        System.out.println("|           GasPump-1 Execution          |");
        System.out.println("|                                        |");
        int ch = '1';

        while (ch != 'q') {
            System.out.println("|------------Select Operation------------|");
            System.out.println("|                                        |");
            System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-PumpLiter, 9-StopPump, q-quit");
            System.out.println("|                                        |");
            ch = sc.nextInt();
            switch (ch)
            {
                case '0': //Activate()
                {
                    System.out.print("  Operation:  Activate(int a)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a:");
                    System.out.print("\n");
                    int a = sc.nextInt();
                    gp1.Activate(a);
                    break;
                }

                case '1': //Start
                {
                    System.out.print("  Operation:  Start()");
                    System.out.print("\n");
                    gp1.Start();
                    break;
                }

                case '2': //PayCredit
                {
                    System.out.print("  Operation:  PayCredit()");
                    System.out.print("\n");
                    gp1.PayCredit();
                    break;
                }

                case '3': //Reject
                {
                    System.out.print("  Operation:  Reject()");
                    System.out.print("\n");
                    gp1.Reject();
                    break;
                }

                case '4': //Cancel
                {
                    System.out.print("  Operation:  Cancel()");
                    System.out.print("\n");
                    gp1.Cancel();
                    break;
                }

                case '5': //Approved
                {
                    System.out.print("  Operation:  Approved()");
                    System.out.print("\n");
                    gp1.Approved();
                    break;
                }

                case '6':  //PayCash
                {
                    System.out.print("  Operation:  PayCash(int c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter c:");
                    System.out.print("\n");
                    int c = sc.nextInt();
                    gp1.PayCash(c);
                    break;
                }

                case '7': //StartPump
                {
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                    gp1.StartPump();
                    break;
                }


                case '8': //PumpLiter
                {
                    System.out.print("  Operation:  PumpLiter()");
                    System.out.print("\n");
                    gp1.PumpLiter();
                    break;
                }

                case '9': //StopPump
                {
                    System.out.print("  Operation:  StopPump()");
                    System.out.print("\n");
                    gp1.StopPump();
                    break;
                }
            }

        }
    }

    static void pump2()
    {

    }
}

