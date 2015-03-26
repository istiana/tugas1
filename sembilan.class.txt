/**
 * Created by USER on 3/25/2015.
 */
public class sembilan {
    public static void main(String[] args) {
        int a=1;
        int b=20;
        int c;

        for(a=1;a<=b;a++){
            if(a%5==0){
                System.out.print("joni");
            } else {
                System.out.print(a);
            }
            if(a<b){
                System.out.print(" ");
                if(a%11==0){
                    System.out.print("\n");
                }
            }
        }
    }
}
