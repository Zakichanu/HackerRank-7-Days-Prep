/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr: number[]): void {
    const total = arr.length
    let plus = 0
    let minus = 0
    let zero = 0
    arr.map((num : number) => {
        if(typeof num === "number"){
            (num > 0 ) ? plus++ : (num < 0) ? minus++ : zero++
        }    
    })
    const proba_plus = plus / total
    const proba_minus = minus / total
    const proba_zero = zero / total
    
    console.log(`${proba_plus}\n${proba_minus}\n${proba_zero}`)

}
