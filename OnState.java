public class OnState implements State{
    SprinklerSystem sprinklerSystem;

    public OnState(SprinklerSystem sprinklerSystem){
        this.sprinklerSystem = sprinklerSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Sprinkler system is already on!");
    }

    public void turnOff(){
        System.out.println("Sprinkler system has been turned off.");
        sprinklerSystem.setState(sprinklerSystem.getOffState());
    }

    @Override
    public void passOneHour() {
        sprinklerSystem.setLimit(sprinklerSystem.getLimit() - 1);
        System.out.printf("One hour has passed and the sprinklers are on. 1 hours of your daily limit has been used. Daily limit remaining: %d\n", sprinklerSystem.getLimit());
        if (sprinklerSystem.getLimit() < 1){
            System.out.println("Daily watering limit has been reached, sprinkler system has been shut off.");
            sprinklerSystem.setState(sprinklerSystem.getLimitReachedState());
        }
    }

    @Override
    public void toggleRain() {
        System.out.println("Sprinklers have been shut off due to rain, no need to waste water!");
        sprinklerSystem.setState(sprinklerSystem.getIsRainingState());
    }
}
