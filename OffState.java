public class OffState implements State{

    SprinklerSystem sprinklerSystem;

    public OffState(SprinklerSystem sprinklerSystem){
        this.sprinklerSystem = sprinklerSystem;
    }

    @Override
    public void turnOn() {
        if (sprinklerSystem.getLimit() > 0){
            System.out.println("Sprinkler system is now watering the grass.");
            sprinklerSystem.setState(sprinklerSystem.getOnState());
        } else {
            System.out.printf("You have reached the daily watering limit of %d hours set by local ordinance.\n", sprinklerSystem.getInitialLimit());
            sprinklerSystem.setState(sprinklerSystem.getLimitReachedState());
        }
    }

    public void turnOff(){
        System.out.println("Sorry, the sprinkler system is already off");
    }

    @Override
    public void passOneHour() {
        System.out.println("One hour has passed and the sprinklers were off. 0 hours of your limit has been used.");
    }

    @Override
    public void toggleRain() {
        System.out.println("Sprinklers have been off and it has started raining");
        sprinklerSystem.setState(sprinklerSystem.getIsRainingState());
    }
}
