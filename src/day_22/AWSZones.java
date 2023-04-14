package day_22;

public class AWSZones {
    public static void main(String[] args) {
    String [] Zones = {"us-east-1","us-west-1","us-west-2","us-west-3"};
    String app = "Etsy";

        for (int i = 0; i < Zones.length; i++) {
            System.out.println("Deploying " + app +" to" + Zones[i]);
            System.out.println("deploying completed for " + Zones[i]);

        }


    }
}
