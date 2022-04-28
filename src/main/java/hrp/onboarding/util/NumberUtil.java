package hrp.onboarding.util;

public class NumberUtil {

    public static int parseInt(String arg){
        int number;
        try{
            number = Integer.parseInt(arg);
        }catch(NumberFormatException e){
            number = 0;
        }
        return number;
    }
}
