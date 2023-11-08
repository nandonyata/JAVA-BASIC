
public class expression {
    public static void main(String[] args) {
        double num = 10;
        System.out.println(num);

        num = (double) num / 3; 
        // output: 3.3333333333333335
        // if we dont add (double), the output will be 3.0

        System.out.println(num);
    }
}
