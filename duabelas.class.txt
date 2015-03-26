/**
         * Created by TOSHIBA on 3/25/2015.
         */
        public class duabelas {
            public static void main(String[] args) {
                int x;
                int y;
                int panjang=5;
                int lebar=10;

                for(x=1;x<=lebar;x++){
                    if(x%2==0){
                        System.out.print(" ");
                    }
                    for(y=1;y<=panjang;y++){
                        System.out.print("#");
                    }
                    System.out.print("\n");
                }
            }
        }
