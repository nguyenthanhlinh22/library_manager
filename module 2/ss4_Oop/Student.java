
 class Student {
     public int id;
     public String name;
     public String gmail;
     public double GBA;

     public Student(int id, String name, String gmail, double GBA) {
         this.id = id;
         this.name = name;
         this.gmail = gmail;
         this.GBA = GBA;

     };



     public String getInfo() {
         return "Id : " + id + " Name : " + name + " Email : " + gmail + " GPA : " + GBA;
     }
     public int getId() {
         return id;
     }
     public String getName() {
         return name;
     }
     public String getEmail() {
         return gmail;
     }
     public double getGpa() {
         return GBA;
     }
     public void setId(int id) {
         this.id = id;
     }
     public void setName(String name) {
         this.name = name;
     }
     public void setEmail(String email) {
         this.gmail = email;
     }
     public void setGpa(int gpa) {
         this.GBA = gpa;
     }
 }

