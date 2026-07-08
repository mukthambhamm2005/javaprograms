public class main_class_mobile {
    public static void main(String[] args){
        mobile mymobile=new mobile() ;
        mymobile.model="i Phone 15";
        mymobile.storage=128;
        mymobile.price=120000;
        mymobile.displaySpecs();
        System.out.println("model :"+mymobile.model);
        System.out.println("storage :"+mymobile.storage);
        System.out.println("price :"+mymobile.price);

    }
}
