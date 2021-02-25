public class LimitReachedState implements State{
    SprinklerSystem sprinklerSystem;

    public LimitReachedState(SprinklerSystem sprinklerSystem){
        this.sprinklerSystem = sprinklerSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Sprinkler can't be turned on because daily limit has been reached!");
    }

    public void turnOff(){
        System.out.println("Sprinklers are already turned off due to reaching the maximum daily limit.");
    }

    @Override
    public void passOneHour() {
        System.out.println("One hour has passed and the sprinklers were off.");
    }

    @Override
    public void toggleRain() {
        System.out.println("Sprinklers have been off and it has started raining");
        sprinklerSystem.setState(sprinklerSystem.getIsRainingState());
    }
}
