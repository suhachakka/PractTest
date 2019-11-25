import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList stArr = new ArrayList();
        /*stArr.add("Suha;BSC;1;F");
        stArr.add("Ranga;BE;2;M");
        stArr.add("Dhan;7;3;M");
        stArr.add("Manu;5;4;F");

        System.out.println(stArr.toString());

        for(int i=0;i<stArr.size();i++){
            String student = (String)stArr.get(i);
            String[] details = student.split(";");
            System.out.println("Name="+details[0]);
            System.out.println("Grade="+details[1]);
            System.out.println("Id="+details[2]);
            System.out.println("Gender="+details[3]);
        }*/
        Student std = new Student();
        std.setName("Suha");
        std.setGrade("BSC");
        stArr.add(std);

        System.out.println(((Student)stArr.get(0)).getName());


    }
}
