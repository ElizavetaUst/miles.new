package org.example;

public class Main {
    public static void main(String[] args) {
        int price = 13676; //стоимость билета
        int miles = 20; //стоимость мили
        int bonus = (price / miles); //расчет количества бонусных миль от стоимость билета

        System.out.println("При покупке билета заданной стоимости, вам будет начислено бонусных миль:");
        System.out.println(bonus);
    }
}