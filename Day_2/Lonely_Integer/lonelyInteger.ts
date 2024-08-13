function lonelyinteger(a: number[]): number {
    let lonelyValue = 0
    // Write your code here
    for(let i = 0; i < a.length; i++){
        const checkLonelyInteger = a.filter((val2) => a[i] === val2)
        if(checkLonelyInteger.length === 1){
            lonelyValue = a[i]
            break
        }
    }
    return lonelyValue
}
