public class Main {
    public static void main(String[] args) {
        // Seasonal home maintenance costs
        double springCost = 150.00;
        double summerCost = 275.00;
        double fallCost = 200.00;
        double winterCost = 310.00;

        // Calculate total yearly cost
        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        // Individual seasonal costs and total yearly cost
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + totalYearlyCost);
    }
}