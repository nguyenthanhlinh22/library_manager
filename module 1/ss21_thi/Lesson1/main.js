function findAvg(){
    var sum = 0;
    for (var i = 0; i < arguments.length; i++){
        sum += arguments[i];
    }
    return sum / arguments.length;
}
        const avg = findAvg(1, 2, 3, 4, 5);//kq = 3
        console.log(avg);