function diagonalDifference(arr: number[][]): number {
    // Write your code here
    let sumLeftToRightDiag = 0
    let sumRightToLeftDiag = 0
    
    for(let i = 0; i < arr.length; i++){
        // left to right diag sum
        sumLeftToRightDiag += arr[i][i]
        
        // right to left diag sum
        sumRightToLeftDiag += arr[i][arr.length - 1 - i]
    }
    return Math.abs(sumRightToLeftDiag - sumLeftToRightDiag)

}