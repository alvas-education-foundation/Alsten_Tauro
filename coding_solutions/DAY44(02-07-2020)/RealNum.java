import java.util.*; 
public class Main{      
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);          
        double[] numbers;           
        int numCt;                   
        double num;               
        numbers = new double[100];            
        numCt = 0;                            
        System. out. println("Enter up to 100 positive numbers; Enter 0 to end");          
        while (true) {              
            num = sc.nextInt();;             
            if (num <= 0)                
            break;             
            numbers[numCt] = num;             
            numCt++;         
            }
          selectionSort(numbers, numCt);           
          System. out. println("\nYour numbers in sorted order are:\n");        
          for (int i = 0; i < numCt; i++)
          {              
              System. out. println( numbers[i] );        
              }      
              }       
              static void selectionSort(double[] A, int count) 
              {          
                  for ( int lastPlace = count - 1; lastPlace > 0; lastPlace-- ) 
                  {           
                      int maxLoc = 0;            
                      for (int j = 1; j <= lastPlace; j++)
                      {               
                          if (A[j] > A[maxLoc]) 
                          {                  
                              maxLoc = j;               
                              }            
                              }             
                double temp = A[maxLoc];             
                A[maxLoc] = A[lastPlace];             
                A[lastPlace] = temp;          
                       }      
              }   
}