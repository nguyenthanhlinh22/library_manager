function  insertNumberToArray(){
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    let number = 111;
    let index = 5;
    
  
    if(index < 0 || index >= arr.length){
        alert("Can't insert number to array");
    }else{
        arr.splice(index, 0, number);
        for (let i = 0; i < arr.length; i++){
            console.log(arr[i]);
        }
    }
    
}
insertNumberToArray();