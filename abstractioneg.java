abstract class vehicle{
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped");
    }
}

class car extends vehicle{
    void start(){
        System.out.println("Vehicle started - CAR");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println("Vehicle started - BIKE");
    }
}

public class abstractioneg{
    public static void main(String[] args) {
        vehicle myc=new car();
        myc.start();
    }
}