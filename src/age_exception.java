public class age_exception {
    static void checkAge(int age) throws Exception{
        if (age<18){
            throw new invalid_age_exception("age must be 18 or above");
        }
    }
    public static void main(String[] args){
        try{
            checkAge(14);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
