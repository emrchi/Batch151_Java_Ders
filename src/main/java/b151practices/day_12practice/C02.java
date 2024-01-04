package b151practices.day_12practice;

public class C02 {

        String isim;
        int yas;
        String tel;

        public C02(String isim, int yas, String tel) {
            this.isim = isim;
            this.yas = yas;

        }


        public static void main(String[] args) {
            C02 obj1 = new C02("Burak",32,"0533204");

            System.out.println(obj1.isim + "," + obj1.yas + "," +obj1.tel); //Burak,32,null
        }

}