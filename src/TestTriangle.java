import java.util.Scanner;

public class TestTriangle {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\nEnter a base: ");
        double triBase = in.nextDouble();
        System.out.print("Enter a height: ");
        double triHeight = in.nextDouble();
        System.out.print("Enter a hypotenuse: ");
        double triHypo = in.nextDouble();

        double aSqBsq = Math.pow(triBase,2) + Math.pow(triHeight,2);
        double cSq = Math.pow(triHypo,2);

        if(aSqBsq == cSq){
            System.out.print("\nYes, that's a right triangle!\n");
        }else if(aSqBsq != cSq){
            System.out.print("\nNope...not a right triangle.\n");
        }else{
            System.out.print("\nNope...not a right triangle.\n");
        }
    }
}
