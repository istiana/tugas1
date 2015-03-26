/**
 * Created by USER on 3/24/2015.
 */
public class enam {
    public static void main(String[] args) {
        int pertama=1;
        int kedua=10;
        int jumlah=0;
        System.out.println("angka yang pertama = "+pertama);
        System.out.println("angka yang terakhir ="+kedua);
        System.out.println("jumlah dari deretan nagka diatas = ");

        while(pertama<=kedua){
            jumlah=jumlah+pertama;
            pertama++;
        }
        System.out.println(jumlah);
    }

}
