function miniMaxSum(arr: number[]): void {
    // Write your code here
    let minSum = 0
    let maxSum = 0
    
    // MinSum
    arr.sort((a, b) => a - b)
    arr.slice(0, arr.length - 1).map((val) => {
        minSum += val
    })
    
    // MaxSum
    arr.slice(1).map((val) => {
        maxSum += val
    })
    
    
    console.log(minSum + ' ' + maxSum)
}