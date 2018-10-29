public class Main {

    public static void main(String[] args)
    {
        double d1=calcD(Math.toRadians(25),Math.toRadians(-15),Math.toRadians(23),Math.toRadians(-20));
        double d2=calcD(Math.toRadians(23),Math.toRadians(-20),Math.toRadians(21),Math.toRadians(-24));
        double d3=calcD(Math.toRadians(21),Math.toRadians(-24),Math.toRadians(20),Math.toRadians(-27));
        double d4=calcD(Math.toRadians(20),Math.toRadians(-27),Math.toRadians(19),Math.toRadians(-35));
        double d5=calcD(Math.toRadians(19),Math.toRadians(-35),Math.toRadians(21),Math.toRadians(-46));
        double d6=calcD(Math.toRadians(21),Math.toRadians(-46),Math.toRadians(23),Math.toRadians(-56));
        double d7=calcD(Math.toRadians(23),Math.toRadians(-56),Math.toRadians(25),Math.toRadians(-65));
        double d8=calcD(Math.toRadians(25),Math.toRadians(-65),Math.toRadians(28),Math.toRadians(-70));
        double d9=calcD(Math.toRadians(28),Math.toRadians(-70),Math.toRadians(32),Math.toRadians(-73));
        double d10=calcD(Math.toRadians(32),Math.toRadians(-73),Math.toRadians(34),Math.toRadians(-74));
        double d11=calcD(Math.toRadians(34),Math.toRadians(-74),Math.toRadians(36),Math.toRadians(-74));
        double d12=calcD(Math.toRadians(36),Math.toRadians(-74),Math.toRadians(39),Math.toRadians(-74));


        double totalDistance=d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12;
        System.out.printf("Total Distance is %,.2f km.",totalDistance);
    }

    public static double calcD(double x1, double y1, double x2, double y2)
    {
        double latitude1=Math.toRadians(x1);
        double latitude2=Math.toRadians(x2);
        double longitude1=Math.toRadians(y1);
        double longitude2=Math.toRadians(y2);

        double a= Math.sin((x1-x2)/2)*Math.sin((x1-x2)/2)+ Math.cos(x1)* Math.cos(x2)* Math.sin((y1-y2)/2)*Math.sin((y1-y2)/2);
        double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        double R = 6371;
        double d = R * c;
        return d;
    }



}
