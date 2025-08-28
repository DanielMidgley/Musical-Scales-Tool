package main;

public class ScaleQualities {
    
    private static final boolean[] maj = {true, false, true, false, true, true, false, true, false, true, false, true};
    private static final boolean[] min = {true, false, true, true, false, true, false, true, true, false, true, false};
    
    public static boolean[] getScaleFormat(String scaleQuality) {
        if (scaleQuality.equals("Major")) return maj;
        if (scaleQuality.equals("Minor")) return min;
        
        boolean[] errorScaleFormat = new boolean[12];
        for (int i = 0; i < errorScaleFormat.length; i++){
            errorScaleFormat[i] = false;
        }
        return errorScaleFormat;
    }
    
    public static String[] listAllScaleQualities(){
        String[] arr = {"Major", "Minor"};
        return arr;
    }
    
}
