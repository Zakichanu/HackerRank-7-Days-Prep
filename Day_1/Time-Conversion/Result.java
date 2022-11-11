class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String[] splitS = s.split(":");
        if(s.contains("PM") && !splitS[0].equals("12")){
            String hour = splitS[0];
            int hourModified = Integer.parseInt(hour) + 12;
            hour = Integer.toString(hourModified);
            splitS[0] = hour;
        }else if(s.contains("AM") && splitS[0].equals("12")){
            splitS[0] = "00";
        }
        
        String sFinal = splitS[0];
        for (int i = 1; i < splitS.length; i++) {
            sFinal += ":" + splitS[i];
        }
        s = sFinal;
        
        return s.substring(0, s.length() - 2);
    }

}