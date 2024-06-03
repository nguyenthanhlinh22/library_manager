package Thanhlinh;

public class User {

    public int id ;
        public String name ;
        private String email ;
        public static String group = "C0224M1-JV103";
        String password ;



        public User(int id, String name, String email) {
            this.id = id;
            this.name = name ;
            this.email = email ;
            this.password = password ;
        }

    public int getId() {
        return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public String getName(){
            return name ;
    }
    public void setName(String name){
            this.name = name;
    }


    public static class student{
            private String name ;
            private int age;

        public student(String name, int age){
            this.age = age ;
            this.name = name;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public int getAge() {
                return age;

        }
        public void setAge(int age) {
                this.age = age;
        }
    }

}


