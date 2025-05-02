public class Excep {
    public static void main(String[] args) {
        try {
            throw new First1("This is my first exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class First1 extends Exception{
    public First1(String s){
        super(s);
    }
}