////////////////////////////////////////////////////////////////////////////////////////////////////
// Name:            Daniel Zapotoczny
// Date:            19-Feb-2021
// Course Name:		CPSC 60000 | Object Oriented Development
// Semester:		Spring I 2021
// Assignment Name:	PROGRAMMING ASSIGNMENT #5 - State Pattern
// Program Name:	ZapotocznyHW5
////////////////////////////////////////////////////////////////////////////////////////////////////
public class ZapotocznyHW5 {
    public static void main(String [] args){
        SprinklerSystem s = new SprinklerSystem(2);

        System.out.println(s);

        s.turnOn();
        s.passOneHour();
        s.turnOff();

        System.out.println(s);

        s.toggleRain();
        s.passOneHour();

        System.out.println(s);

        s.turnOn();
        s.turnOff();
        s.passOneHour();
        s.toggleRain();

        System.out.println(s);

        s.turnOn();
        s.passOneHour();

        System.out.println(s);

        s.turnOn();
        s.turnOff();
    }

}
