public class IsRainingState implements State{
    SprinklerSystem sprinklerSystem;

    public IsRainingState(SprinklerSystem sprinklerSystem){
        this.sprinklerSystem = sprinklerSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("It is currently raining, sprinklers will remain off to prevent wasting water");
    }

    public void turnOff(){
        System.out.println("Sprinklers are already off due to rain");
    }

    @Override
    public void passOneHour() {
        System.out.println("It has been raining for one hour");
    }

    @Override
    public void toggleRain() {
        System.out.println("It has stopped raining. Sprinklers are still off, but can now be turned on.");
        sprinklerSystem.setState(sprinklerSystem.getOffState());
    }
}
