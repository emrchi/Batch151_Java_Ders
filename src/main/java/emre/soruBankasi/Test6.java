package emre.soruBankasi;

import java.util.HashMap;
import java.util.TreeMap;

public class Test6 {

    //Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
    //(Büyük/küçük harfe duyarlı değil)

    public static void main(String[] args) {
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";


        s=s.replaceAll("[\\p{Punct}]","");
        System.out.println(s);

        String arr[]=s.toLowerCase().split(" ");

        HashMap<String,Integer> map = new HashMap<>();


        for (String w: arr) {
            if(!map.containsKey(w)){
                map.put(w,1);

            }else{
                map.replace(w,map.get(w)+1);
            }

        }

        TreeMap<String,Integer> sorted= new TreeMap<>(map);
        System.out.println(sorted);
    }




}
