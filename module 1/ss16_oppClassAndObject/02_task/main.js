
class User {
    constructor(name, age, email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    checkAge() {
        if (this.age >= 18) {
            console.log("Bạn đã đủ tuổi");
        } else {
            console.log("Bạn chưa đủ tuổi");
        }
    }
}


