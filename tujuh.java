/**
 * Created by USER on 3/25/2015.
 */
public class tujuh {
    public static void main(String[] args) {
        double pertama=1;
        double akhir=10;
        double jumlah=0;
        double rata;
        System.out.println("angka yang pertama = "+pertama);
        System.out.println("angka yang terakhir ="+akhir);
        System.out.println("jumlah dari deretan angka diatas = ");

        while(pertama<=akhir){
            jumlah=jumlah+pertama;
            pertama++;
        }
        System.out.println(jumlah);
        rata=jumlah+akhir;
        System.out.println("rata-rata dari deretan diatas ="+rata);
    }
}

