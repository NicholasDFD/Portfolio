import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type n to make a new character and end to end program");
        while(!end){
          if(sc.next().equals("n")){
            Stats stats = new Stats();
            stats.drawStats();
          }else if(sc.next().equals("end")){
            end = true;
          }else{
            System.out.println("Unknown command");
          }
        }
    }
}
