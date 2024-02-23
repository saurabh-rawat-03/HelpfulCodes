public class practice1 {
    public static void main(String[] args) {

        int a=20000;
        int b=81;
        int c=21000000;
        int d=2000;
        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    System.out.println("A is the greatest");
                }
                else{
                    System.out.println("d is the greatest");
                }
            }
            else{
                if(c>d){
                    System.out.println("c is the greatest");
                }
                else{
                    System.out.println("d is the greatest");
                }
                
            }
           
        }
        else{
            if(b>c)
            {
                if(b>d)
                {
                    System.out.println("b is the greatest");
                }
                else{
                    System.out.println("d is the greatest");
                }
            }
            else{
                if(c>d)
                {
                    System.out.println("c is the greatest");
                }
                else{
                    System.out.println("d is the greatest");
                }

          
            }
        }
        
        
    }
    
}