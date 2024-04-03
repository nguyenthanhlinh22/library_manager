class Book {
    title;
    price;
    quocgia;
    tinhtrang;
    anh;
    constructor(title, price, quocgia, tinhtrang, anh) {
        this.title = title ;
        this.price = price ;
        this. quocgia = quocgia ;
        this.tinhtrang = tinhtrang ;
        this.anh = anh ;
    }
    updateName(newName){
        this.name = newName
    };

    updatePrice(newPrice){
        this.price = newPrice
    }
}