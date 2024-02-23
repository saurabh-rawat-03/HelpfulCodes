public class bitWise {

    public static void main(String[] args) {
        int left = 5, right = 7; 
        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
            System.out.println(left);
            System.out.println(right);
        }
        System.out.println("l" + left);
        System.out.println(cnt);
        System.out.println(left << cnt);
        // while(left != right){
        //     left = left & (left + 1);
        //     left++;
        // }

        // System.out.println(left);  
    }
    
}
