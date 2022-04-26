package com.company;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Staff s= new Staff();
        s.initialize1();
        s.Dabi1_56330();

        double salary= s.salaryToPay(180,40);
        System.out.println("The employee received the salary in the amount of "+ salary);
        double salaryForOverTime=s.salaryForOverTime(10,40);
        System.out.println("The employee received the salary for overtime "+ salaryForOverTime);
        int bonus= SalaryNathanael.bonus_Nathanael(6);
        s.initialize();
        s.Dabi_56330();
    }
}
interface SalaryNathanael {
    double salaryToPay(double hours, double rate);

    default double salaryForOverTime(double overtime, double rate)

    {
        return 1;
    }

    static int bonus_Nathanael ( int yearsOfExperience)
    {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }

    }
}



class Staff extends Person implements SalaryNathanael{
    String education;
    String position;

    public void initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        education = br.readLine();
        System.out.println("Enter your position");
        position = br.readLine();
    }

    public void Dabi_56330()
    {

        Dabi1_56330();
        System.out.println("Education :" + education);
        System.out.println("Position :" + position);
    }
    @Override
    public double salaryToPay(double hours, double rate){return  hours*rate;}
    @Override
    public double salaryForOverTime(double overtime, double rate){return  overtime*(1.5*rate);};
}





