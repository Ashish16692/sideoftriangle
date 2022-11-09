import java.util.Scanner;
public class TriangleSide {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side S1");
        int sideone =scanner.nextInt();

        System.out.println("enter the side S2");
        int sidetwo=scanner.nextInt();

        System.out.println("enter the side S3");
        int sidethree=scanner.nextInt();
        
        if(sideone==sidetwo  && sidetwo==sidethree){
            System.out.println("Equilateral Triangle");

        }
        else if(sideone==sidetwo ||sidetwo==sidethree||sidethree==sideone){
        System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("scalene Triangle");
        }
        
        
        scanner.close();

    }
}
