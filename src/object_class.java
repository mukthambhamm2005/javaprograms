public class object_class {
    public static void main(String[] args){
        Car myCar=new Car();

        myCar.color="Red";
        myCar.speed=120;

        myCar.start();
        myCar.stop();
        System.out.println("color :"+myCar.color);

    }
}
