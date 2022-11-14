class Result {
    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        int lonelyInteger = 0;
    // Write your code here
        for (int i = 0; i < a.size(); i++) {
            int countElement = 0;
            for (int j = 0; j < a.size(); j++) {
                if(a.get(i) == a.get(j)){
                    countElement++;
                }
            }
            if(countElement == 1){
                lonelyInteger = a.get(i);
            }
        }
        return lonelyInteger;
    }

}