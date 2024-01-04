package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {


        /*
        1)Run Buton'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
            ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
            StringIndexOutOfBoundsException
            "Runtime Exception" a ornektir.  "Runtime Exception" lara "Unchecked Exception" da denir.

        2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
            FileNotFoundException, IOException "Compile Time Exception" a ornektir.
            "Compile Time Exception" lara "Checked Exception" da denir.
        3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde,Java "dosyanin adresi" ve "dosyanin varligi"
                                konusunda hata olusursa ne yapmasi gerektigini soylemenizi ister.
                                Ona ne yapmasini soylersek ayrica javayi bu dosyanin silinmedigi konusunda rahatlatmamiz gerekir.

        4)IOException: "IO" Input Output demektir.
        Bu exception input ve output ile ilgili tum problemleri handle edebilir.
        Application'imiza data girdisi yaptigimizda veya data ciktisi yapabiliriz.
        Dosyanin bulunmasi halinde oradaki datayi kullanabiliriz.
        Oyleyse dosyanin bulunmasi input ile alakali bir operasyondur.
        IOException bu nedenle FileNotFoundException'in parent'idir.
        Genel olan spesifik olanin parent'i olur.
        Bu durumda parent catch block'da ona gore sirasini alir.
        Coklu catch block yapmazsak, o zaman sadece IOExeption'i kullaniriz

        5)Java da hata'lar temelde 2'ye ayrilir.
            i)exception'lar   Exception' lar hendle edilebilir hatalardir.
            ii)Error'lar:     Error'lar asla handle edilemezler
                a)StackOverflow Error (Stack Memory'nin dolmasi halinde olusur)
                b)Out Of Memory Error (Heap Memory"nin dolmasi halinde olusur)
                c)Virtual Machine Error ( JVM (Java Sanal Makinesi) nin arizalanmasi halinde olusur)
         */


        public static void main(String[] args) throws IOException {

            //1.Way: Exception'i method signature satirina ekledik

            FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");
            //Burada fis diye bir obje olusturduk FileInputStream classindan.
            // Cunku fis uzerinden read() methodunu kullanmak istesik
            int i = 0;

            while ((i = fis.read())!=-1){
                System.out.print((char) i);
            }

            /*
                read() methodu gelecek ilk character olan "L" yi alir. Aslinda characteri degil Ascii degerini alir.
            L nin Ascii degeri 76 , while ici 76 aldi. 76 esit degil -1 diyoruz
            Ifade dogru oldugu icin 76 yi char'a cevirecek ve buyuk L olarak yazdiracak.
            read() methodu satirin bittigini ve bir alt satira gecmesi gerektigini bilir. Bu sekilde devam eder.
            Read() methodu butun satirlar bittiginde -1 dondurur. Ve sonuc olarak -1 esit degildir -1 diyecegi icin
            Loop kirilir.

            */






    }
}
