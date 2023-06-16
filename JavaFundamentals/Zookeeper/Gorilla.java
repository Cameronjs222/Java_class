public class Gorilla extends Mammal {

    public void throwSomething() {
        if (this.getEnergyLevel() >= 5){
            System.out.println("Gorilla has thrown something");
            this.setEnergyLevel(this.getEnergyLevel() - 5);
        }
        else {
            System.out.println("Gorilla is sleepy, zzzz...");
        }
    }
    public void eatBananas() {
        System.out.println("Gorilla is satisfied");
        this.setEnergyLevel(this.getEnergyLevel() + 10);
    }
    public void climb() {
        if (this.getEnergyLevel() >= 10){
            System.out.println("Gorilla has climbed a tree");
            this.setEnergyLevel(this.getEnergyLevel() - 10);
        }
        else {
            System.out.println("Gorilla is sleepy, zzzz...");
        }
    }

}
