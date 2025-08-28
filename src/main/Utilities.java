package main;

public final class Utilities {
    
    private Utilities() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
    
    public static void printArr(Object[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]+"]\n");
    }
    
    public static String printArrToString(Object[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1]+"]\n";
        return str;
    }
    
    public static String[] arrToString(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            strArr[i] = objArr[i].toString();
        }
        return strArr;
    }
    
    public static boolean isObjectInArray(Object object, Object[] array) {
        for (Object element : array) {
            if (object.equals(element)) {
                return true;
            }
        }
        return false;
    }
    
}
