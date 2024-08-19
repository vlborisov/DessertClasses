package lab.sportmaster;

public class Dessert {

    String dessertName;
    int proteinCount;
    int carbohydratesCount;
    int fatsCount;

    public Dessert(String dessertName, int proteinCount, int carbohydratesCount, int fatsCount){
        this.dessertName = dessertName;
        this.carbohydratesCount = carbohydratesCount;
        this.proteinCount = proteinCount;
        this.fatsCount = fatsCount;
    }

    public int countCalories(){
        return this.carbohydratesCount * 4 + this.proteinCount * 4 + this.fatsCount * 4;
    }

    @Override
    public String toString() {
        return String.format("--------------------------------------------------------------------------------------\nНазвание десерта: %s\nБелки: %s\nЖиры: %s\nУглеводы: %s\n--------------------------------------------------------------------------------------\n", this.dessertName, this.proteinCount, this.fatsCount, this.carbohydratesCount);
    }
}
