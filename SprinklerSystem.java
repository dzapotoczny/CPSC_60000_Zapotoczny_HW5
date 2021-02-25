public class SprinklerSystem {
    State offState;
    State onState;
    State isRainingState;
    State limitReachedState;

    State state;
    int limit = 0; // limit is number of hours per day according to "city ordinance"
    int initialLimit = 0;

    public SprinklerSystem(int limit) {
        this.limit = limit;
        initialLimit = limit;

        offState = new OffState(this);
        onState = new OnState(this);
        isRainingState = new IsRainingState(this);
        limitReachedState = new LimitReachedState(this);
        if (limit > 0) {
            state = offState;
        } else{
            state = limitReachedState;
        }
    }

    public void turnOn(){
        state.turnOn();
    }

    public void turnOff(){
        state.turnOff();
    }

    public void passOneHour(){
        state.passOneHour();
    }

    public void toggleRain(){
        state.toggleRain();
    }

    void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
    public State getOffState(){
        return offState;
    }

    public State getOnState(){
        return onState;
    }

    public State getIsRainingState(){
        return isRainingState;
    }

    public State getLimitReachedState(){
        return limitReachedState;
    }

    public String toString(){
        return "\nSprinkler System\nTotal daily limit: " + initialLimit + "\nDaily limit remaining: " + limit + "\n";
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getInitialLimit() {
        return initialLimit;
    }

    public void setInitialLimit(int initialLimit) {
        this.initialLimit = initialLimit;
    }

}
