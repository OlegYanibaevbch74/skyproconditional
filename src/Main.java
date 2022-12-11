import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Условный оператор. Часть 1
        System.out.println("1/Задача 1");
        int age1 = 19;
        if (age1 >= 18){
            System.out.println("Поздравляю, ты уже взрослый.");}
        if (age1 < 18){
            System.out.println("Извини, пока ты не сможешь полностью решать юридические вопросы.");}


            System.out.println("1/Задача 2");
            int age = 21;
            if (age >= 7 && age < 18) {
                System.out.println("учится в школе");
            }
            if (age >= 18 && age < 24) {
                System.out.println("учится в ВУЗе");
            }
            if (age >= 24) {
                System.out.println("Тебе уже за 24?!! Иди и работай.");
            }

            System.out.println("1/Задача 3");
            int placeInTheRailwayCarriage = 159; // информация запрос
            if (placeInTheRailwayCarriage >= 1 && placeInTheRailwayCarriage <= 60) {
                System.out.println("сидячиx мест в вагоне, в достатке");
            }
            if (placeInTheRailwayCarriage >= 61 && placeInTheRailwayCarriage <= 102) {
                System.out.println("остались только стоячие места в вагоне");
            }
            if (placeInTheRailwayCarriage > 102) {
                System.out.println("свободных мест нет!!!!");
            }

            // Условный оператор. Часть 2
            System.out.println("2/Задача 1");
            int age2 = 14;
            if (age2 >= 18) {
                System.out.println("Поздравляю, ты уже взрослый.");
            } else {
                System.out.println("Извини, пока ты не сможешь полностью решать юридические вопросы.");
            }
        System.out.println("2/Задача 2");
        int age3 = 20;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("учится в школе");
        }else
            if (age3 >= 18 && age3 < 24) {
            System.out.println("учится в ВУЗе");
        }else
            if (age3 >= 24) {
            System.out.println("Тебе уже за 24?!! Иди и работай.");
        }
        System.out.println("2/Задача 3");
        int placeInTheRailwayCarriage1 = 109; // информация запрос
        if (placeInTheRailwayCarriage1 >= 1 && placeInTheRailwayCarriage1 <= 60) {
            System.out.println("сидячиx мест в вагоне, в достатке");
        } else if (placeInTheRailwayCarriage1 >= 61 && placeInTheRailwayCarriage1 <= 102) {
            System.out.println("остались только стоячие места в вагоне");
        } else if (placeInTheRailwayCarriage1 > 102) {
            System.out.println("свободных мест нет!!!!");
        }
        // Условный оператор. Часть 3
        System.out.println("3/Задача 1");
        int age4 = 15;
        if (age4 >=2 && age4 <=6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить детский сад.");
        }
        if (age4 >= 7 && age4 < 18) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить учится в школе.");
        }
        if (age4 >= 18 && age4 < 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить учится в ВУЗе.");
        }
        if (age4 >= 24) {
            System.out.println("Тебе уже за 24?!! Иди и работай.");
        }
        System.out.println("3/Задача 2");
        int ageLimit = 4;
        if (ageLimit <= 5) {
            System.out.println("Получатель услуги возрастом менее 5 лет не может кататься на аттракционе.");
        }else
        if (ageLimit >= 5 && ageLimit < 14) {
            System.out.println("Получатель услуги возрастом более 5 лет, но менее 14 лет может кататься только в сопровождении взрослого.");
        }else
        if (ageLimit >= 14) {
            System.out.println("Получателю услуги возрастом  14 лет и более может использовать атракцион без сопровождения взрослых.");
        }
        System.out.println("3/Задача 3");
        int one = 25000;
        int two = 3620;
        int three = 2568;
        if (one > two && two > three){
            System.out.println("число "+one +" наибольшее");
        }else
        if (one < two && two < three){
            System.out.println("число " + three + " наибольшее");
        }else
        if (one < two && two > three){
            System.out.println("число " + two + " наибольшее");
        }
        }


        }