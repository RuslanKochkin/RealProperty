
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                new House(andrey, "DE 345682910", "Сушкина ", 120000, 96, hous, 3),
                new House(vasil, "DE 344672910", "Пушкина ", 80000, 35, hous1, 3),
                new Apartment(vitos, "DE 346345747", "Лукошенко", 100000, 88, apartment, 8),
                new Land(andrey1, "DE 3463455398957", "Дучковат ", 9456000, 3000, LandPurpose.INDUSTRIAL),
                new Land(vasil, "DE 34634335345657", "Кучковат  ", 77000, 2000, LandPurpose.SETTLEMENTS),
                new Land(andrey1, "DE 34634535357", "Сучковат ", 98000, 3000, LandPurpose.AGRICULTURAL),
                new Apartment(vitos, "DE 34634645747", "Путина ", 8000, 15, apartment, 1),
                new Garage(dmitriy, "DE 3463457478876", "Aутина ", 800, 8, 1),
                new Garage(andrey1, "DE 3463457478987", " Пригожина ", 7880, 29, 2),
                new Forest(leyla, "DE 34635353555657", "Лупучкова ", 7000, 200, false),
                new Forest(leyla, "DE 3463553885657", " Пролупучкова", 9000, 200, true),
                new Forest(leyla, "DE 3463553885396", " Упучкова", 9600, 200, true)
        ));
//        System.out.println(realProperty);
        sort(realProperty);

    }
        public static void sort(List<RealProperty> realProperty1){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Как отсортировать?");
            System.out.println("1 - по общей стоимости\n" +
                    "2 - по сумме налога\n" +
                    "3 - по площади\n" +
                    "4 - по адресу ");
            int res = scanner.nextInt();
            switch (res) {
                case 1 -> realProperty1.sort(new RealSortedByPrice());
                case 2 -> realProperty1.sort(new SortByTax());
                case 3 -> realProperty1.sort(new SortArea());
                case 4 -> realProperty1.sort(new sortAddress());
                default -> System.err.println("Нет такого варианта сортировки");
            }
            System.out.println(realProperty1);
        }
    }