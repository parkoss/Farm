import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower>flowers;
    private ArrayList<Animal>animals;

    private int size=100;

    public Farm(int size) {
        this.flowers = flowers;
        this.animals = animals;
        this.size = size;
    }

    public String plantFlower(Flower flower,int choice){
        if (flowers.size()<=5){
            flowers.add(Flower.chooseFlower(choice));
        }else{
            return "seed cannot be planted";
        }
        return "seed planted!";
    }



}
