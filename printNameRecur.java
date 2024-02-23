public class printNameRecur {

    public static void main(String[] args) {
        print("saurabh", 10);
        System.out.println("Hi");
    }

    public static void print(String name, int count){
        if(count == 0){
            System.out.println(count);
            return;
        }

        System.out.println((name));
        print(name, count-1);
    }
    
}
