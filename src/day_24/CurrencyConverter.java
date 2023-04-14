package day_24;
//reate a method that will accept a currency type(String) and a currency amount (double)[as dollars]
//		and convert the currency from dollars to a different type
//
//		Use the following information to convert from given dollars to the desired currency type
//
//			1 dollar = 0.91 euro
//			1 dollar = 121.03 yen
//			1 dollar = 14.85 lira
//			1 dollar = 1,217.52 won
//			1 dollar = 181.45 rupee
//
//			Note: Don't worry about decimal formats, focus on method
//
//			Ex:
//				Input:
//					euro, 100
//
//				Output:
//					91
//
//
//			Ex:
//				Input:
//					yen, 50
//
//				Output:
//					6051.5
public class CurrencyConverter {
    public static double convertToDollars(String currency, double amount){
switch ( currency){
    case "Euro":
        return amount*0.91;
    case "Yen":
        return amount*121.03;
    case "Lira":
        return amount*14.85;
    case "Won":
        return amount*1217.52;
    case "Rupee":
        return amount*181.45;

}
return 0.0;

    }

    public static void main(String[] args) {
        System.out.println(convertToDollars("Euro", 100));
        System.out.println(convertToDollars("Lira", 100));

    }
}
