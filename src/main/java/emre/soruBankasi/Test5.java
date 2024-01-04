package emre.soruBankasi;

import java.util.*;
import java.util.stream.Collectors;

public class Test5 {

    public static void main(String[] args) {


        //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        //bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Collection<Integer> numOfProducts = product.values();

        numOfProducts.stream().sorted().forEach(t-> System.out.print(t+" "));

        System.out.println("sonraki");



        //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        //bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
        Map<String, Integer> products = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Collection<String> numOfProduct = product.keySet();
        numOfProduct.stream().sorted().forEach(t-> System.out.println(t+","));

        //yada
        List<String> pro = new ArrayList<>(numOfProduct);
        Collections.sort(pro);
        System.out.println(pro);

        //yada
        Collection<String > s=product.keySet();

        List<String> lambda = s.stream().sorted().collect(Collectors.toList());
        System.out.println(lambda);








    }
}
