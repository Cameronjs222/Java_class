
public class Mammal {
    // member variables
    private double energyLevel;

    // Constructor
    public Mammal() {
        this.energyLevel = 100;
    }

    public String displayEnergy() {
        String output = String.format("Energy level is %s%n", energyLevel);
        System.out.print(output);
        return output;
    }

    // getter setter

    public double getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

}
