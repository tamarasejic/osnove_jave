package p19_09_2023.Zadatak2;

public class Skakac extends Atleticar{
    public Skakac(String firstName, String lastName, double score) {
        super(firstName, lastName, score);
    }

    @Override
    public boolean isBetter(Atleticar atleticar){
        if (this.score > atleticar.getScore()){
            return true;
        }
        return false;
    }
}
