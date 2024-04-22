function  insertNumberToArray(){
    let arr = [1, 2, 3, 4, 5, 4, 3, 2, 1];
    let number = 10;
    let index = 5;
    arr.splice(index, 0, number);
    for (let i = 0; i < arr.length; i++){
        console.log(arr[i]);
    }
    
}
insertNumberToArray();