import java.util.Scanner;

class Patterns{
    
    private static void PyramidWithNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt(); 
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
        int k=1;
        for(int i =num;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(" "+(k++)+" ");
            }
            System.out.println();
        }

    }


    public static void main(String args[]){
        System.out.println("Press 1 to  (Rectangle)");
        System.out.println("Press 2 to  (RightAtrangle)");
        System.out.println("Press 3 to Right  (TrangleWithNumber)");
        System.out.println("Press 4 to Right  (BinaryTrangle)");
        System.out.println("Press 5 to Right  (HallowRectangle)");
        System.out.println("Press 6 to Right  (InvertedHalfTrangleWithNumber)");
        System.out.println("Press 7 to Right  (InvertHalfTrangle)");
        System.out.println("Press 8 to Right  (InvertRightAtrangle)");
        System.out.println("Press 9 to Right  (InvertTrangNumber)");
        System.out.println("Press 10 to Right (PyramidWithNum)");
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
        switch(input){
            case 1:Rectangle();
            break; 
            case 2:RightAtrangle();
            break;
            case 3:TrangleWithNumber();
            break;
            case 4:BinaryTrangle();
            break;
            case 5:HallowRectangle();
            break;
            case 6:InvertedHalfTrangleWithNumber();
            break;
            case 7:InvertHalfTrangle();
            break;
            case 8:InvertRightAtrangle();
            break;
            case 9:InvertTrangNumber();
            break;
            case 10:PyramidWithNum();
            break;
            case 11:
            break;
        }    
    }

}
