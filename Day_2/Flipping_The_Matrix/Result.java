class Result {
    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */
    public static int flippingMatrix (List <List<Integer>>matrix) {
        // Getting size of matrix
        int n = matrix.size();
        // Returning sum of the top left quadrant
        int sumToReturn= 0;
        // Managing upper-left quadrant and getting the best number of all positions
        for (int i =0; i <n /2; i++) {
            for (int j =0; j<n/2; j++) {
                sumToReturn += Math.max(
                        Math.max(matrix.get(n-i-1).get(j),
                            matrix.get(i).get(j)),
                        Math.max(matrix.get(i).get(n-j-1),
                            matrix.get(n-i-1).get(n-j-1))
                    );
            }
        }
        return sumToReturn;
    }
}