public class ReadContentTextFile{

    public String readFile(String fileName){

        return fileName.toUpperCase();

    }

    public int fileLength(String fileName){

        return fileName.length();

    }
}





//import javax.swing.text.Document;
//import java.io.*;
//
//public class ReadContentTextFile
//{
//    public static void main(String[] args)throws Exception
//    {
////// We need to provide file path as the parameter:
////// double backquote is to avoid compiler interpret words
////// like \test as \t (ie. as a escape sequence)
////        File file = new File("/home/vivekanand/Calculator/src/TextFile");
////
////        BufferedReader br = new BufferedReader(new FileReader(file));
////
////        String st;
////        while ((st = br.readLine()) != null)
////            System.out.println(st.toUpperCase());
//        FileOutputStream fos = new FileOutputStream("TestFile.txt");
//        DataOutputStream dos= new DataOutputStream(fos);
//        dos.writeUTF("Vivekanand Pandey\n yahu");
//        dos.writeUTF("yoyo");
//        // now to read a file from already existing  file
//         FileReader fis = new FileReader("TestFile.txt");
//     //    DataInputStream dis=new DataInputStream(fis);
//       //  String s=fis.readUTF();
//         System.out.println(fis);
//    }
//}
