package lab.sportmaster;

public class Chocolate extends Dessert {

    String chocolateName;
    String chocolateType;
    int cacaoPercent;

    public Chocolate(String chocolateName, String chocolateType ,int cacaoPercent, int proteinCount, int carbohydratesCount, int fatsCount) {
        super("Шоколад" ,proteinCount, fatsCount, carbohydratesCount);
        this.chocolateName = chocolateName;
        this.chocolateType = chocolateType;
        this.cacaoPercent = cacaoPercent;
    }

    @Override
    public String toString() {
        return String.format("--------------------------------------------------------------------------------------\nНазвание шоколада: %s\nТип шоколада: %s\nПроцент какао: %s\nБелки: %s\nЖиры: %s\nУглеводы: %s\n--------------------------------------------------------------------------------------\n", this.chocolateName, this.chocolateType, this.cacaoPercent, this.proteinCount, this.fatsCount, this.carbohydratesCount);
    }
}
