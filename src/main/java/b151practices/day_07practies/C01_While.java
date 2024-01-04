package b151practices.day_07practies;

public class C01_While {

    public static void main(String[] args) {




    // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
    // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz



            int sayi = 3 ;
            int result = faktoriyel(sayi);
            System.out.println(result);

        }

        public static int faktoriyel (int sayi){


            if (sayi == 0){
                return 1;
            }else {
                return sayi*faktoriyel(sayi-1);
            }
        }









}
