function findMedian(arr: number[]): number {
    // Write your code here
    // Sorting array
    arr.sort((a, b) => a - b)
    const indexMedian = (arr.length - 1) / 2
    return arr[indexMedian]
}