package src.TextFile.AppUser.src;
import src.TextFile.AppUser.src.entity.User;
import src.TextFile.AppUser.src.impl.Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class UserManager implements Manager {
    private List<User> users;
    private final String pathFile = "data.txt";
    public UserManager() {
        this.users = new ArrayList<User>();

    }


    @Override
    public void addUser(User user) {
        //đọc dữ liệu từ file
        try{
            this.users =readDataToFile();
            this.users.add(user);
            WriteDataToFile(user);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }

    @Override
    public void showList() {
        //doc tu lieu tu file
       try{
           this.users = readDataToFile();
           //dùng for each print ra từng user
           for ( User user : this.users){
               System.out.println(user);
           }

       }catch (IOException e) {
           System.out.println(e.getMessage());
       }


    }

    @Override
    public void DeleteUser(int id) {

    }

    @Override
    public void UpdateUser(int id, User user) {
       try{
           this.users = readDataToFile();
           //tim user
           for(User item : this.users){
               if(item.getId() == id){
                   item.setName(user.getName());
                   item.setEmail(user.getEmail());
                   item.setPassword(user.getPassword());
                   item.setBirthDay(user.getBirthDay());
               }
           }
          //ghi lai sao file
           File myFile = new File(pathFile);
           if(!myFile.exists()){
               throw new FileNotFoundException("File not found");

           }
           FileWriter fw = new FileWriter(myFile,true);
           BufferedWriter bw = new BufferedWriter(fw);
           for(User item : this.users){
               if(item.getId() == id){
                   bw.write(item.getName());
                   bw.newLine();
                   bw.write(item.getEmail());
                   bw.newLine();
                   bw.write(item.getPassword());
                   bw.newLine();
                   bw.write(item.getBirthDay());
                   bw.newLine();

               }
           }
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    @Override
    public User getUser(int id) {
        return null;
    }


    public List<User> readDataToFile() throws IOException {
        //tao file
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //đọc theo dòng
        String line;
        // Tạo một array rỗng để add user vào
        List<User> listUser = new ArrayList<>();

        while ((line = bufferedReader.readLine())!= null && !line.isEmpty()){
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            String password = data[2];
            String email = data[3];
            String birthDay = data[4];
            User user = new User(id, name, password, email, birthDay);
            listUser.add(user);
        }
        return listUser;
    }

    public void WriteDataToFile(User user) throws IOException {
        //đọc dữ liệu file
        File myFile = new File(pathFile);
        if (!myFile.exists()){
            throw new FileNotFoundException("File not found");

        }
        String newLine = user.getId()+ "," + user.getName() + "," + user.getPassword() + "," + user.getEmail() + "," + user.getBirthDay();
        FileWriter fileWriter = new FileWriter(myFile, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.newLine();
        writer.append(newLine);

        writer.close();


    }


}
