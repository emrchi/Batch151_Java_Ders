package javaders.day38enumsiterators;

import javaders.day38enumsiterators.UsStatesEnum;

public class EnumRunner {

    public static void main(String[] args) {

        String capitalofIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println("capitalofIllinois = " + capitalofIllinois); //capitalofIllinois = Springfield

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println("abbreviationOfFlorida = " + abbreviationOfFlorida); //abbreviationOfFlorida = FL

        UsStatesEnum state = UsStatesEnum.ALASKA; //Normalde Alaska String gibi duruyor ancak onu String yapinca kizardi.
                                                  // Variable tipini degistirme uyarisini sectik ve duzeldi.
                                                  // String yerine enum'in ismi yazildi. Ornek: UsStatesEnum state=UsStatesEnum.Alaska
        System.out.println(state);  //ALASKA

        String stateNameOfAlaska = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateNameOfAlaska); //Alaska

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationByUsingstateName("Alaska");
        System.out.println(abbreviationOfAlaska); //AK

    }

}
