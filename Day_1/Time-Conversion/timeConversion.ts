function timeConversion(s: string): string {
    
    if(s.endsWith("AM") && s.startsWith("12")) {
        const restOfTime = s.slice(2, s.length - 2)
        return "00".concat(restOfTime)
    } else if (s.endsWith("AM") || (s.endsWith("PM") && s.startsWith("12"))) {
        return s.slice(0, s.length - 2)
    } else {
        let beginning : number = parseInt(s.substring(0, 2))
        beginning += 12
        
        return beginning.toString().concat(s.slice(2, s.length - 2))
    }

}