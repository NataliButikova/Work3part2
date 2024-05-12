public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weigth = 98;
        double height = 1.87;
        int index = service.calculate(weigth,height);
        System.out.println(index);
    }
}
