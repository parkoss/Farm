public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public String irrigate(int plus){
        chanceOfGrowth = chanceOfGrowth + plus;
        return "done";
    }

    public static Flower chooseFlower(int choice){
        switch (choice){
            case 1:
                return new Corn("corn",15,5,60);
            case 2:
                return new Carrot("carrot",20,4,60);
            case 3:
                return new Potato("potato",10,3,80);
        }

        return null;
    }


}
