public class lenNumRecu {

    public static void main(String[] args) {
        System.out.println(len(12345));
    }

    static int len(int num){

        int i=0;
        if(num == 0){
            return 0;
        }
        i++;
        return len(num / 10) + i;
    }
    
}
