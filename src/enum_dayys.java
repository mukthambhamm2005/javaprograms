public class enum_dayys {
    public static void main(String[] args){
        enum_days d=enum_days.MONDAY;

        switch(d){
            case MONDAY:
                System.out.println("Start of the day");
                break;
            case FRIDAY:
                System.out.println("almost weekend");
                break;
            case SUNDAY:
                System.out.println("rest day");
                break;
            default:
                System.out.println("midweek day");
        }
    }
}
