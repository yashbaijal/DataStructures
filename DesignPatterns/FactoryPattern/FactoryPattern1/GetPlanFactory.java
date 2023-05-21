package conceptsJava.factoryPattern;

import java.util.Scanner;

public class GetPlanFactory {

    public static Plan getPlan(String planType)
    {
        Plan optedPlan = null;

        if(planType==null)
        {
            return null;
        }
        if(planType.equalsIgnoreCase("DomesticPlan"))
        {
            optedPlan=new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("CommertialPlan"))
        {
            optedPlan=new CommercialPlan();
        }
        else if (planType.equalsIgnoreCase("InstitutionalPlan"))
        {
            optedPlan=new InstitutionalPlan();
        }

        return optedPlan;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Plan");
        String plantype=sc.nextLine();

        System.out.println("Enter units");
        int units=sc.nextInt();

        Plan optedPlan=GetPlanFactory.getPlan(plantype);
        optedPlan.getRate();

        System.out.println("Bill generated. Amount to be Paid ");
        optedPlan.calculateBill(units);
    }

}
