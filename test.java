import java.util.Scanner;

public class test {
    String character;

    public test(){
        this.character = "null";

    }

    public void function(){
        System.out.println("TESTING");
        this.character="A";

    }

    public static void main(String[] arg){
        test random = new test();
        System.out.print("Hello");
        String x="true";
        Scanner input = new Scanner(System.in);


        while (x.equals("true")){
            String user_response = input.nextLine().toUpperCase();
            random.function();
            System.out.println(user_response);

            if (user_response.equals("BREAK")){
                break;
            }

        }
        
        String user_input = input.nextLine().toUpperCase();

        input.close();
    }
    
}
