import java.util.Scanner;

public class Patterns{
    private static void PyramidWithNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt(); 
        System.out.println("\n \n  ");
        for(int i =1;i<=number;i++){
            for(int j =1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    private static void Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();
        System.out.println("\n \n  ");

        /*
         * logic
        */

        for(int i = 1; i<= row;i++){
            for(int j =1;j<=col;j++){
                System.out.print(" * ");
            
             }
            System.out.println();
        }

    }

    private static void RightAtrangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("\n \n  ");
        /*
         *Logic 
        */
        for(int row =0;row<num;row++){
            for(int col =0; col<=row;col++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void TrangleWithNumber(){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = input.nextInt();
            int k =1;
            System.out.println("\n \n  ");
            for(int i =1;i<=num;i++){
                for(int j =1;j<=i;j++){
                    System.out.print(" "+(k++));
                }
                System.out.println();
            }
    }
     
    private static void BinaryTrangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("\n \n  ");
        for(int i =1;i<=num;i++){
            for(int j =1;j<=i;j++){
                if(j%2==0)
                {
                    System.out.print(" 0 ");
                }
                else{
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }

    }
    private static void HallowRectangle(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter no. of row : ");
        int row = inp.nextInt();
        System.out.print("Enter no. of col :  ");
        int col = inp.nextInt();
        System.out.println("\n \n  ");
        for(int i = 1; i<=row;i++){
            for(int j =1;j<=col;j++){
                if(i==1 || j ==row || j == 1 || i ==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void InvertedHalfTrangleWithNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("\n \n  ");
        for(int i =num;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    private static void InvertHalfTrangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("\n \n  ");
        for(int i=1;i<=num;i++ ){
            for(int j =1;j<=num -i;j++){
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    private static void InvertRightAtrangle(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = inp.nextInt();
        System.out.println("\n \n  ");
        for(int i =num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        } 

    }

    private static void InvertTrangNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("\n \n  ");
        int k=1;
        for(int i =num;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(" "+(k++)+" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){


        while(true){
            System.out.println("Press 1 for   (Rectangle)");
            System.out.println("Press 2 for   (RightAtrangle)");
            System.out.println("Press 3 for   (TrangleWithNumber)");
            System.out.println("Press 4 for   (BinaryTrangle)");
            System.out.println("Press 5 for   (HallowRectangle)");
            System.out.println("Press 6 for   (InvertedHalfTrangleWithNumber)");
            System.out.println("Press 7 for   (InvertHalfTrangle)");
            System.out.println("Press 8 for   (InvertRightAtrangle)");
            System.out.println("Press 9 for   (InvertTrangNumber)");
            System.out.println("Press 10 for  (PyramidWithNum)");
            System.out.println("Press 11 to exit the Program");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("----------------------------------------------------------");
            System.out.println("----------------------------------------------------------");
            System.out.println();
            System.out.print("Enter your Choice : ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if(input ==1){
                Rectangle(); 
            }
            if(input ==2){
                RightAtrangle(); 
            }
            if(input ==3){
                TrangleWithNumber(); 
            }
            if(input ==4){
                BinaryTrangle(); 
            }
            if(input ==5){
                HallowRectangle(); 
            }
            if(input ==6){
                InvertedHalfTrangleWithNumber(); 
            }
            if(input ==7){
                InvertHalfTrangle(); 
            }
            if(input ==8){
                InvertRightAtrangle(); 
            }
            if(input ==9){
                InvertTrangNumber(); 
            }
            if(input ==10){
                PyramidWithNum(); 
            }
            if(input ==11){
                break; 
            }   
            System.out.println("\n \n  ");
   
        }

        }  
}