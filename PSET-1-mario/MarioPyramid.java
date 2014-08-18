import java.util.Scanner;


public class MarioPyramid {
    int height = 0;
    int setHeight(){
      Scanner input = new Scanner(System.in);
      while (height <= 0 || height > 23){
        System.out.print("How tall do you want it to be? ");
        height = input.nextInt();
      }
      return height;
    }
    String hashes(int row){
      String hashes = "";
      for(int i = 0; i < (row + 2); i++){
        hashes = hashes + "#";
      }
      return hashes;
    }
    
    String spaces(int row){
      String spaces = "";
      for(int i = 0; i < (height-row); i++){
        spaces = spaces + " ";
      }
      
      return spaces;
    }
    
    void printRow(int row){
      System.out.println(spaces(row) + hashes(row));
    }
    void buildIt() {
      for(int step = 0; step < height; step++){
        printRow(step);
      }
    }

  public static void main(String[] args) {
    // TODO Auto-generated method stub    
    MarioPyramid myPyramid = new MarioPyramid();
    myPyramid.setHeight();
    myPyramid.buildIt();
    
  }
}
