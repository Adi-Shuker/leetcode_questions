import static java.lang.Integer.parseInt;

public class calc_angle {
    public static double calc_angle(String time) {
        if(time == null|| time.length() < 4){
            return -1;
        }
        String[] parts = time.split(":");
        int hours = parseInt(parts[0])%12;
        int minuets = parseInt(parts[1]);
        double thetaHours = 0.5*(60*hours + minuets);
        double thetaMinuets = 6*minuets;
        double angle = Math.abs(thetaHours-thetaMinuets);
        if(angle>180){
            return 360 - angle;
        }
        return angle;
    }
}
