function sumOfListPrime(){
    let sum = 0;
    for(let i = 2; i <= 4; i++){
        if(isPrime(i)){
            sum += i;
        }
    }
    return sum;
}


function isPrime(n){
    if(n < 2){
        return false;
    }
    for(let i = 2; i <= Math.sqrt(n); i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}
console.log(sumOfListPrime());