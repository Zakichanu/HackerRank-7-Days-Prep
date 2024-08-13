function countingSort(arr: number[]): number[] {
    // Write your code here
    
    // sorting array
    arr.sort((a, b) => a - b)
    
    let frequencyArray : number[] = [] 
    for(let i = 0; i < 100; i++){
        const frequencyOfI = arr.filter((val) => val === i)
        frequencyArray.push(frequencyOfI.length)
    }
    
    return frequencyArray

}