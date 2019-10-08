import java.io.*;
//Write filehandling programs in Journal -- two of them.
class FileRead{
  public static void main(String args[]){
    try{
      FileInputStream fr = new FileInputStream("text.txt");
      FileInputStream fs = new FileInputStream("words.txt");
      FileInputStream ft = new FileInputStream("lines.txt");
      FileOutputStream fw = new FileOutputStream("dest.txt");
      int i;
      while ((i=fr.read()) !='#')
        fw.write((char)i);

      while ((i=fs.read()) !='#')
        fw.write((char)i);

      while ((i=ft.read()) !='#')
        fw.write((char)i);

      fr.close();fs.close();ft.close();fw.close();
      FileInputStream k = new FileInputStream("dest.txt");
      FileOutputStream a = new FileOutputStream("a.txt");
      FileOutputStream b = new FileOutputStream("b.txt");
      FileOutputStream c = new FileOutputStream("c.txt");
      while ((i=k.read()) !='$')
        a.write((char)i);
      while ((i=k.read()) !='$')
        b.write((char)i);
      while ((i=k.read()) !='$')
        c.write((char)i);
    }
    catch(Exception e){

    }
  }
}
