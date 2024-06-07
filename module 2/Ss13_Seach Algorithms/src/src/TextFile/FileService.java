package src.TextFile;
import java.io.*;


public class FileService {
    public static void main(String[] args) {
        File myFileService = new File("./app/data.txt");
        if (myFileService.exists()){
//            System.out.println("name File "  + myFileService.getName());
//            System.out.println(myFileService.getPath());
//            System.out.println("hoan thanh ");
//            if(myFileService.canRead()){
//                System.out.println("File is readable");
//            }else {
//                System.out.println("File is not readable");
//            }

            if(myFileService.canWrite()){
                System.out.println("File is writable");
                //ghi lai du lieu file
                try {
                   /* FileWriter fileWriter = new FileWriter(myFileService);
                    String content = " this is content . " ;
                    fileWriter.write(content);
                    //tao 1 doong moi
                    fileWriter.append("\n");
                    fileWriter.write("fsajhdfsadfhajskdfas");
//                    fileWriter.write(System.lineSeparator());
                    fileWriter.close();

                    */
                    //use
//                   BufferedWriter writer = new BufferedWriter(new FileWriter(myFileService));
                   FileReader fr = new FileReader(myFileService);
                   BufferedReader br = new BufferedReader(fr);
                   String line = null;
                    while ((line = br.readLine()) != null) {

                        int id = Integer.parseInt(line.split(" ")[0]);
                        String name = line.split(" ")[1];
                        System.out.println(name );
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }else {
                System.out.println("File is not writable");
            }




        }else
            System.out.println("loi");
    }



}
