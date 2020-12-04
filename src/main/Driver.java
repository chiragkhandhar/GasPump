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
        System.out.println("|          Menu of Operation             |");
        System.out.println("|                                        | ");
        System.out.println("|          0. Activate(int)              |");
        System.out.println("|                                        | ");
        System.out.println("|          1. Start()                    |");
        System.out.println("|                                        | ");
        System.out.println("|          2. PayCredit()                |");
        System.out.println("|                                        | ");
        System.out.println("|          3. Reject()                   |");
        System.out.println("|                                        | ");
        System.out.println("|          4. Cancel()                   |");
        System.out.println("|                                        | ");
        System.out.println("|          5. Approve()                  |");
        System.out.println("|                                        | ");
        System.out.println("|          6. PayCash(int)               |");
        System.out.println("|                                        |");
        System.out.println("|          7. StartPump()                |");
        System.out.println("|                                        |");
        System.out.println("|          8. PumpLiter()                |");
        System.out.println("|                                        |");
        System.out.println("|          9. StopPump()                 |");
        System.out.println("|                                        |");
        System.out.println("|         99. Quit the program           |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Please make a note of these operations |");
        System.out.println("|                                        |");
        System.out.println("|           GasPump-1 Execution          |");
        System.out.println("|                                        |");
        int ch = 1;

        while (ch != 99)
        {
            System.out.println("|------------Select Operation------------|");
            System.out.println("|                                        |-------------------------------------------------------------------------------------------------------");
            System.out.println("| 0:Activate | 1: Start | 2:PayCredit | 3: Reject | 4: Cancel | 5: Approve | 6: PayCash | 7: StartPump | 8: PumpLiter | 9: StopPump |  99: Quit |");
            System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------");
            ch = sc.nextInt();
            switch (ch)
            {
                case 0: //Activate()
                {
                    System.out.println("|------Operation:  Activate(int a)-------|");
                    System.out.println("|                                        |");
                    System.out.println("|    Enter value of the parameter a:     |");
                    System.out.println("|                                        |");
                    int a = sc.nextInt();
                    gp1.Activate(a);
                    break;
                }

                case 1: //Start
                {
                    System.out.println("|----------Operation:  Start()-----------|");
                    System.out.println("|                                        |");
                    gp1.Start();
                    break;
                }

                case 2: //PayCredit
                {
                    System.out.println("|--------Operation:  PayCredit()---------|");
                    System.out.println("|                                        |");
                    gp1.PayCredit();
                    break;
                }

                case 3: //Reject
                {
                    System.out.println("|                                        |");
                    gp1.Reject();
                    break;
                }

                case 4: //Cancel
                {
                    System.out.println("|                                        |");
                    gp1.Cancel();
                    break;
                }

                case 5: //Approved
                {
                    gp1.Approved();
                    break;
                }

                case 6:  //PayCash
                {
                    System.out.println("|                                        |");
                    System.out.println("|       Enter the Cash Amount ($):       |");
                    System.out.println("|                                        |");
                    int c = sc.nextInt();
                    gp1.PayCash(c);
                    break;
                }

                case 7: //StartPump
                {
                    System.out.println("|--------Operation:  StartPump()---------|");
                    System.out.println("|                                        |");
                    gp1.StartPump();
                    break;
                }


                case 8: //PumpLiter
                {
                    System.out.println("|--------Operation:  PumpLiter()---------|");
                    System.out.println("|                                        |");
                    gp1.PumpLiter();
                    break;
                }

                case 9: //StopPump
                {
                    System.out.println("|-------Operation:  StopPump()-----------|");
                    System.out.println("|                                        |");
                    gp1.StopPump();
                    break;
                }
            }
        }
        System.out.println("|                Terminated              |");
        System.out.println(" ----------------------------------------");
    }

    static void pump2()
    {
        Scanner sc = new Scanner(System.in);
        GP2 gp2 = new GP2();

        System.out.println(" ----------------------------------------");
        System.out.println("|             GasPump2                   |");
        System.out.println(" ----------------------------------------");
        System.out.println("|          Menu of Operation             |");
        System.out.println("|                                        | ");
        System.out.println("|    0. Activate(float, float, float)    |");
        System.out.println("|                                        | ");
        System.out.println("|          1. Start()                    |");
        System.out.println("|                                        | ");
        System.out.println("|          2. PayCredit()                |");
        System.out.println("|                                        | ");
        System.out.println("|          3. Reject()                   |");
        System.out.println("|                                        | ");
        System.out.println("|          4. PayDebit(String)           |");
        System.out.println("|                                        | ");
        System.out.println("|          5. Pin(String)                |");
        System.out.println("|                                        | ");
        System.out.println("|          6. Cancel()                   |");
        System.out.println("|                                        | ");
        System.out.println("|          7. Approve()                  |");
        System.out.println("|                                        | ");
        System.out.println("|          8. Diesel()                   |");
        System.out.println("|                                        |");
        System.out.println("|          9. Regular()                  |");
        System.out.println("|                                        |");
        System.out.println("|          10. Super()                   |");
        System.out.println("|                                        |");
        System.out.println("|          11. StartPump()               |");
        System.out.println("|                                        |");
        System.out.println("|          12. PumpGallon()              |");
        System.out.println("|                                        |");
        System.out.println("|          13. StopPump()                |");
        System.out.println("|                                        |");
        System.out.println("|          14. FullTank()                |");
        System.out.println("|                                        |");
        System.out.println("|          99. Quit the program          |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Please make a note of these operations |");
        System.out.println("|                                        |");
        System.out.println("|           GasPump-2 Execution          |");
        System.out.println("|                                        |");
        int ch = 1;

        while (ch != 99)
        {
            System.out.println("|------------Select Operation------------|");
            System.out.println("|                                        |-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| 0:Activate | 1: Start | 2:PayCredit | 3: Reject | 4: PayDebit | 5: Pin | 6: Cancel | 7: Approve | 8: Diesel | 9: Regular | 10: Super | 11: StartPump | 12: PumpGallon | 13: StopPump | 14: FullTank | 99: Quit |");
            System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            ch = sc.nextInt();
            switch (ch)
            {
                case 0: //Activate()
                {
                    System.out.println("|-Op Activate(float a, float b, float c)-|");
                    System.out.println("|                                        |");
                    System.out.println("|    Enter value of the a (Regular):     |");
                    System.out.println("|                                        |");
                    float a = sc.nextFloat();
                    System.out.println("|    Enter value of the b (Diesel):      |");
                    System.out.println("|                                        |");
                    float b = sc.nextFloat();
                    System.out.println("|    Enter value of the c (Super):       |");
                    System.out.println("|                                        |");
                    float c = sc.nextFloat();
                    gp2.Activate(a, b , c);
                    break;
                }

                case 1: //Start
                {
                    System.out.println("|----------Operation:  Start()-----------|");
                    System.out.println("|                                        |");
                    gp2.Start();
                    break;
                }

                case 2: //PayCredit
                {
                    System.out.println("|--------Operation:  PayCredit()---------|");
                    System.out.println("|                                        |");
                    gp2.PayCredit();
                    break;
                }

                case 3: //Reject
                {
                    System.out.println("|                                        |");
                    gp2.Reject();
                    break;
                }

                case 4: //PayDebit
                {
                    System.out.println("|-----Operation:  PayDebit(String p)-----|");
                    System.out.println("|                                        |");
                    System.out.println("|            Enter p                     |");
                    System.out.println("|                                        |");
                    String p = sc.next();
                    gp2.PayDebit(p);
                    break;
                }

                case 5: //Pin
                {
                    System.out.println("|-------Operation:  Pin(String x)--------|");
                    System.out.println("|                                        |");
                    System.out.println("|            Enter x                     |");
                    System.out.println("|                                        |");
                    String x = sc.next();
                    gp2.Pin(x);
                    break;
                }

                case 6: // Cancel
                {
                    System.out.println("|                                        |");
                    gp2.Cancel();
                    break;
                }

                case 7: //Approved
                {
                    System.out.println("|                                        |");
                    gp2.Approved();
                    break;
                }

                case 8:  //Diesel
                {
                    System.out.println("|                                        |");
                    gp2.Diesel();
                    break;
                }

                case 9:  //Regular
                {
                    System.out.println("|                                        |");
                    gp2.Regular();
                    break;
                }

                case 10:  //Super
                {
                    System.out.println("|                                        |");
                    gp2.Super();
                    break;
                }

                case 11: //StartPump
                {
                    System.out.println("|--------Operation:  StartPump()---------|");
                    System.out.println("|                                        |");
                    gp2.StartPump();
                    break;
                }


                case 12: //PumpGallon
                {
                    System.out.println("|--------Operation:  PumpGallon()---------|");
                    System.out.println("|                                        |");
                    gp2.PumpGallon();
                    break;
                }

                case 13: //StopPump
                {
                    System.out.println("|-------Operation:  StopPump()-----------|");
                    System.out.println("|                                        |");
                    gp2.StopPump();
                    break;
                }

                case 14: //FullTank
                {
                    System.out.println("|-------Operation:  FullTank()-----------|");
                    System.out.println("|                                        |");
                    gp2.FullTank();
                    break;
                }
            }
        }
        System.out.println("|                Terminated              |");
        System.out.println(" ----------------------------------------");
    }
}

