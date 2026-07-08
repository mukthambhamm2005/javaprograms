public class main_class_student {
    public static void main(String[] args){
        student mystudent=new student();

        mystudent.name="sara";
        mystudent.age=21;
        mystudent.marks=90;

        mystudent.displayDetails();
        System.out.println("name :"+mystudent.name);
        System.out.println("age :"+mystudent.age);
        System.out.println("marks :"+mystudent.marks);

    }

}
