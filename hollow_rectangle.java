public class hollow_rectangle {
    public static void hollow(int totalrow, int totalcols){
 
     // outer loop
 
     for(int i=1; i<=totalrow; i++){
         // inner loop
         for(int j=1; j<=totalcols; j++){
             // cell (i , j)
             if(i==1 || i == totalrow || j == 1 || j == totalcols )
                 // boudary cells
                 System.out.print("*");
             
             else
                 System.out.print(" ");
             }
             System.out.println();
         }
     }
    
     public static void main(String[] args) {
        int totalrow=6,totalcols=20;
         hollow(totalrow, totalcols);
     }
    } 
 