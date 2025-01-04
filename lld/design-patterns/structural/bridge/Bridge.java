/**
 * Bridge pattern is used to decouple the implementation from inheritance.
 */

/*
 * Original Implementation
 * 
 * interface Breathe{
 * void breathe();
 * }
 * 
 * class Human implements Breathe{
 * public void breathe(){
 * System.out.println("Break from nose lungs: 0xygen to c02");
 * }
 * }
 * 
 * 
 * class Tiger implements Breathe{
 * public void breathe(){
 * System.out.println("Break from nose lungs: 0xygen to c02");
 * }
 * }
 * 
 * 
 * class Fish implements Breathe{
 * public void breathe(){
 * System.out.println("Break from gills lungs: 0xygen to c02");
 * }
 * }
 * 
 * PROBLEM : Code duplicacy : there can be multiple animals that use the same
 * breathing method : but are defined seperately
 * If we want to add new breathing method, we have to implement the interface as
 * the complete animal
 * 
 * Solution : WE have to seperate out the impelemtation from the interface
 */

interface BreatheImplementor {
    void breathe();
}

class GilBreathImplementor implements BreatheImplementor {
    public void breathe() {
        System.out.println("Skin breather");
    }
}

class NoseBreather implements BreatheImplementor {
    public void breathe() {
        System.out.println("Skin breather");
    }
}

abstract class Animal {
    protected BreatheImplementor breatheImplementor;

    Animal(BreatheImplementor implementor) {
        this.breatheImplementor = implementor;
    }

    public void breathe() {
        breatheImplementor.breathe();
    }
}

class Human extends Animal {
    public Human() {
        super(new NoseBreather());
    }
}

class Fish extends Animal {
    public Fish() {
        super(new GilBreathImplementor());
    }
}

/*
 * This allows the implementors and the animal class to grow independently.
 * Similar to strategy pattern
 * The intent of the bridge pattern is to decouple the implementation from the
 * interface
 * New impleemntor can be added without the need of the animal.
 * Animal can reuse the existing implementors as well.
 */