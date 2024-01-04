package javaders.day028interface;

public interface Animal {

    void eat(); //abstract method

    void drink(); //abstract method

    // 1)Interface'lerdeki tuum variable'lar otomatik olarak Final'dir. Bu yuzden interfcace icindeki Variable'i
    //     olusturdugunuz da mutlaka deger atamasi yapmaliyiz.
    //     Bilindigi gibi Final Variable'larin degerleri degistirilemez.
    // 2)Interface'lerdeki tum Variable'lar otomatik olarak "public"dir.
    // 3)Interface'lerdeki tum  Variable'lar otomatik olarak "static"dir. Cunku static olmayan  Variable'a ulasmak icin object
    //olusturmak zorundayiz fakat interface class'larda object olusturamayiz.
    int age=4;


}
