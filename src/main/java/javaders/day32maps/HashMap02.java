package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        // for example : "I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        //sentence : "I like you, like like!"

        String s = "I like you you, like like!";

         //like ile like! i ayni yapabilmek icin tum noktalama isaretlerini silelim.
        s = s.replaceAll("\\p{Punct}","");
        System.out.println(s); // I like you you like like

        //Ben kelimelerle calismaliyim, bu yuzden split(" ") kullanacagim
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[I, like, you, you, like, like]

        HashMap<String,Integer> occ = new HashMap<>();

        //words Array'inde ki kelimeler birer birer Map de varmi yokmu diye kontrol edilecek.
        //words Array'inde ki kelimeler Map de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //words Array'inde ki kelimeler Map de varsa Map'e varolan value'yu 1 arttirilarak yerlestirilecek.

        for (String w: words) {

            Integer numOfOccurence = occ.get(w);
            if (numOfOccurence == null){
                occ.put(w,1);

            }else{
                occ.replace(w,numOfOccurence+1);
            }

        }
        System.out.println(occ); // {like=3, I=1, you=2}



    }
}
