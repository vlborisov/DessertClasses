package lab.sportmaster;

public class Main {
    public static void main(String[] args) {
        Chocolate firstChocolate = new Chocolate( "Бабаевский", "Горький", 70, 6, 49, 35);
        Chocolate secondChocolate = new Chocolate("Милка", "Молочный", 30, 3, 59, 41);
        IceCream firstIceCream = new IceCream("Коровка", "Пломбир", 4, 17 ,30);
        IceCream secondIceCream = new IceCream( "Магнат", "Пломбир", 7, 27 ,40);
        Dessert dessert = new Dessert("Круасан", 3, 14, 25);

        Dessert[] desserts = {firstChocolate, firstIceCream, secondChocolate, secondIceCream, dessert};

        for (Dessert value : desserts) {
            System.out.println(value.toString());
            System.out.println("Калории: " + value.countCalories());
        }

    }
}