public class Main {

    public static void main (String [] args){
        if(BarkingDog.shouldWakeUp(true, 23)){
            System.out.println("The dog is barking, shouldWakeUp");
        }
        System.out.println(BarkingDog.shouldWakeUp(true, 23));
    }
}
