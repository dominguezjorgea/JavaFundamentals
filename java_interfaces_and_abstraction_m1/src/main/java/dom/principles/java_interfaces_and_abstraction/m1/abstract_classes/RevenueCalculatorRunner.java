package dom.principles.java_interfaces_and_abstraction.m1.abstract_classes;

import static dom.principles.java_interfaces_and_abstraction.m1.abstract_classes.FixedFeeCalculator.STANDARD_FEE;
import static dom.principles.java_interfaces_and_abstraction.m1.abstract_classes.HourlyRateCalculator.HOURLY_RATE;

import dom.principles.java_interfaces_and_abstraction.m1.ClientEngagement;

public class RevenueCalculatorRunner
{
    public static void main(String[] args)
    {
        final ClientEngagement clientEngagement =
            new ClientEngagement("Pluralsight", 100, 15_000);

        RevenueCalculator revenueCalculator = new FixedFeeCalculator(STANDARD_FEE);

        final double price = revenueCalculator.calculate(clientEngagement);
        System.out.println("price = " + price);
    }
}
