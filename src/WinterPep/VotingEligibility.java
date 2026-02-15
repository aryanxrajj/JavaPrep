package WinterPep;

public class VotingEligibility {
    public static void main(String[] args) {
        int age = 21;
        String res = (age > 18) ? "Eligible" : "Not Eligible";
        System.out.println("You are "+res+" to Vote");

        int a = 10, b = 20, c = 30, d = 40, e = 0;
        int res2 = (a > b) && (a > c) && (a > d) && (a > e) ? a : (b > c) && (b > d) && (b > e) ? b : (c > d) && (d > e) ? c : (d > e) ? d : e;
        System.out.println("Maximum Value among "+ a + " "+b+" "+c+" "+d+" "+e +" is "+ res2);

    }
}
