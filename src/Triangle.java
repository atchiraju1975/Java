import java.util.*;

public class Triangle {

    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);

        System.out.printf("Enter an Integer to print a triangle");
        int noOfLines = s1.nextInt();

        for (int i = 1; i<=noOfLines; i += 2){

                for (int m=0;m<((noOfLines-i)/2);m++){

                    System.out.print(' ');
                }

                for(int j=0;j<i;j++){

                    System.out.print('*');
                }
                System.out.println();

        }


    }
}
