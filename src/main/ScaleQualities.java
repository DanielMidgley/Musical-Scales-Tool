package main;

public class ScaleQualities {
    
    private static final boolean[] maj = {true, false, true, false, true, true, false, true, false, true, false, true};
    private static final boolean[] min = {true, false, true, true, false, true, false, true, true, false, true, false};
    private static final boolean[] dor = {true, false, true, true, false, true, false, true, false, true, true, false};
    private static final boolean[] phr = {true, true, false, true, false, true, false, true, true, false, true, false};
    private static final boolean[] lyd = {true, false, true, false, true, false, true, true, false, true, false, true};
    private static final boolean[] mix = {true, false, true, false, true, true, false, true, false, true, true, false};
    private static final boolean[] loc = {true, true, false, true, false, true, true, false, true, false, true, false};
    private static final boolean[] dhm = {true, true, false, false, true, true, false, true, true, false, false, true};
    private static final boolean[] mma = {true, false, true, true, false, true, false, true, false, true, false, true};
    private static final boolean[] mmd = {true, false, true, true, false, true, false, true, true, false, true, false};
    private static final boolean[] ham = {true, false, true, true, false, true, false, true, true, false, false, true};
    
    public static boolean[] getScaleFormat(String scaleQuality) {
        if (scaleQuality.equals("Major")) return maj;
        if (scaleQuality.equals("Natural Minor")) return min;
        if (scaleQuality.equals("Dorian")) return dor;
        if (scaleQuality.equals("Phrygian")) return phr;
        if (scaleQuality.equals("Lydian")) return lyd;
        if (scaleQuality.equals("Mixolydian")) return mix;
        if (scaleQuality.equals("Locrian")) return loc;
        if (scaleQuality.equals("Double Harmonic Major")) return dhm;
        if (scaleQuality.equals("Melodic Minor (asc)")) return mma;
        if (scaleQuality.equals("Melodic Minor (desc)")) return mmd;
        if (scaleQuality.equals("Harmonic Minor")) return ham;
        
        boolean[] errorScaleFormat = new boolean[12];
        for (int i = 0; i < errorScaleFormat.length; i++){
            errorScaleFormat[i] = false;
        }
        return errorScaleFormat;
    }
    
    public static String[] listAllScaleQualities(){
        String[] arr = {"Major", "Natural Minor", "Dorian", "Phrygian", "Lydian", "Mixolydian", "Locrian",
            "Double Harmonic Major", "Melodic Minor (asc)", "Melodic Minor (desc)", "Harmonic Minor"};
        return arr;
    }
    
}
