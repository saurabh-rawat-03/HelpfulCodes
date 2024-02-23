public class printCountRes {

    public static void main(String[] args) {
        print(10);
    }

    static void print(int count){
        if(count == 0){
            return;
        }

        print(count -1);
        System.out.println(count);
    }
    
}
