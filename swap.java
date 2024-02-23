public class swap {
    public static void main(String[] args) {
        int num = 1234;

        int temp = num;
        int d=0;
        while(temp != 0){
            temp = temp / 10;
            d++;
        }

        int ls = num / (int) Math.pow(10, d-1);
        // System.out.println(ls);
        int rs = num % 10;
        // System.out.println(rs);
        int rem = (num % (int) Math.pow(10, d-1)) / 10;
        // System.out.println("mid: "+rem);
        int ans = (((rs * (int) Math.pow(10, d-2) + rem)) * 10 ) + ls;
        System.out.println(ans);
        
    }
    
}
