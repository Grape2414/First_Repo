package module1.chapter2;

public class Lesson12SwitchStatement {
    public static void main(String[] args) {
        String day="Sun";
        switch (day){
            case "Mon" :
                System.out.println("sleep morning");break;
            case "Tue" :
                System.out.println("sleep noon");break;
            case "Wed" :
                System.out.println("sleep afternoon");break;
            case "Thru" :
                System.out.println("sleep evening");break;
            case "Fri" :
                System.out.println("sleep night");break;
            case "Sun" :
                System.out.println("sleep midnight");break;
            case "Sat":
                System.out.println("sleep dawn");
        }
    }
}
