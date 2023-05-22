import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person andrey = new Person("Andrey", "Piankovski");
        Person andrey1 = new Person("Andrey", "Tupolev");
        Person vitos = new Person("Vitos", "Sonce");
        Person dmitriy = new Person("Dmitriy", "Kulibaba");
        Person vasil = new Person("Vasil", "Operovich");
        Person leyla = new Person("Leyla", "Muntyan");
        List<Person> hous = new ArrayList<>();
        List<Person> hous1 = new ArrayList<>();
        List<Person> apartment = new ArrayList<>();
        hous.add(andrey);
        hous.add(leyla);
        hous1.add(vasil);
        hous1.add(vitos);
        apartment.add(dmitriy);
        apartment.add(andrey1);
        List<RealProperty> realProperty = new ArrayList<>(List.of(
                new House(andrey, "DE 345682910", 120000, 96,"Сушкина3333", hous, 3),
                new House(vasil, "DE 344672910", 80000, 35,"Пушкина 3333", hous1, 3),
                new Apartment(vitos, "DE 346345747", 100000, 88,"Лукошенко3333", apartment, 8),
                new Land(andrey1, "DE 3463455398957", 9456000, 3000,"Дучковат3333 ", LandPurpose.INDUSTRIAL),
                new Land(vasil, "DE 34634335345657", 77000, 2000,"Кучковат33333 ", LandPurpose.SETTLEMENTS),
                new Land(andrey1, "DE 34634535357", 98000, 3000,"Сучковат3333 ", LandPurpose.AGRICULTURAL),
                new Apartment(vitos, "DE 34634645747", 8000, 15,"Путина3333 ", apartment, 1),
                new Garage(dmitriy, "DE 3463457478876", 800, 8,"Aутина3333 ", 1),
                new Garage(andrey1, "DE 3463457478987", 7880, 29,"Пригожина3333 ", 2),
                new Forest(leyla, "DE 34635353555657", 7000, 200,"Лупучкова3333 ", false),
                new Forest(leyla, "DE 3463553885657",  9000, 200,"Пролупучкова3333", true),
                new Forest(leyla, "DE 3463553885396", 9600, 200,"Упучкова3333", true)
        ));
//        System.out.println(realProperty);
        sort(realProperty);
        System.out.println( getAcauntMap(realProperty));


    }
    public static void sort(List<RealProperty> realProperty1){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как отсортировать?");
        System.out.println("""
                1 - по общей стоимости
                2 - по сумме налога
                3 - по площади
                4 - по адресу""");
        int res = scanner.nextInt();
        switch (res) {
            case 1 -> realProperty1.sort(new RealSortedByPrice());
            case 2 -> realProperty1.sort(new SortByTax());
            case 3 -> realProperty1.sort(new SortAria());
            case 4 -> realProperty1.sort(new Address());
            default -> System.err.println("Нет такого варианта сортировки");
        }
        System.out.println(realProperty1);
    }
    public static Map<String,Person> getAcauntMap(List<RealProperty>acauntList){
        Map<String,Person>map = new HashMap<>();
        for (RealProperty res: acauntList){
            map.put(res.getCadastralNumber(), res.getOwner());
        }
        return map;
    }
}
//
