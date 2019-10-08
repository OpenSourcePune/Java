import java.io.*;

class Test{
  public static void main(String args[]){
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    char s[] = new char[100];
    for(int i=0;i<100;i++){
      try{
      s[i]=b.readLine().charAt(0);
      System.out.println(s[i]);
      }catch(Exception e){}
    }
  }
}
