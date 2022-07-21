package pl.kurs.consumer;

import java.util.function.Consumer;

public class ConsumerRunner {
    public static void main(String[] args) {
        //Consumer<Integer> consumer1 = (Integer i) -> System.out.println(i * i);
        Consumer<Integer> consumer1 = x -> System.out.println(x * x);

        consumer1.accept(6);

        Consumer<String> bluzgator = s -> System.out.println(s + " to pała pierdolona xdd");
        bluzgator.accept("Glapiński");

        Consumer<String> consumer3 = x -> {
            System.out.println(x);
            System.out.println(x + x);
            System.out.println(x + x + x);
            System.out.println(x + x + x + x);
            System.out.println(x + x + x);
            System.out.println(x + x);
            System.out.println(x);
        };
        consumer3.accept("XD");

//        Soldier soldier1 = new Soldier("James", "Ryan", Soldier.Rank.PRIVATE);
//        Consumer<Soldier> rankPromoter = x -> {
//            Soldier.Rank[] ranks = Soldier.Rank.values();
//            if (x.getRank() != ranks[ranks.length - 1]){
//                x.setRank(ranks[x.getRank().ordinal() + 1]);
//            }
//        };
//
//        rankPromoter.accept(soldier1);
//        System.out.println(soldier1);
//        System.out.println("----------------------");
//
//        rankPromoter.accept(soldier1);
//        System.out.println(soldier1);
//        System.out.println("----------------------");
//
//        rankPromoter.accept(soldier1);
//        System.out.println(soldier1);
//        System.out.println("----------------------");
//
//        rankPromoter.accept(soldier1);
//        System.out.println(soldier1);
//        System.out.println("----------------------");
//
//        rankPromoter.accept(soldier1);
//        System.out.println(soldier1);
//        System.out.println("----------------------");
//
//        rankPromoter.accept(soldier1);
//        System.out.println(soldier1);
//        System.out.println("----------------------");
//
//        rankPromoter.accept(soldier1);
//        System.out.println(soldier1);
//        System.out.println("----------------------");



    }
}
