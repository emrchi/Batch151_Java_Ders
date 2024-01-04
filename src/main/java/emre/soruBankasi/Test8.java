package emre.soruBankasi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Test8 {

    //1)Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    //bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.


    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Collection<Integer> numOfProduct = product.values();
        int toplam = numOfProduct.stream().reduce(0,(t,u)->(t+u));
        System.out.println(toplam);

    }
}
