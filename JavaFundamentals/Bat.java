public class Bat extends Mammal {

    public Bat() {
        this.setEnergyLevel(300);
    }

    public void fly() {
        if (this.getEnergyLevel() >= 50) {
            System.out.println("Bat is flying");
            this.setEnergyLevel(this.getEnergyLevel() - 50);
        } 
        else {
            System.out.println("Bat is sleepy, zzzz...");
        }
    }

    public void eatHumans() {
        System.out.println("Bat has eaten a human");
        this.setEnergyLevel(this.getEnergyLevel() + 25);
    }

    public void attackTown() {
        if (this.getEnergyLevel() >= 100) {
            System.out.println("Bat is attacking a town");
            this.setEnergyLevel(this.getEnergyLevel() - 100);
        } 
        else {
            System.out.println("Bat is sleepy, zzzz...");
        }
    }
}
