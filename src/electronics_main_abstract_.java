public class electronics_main_abstract_ {
    public static void main(String[] args){
        electronic_abstract_tv t=new electronic_abstract_tv();
        t.turnon();
        t.turnoff();
        electronics_abstract_radio r=new electronics_abstract_radio();
        r.turnon();
        r.turnoff();
    }
}
