package javaders.day13loops;

public class Lopps02 {

    public static void main(String[] args) {

        // Verilen bir string de kucuk harfleri consola yazmayiniz sadece Buyuk harfleri ve digerlerini yazdiriniz.
        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for(int i=0 ; i<s.length() ; i++){
            char ch =s.charAt(i);
            if(ch>='a' && ch<='z'){
                continue; // Loop yaparken bazi elemanlari isleme sokmamak icin "continue" kullanilir.
            }else{
                System.out.print(ch);
            }
        }
        //"break" ile "continue" arasindaki fark:
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        System.out.println();

        //BIR STRING'I TERS CEVIREN KODU YAZINIZ.
        //"Java" ==> "avaJ"
        //yeni bir data icin onu icine koymak icin bir konteynir olusturmak lazim.
        // yani Java datasindan avaJ datasini elde etmek icin.


        //1.Yol
        String str = "Java";

        String ters = "";

        for (int i=str.length()-1;i>=0;i--){
            ters = ters + str.substring(i,i+1); // burada String "" ve String concat ediliyor

        }
        System.out.println(ters);

        //2.Way:
        String u = "Java";
        String ters2 = "";

        for(int i=u.length()-1; i>=0;i--){
            ters2 = ters2 + u.charAt(i); // burada String "" ve char 'i' concat ediliyor
        }
        System.out.println(ters2);

        //iki farkli data type'ini concat etmek Java icin cok iyi degildir.
        //onun icin ikinci yolda string ve char datalarini concat etmek pek tercih edilmez.

        //Bir tam sayinin rakamlarinin toplamini veren kodu yaziniz.
        //578 ==> 5+7+8 = 20

        int sum = 0;

        for(int i=578;i>0;i=i/10){

            sum=sum + i%10;

        }
        System.out.println(sum);

        //negatif sayilar icin ayni soru

        int sum1 = 0;
        int n = -578;
        n =Math.abs(n);

        for(int i=n;i>0;i/=10){

            sum1 += i%10;
        }
        System.out.println(sum);



    }

}
