package lab.sportmaster;

public class IceCream extends  Dessert {

    String iceCreamName;
    String iceCreamTaste;

    public IceCream(String iceCreamName, String iceCreamTaste, int proteinCount, int carbohydratesCount, int fatsCount){
        super("Мороженое" ,proteinCount, fatsCount, carbohydratesCount);
        this.iceCreamName = iceCreamName;
        this.iceCreamTaste = iceCreamTaste;
    }

    @Override
    public String toString() {
        return String.format("--------------------------------------------------------------------------------------\nНазвание мороженого: %s\nТип мороженого: %s\nБелки: %s\nЖиры: %s\nУглеводы: %s\n--------------------------------------------------------------------------------------\n", this.iceCreamName, this.iceCreamTaste, this.proteinCount, this.fatsCount, this.carbohydratesCount);
    }

    @Override
    public int countCalories(){
        System.out.println("Ошибка!");
        return -1;
    }

}
