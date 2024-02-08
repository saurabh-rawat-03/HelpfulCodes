class java{
    public static void main(String[] args) {
        String name = "shuBHam sHarMA";
        String prc="";
        String s = " ";

        name = name.toLowerCase();

        int len = name.length();

        for(int i=0; i<len; i++){
            // char c = name.charAt(i);
            if(i == 0){
                prc = (prc + name.charAt(i)).toUpperCase();
            }else if((String.valueOf(name.charAt(i))).equals(s)){
                prc = (prc + " " +String.valueOf(name.charAt(i+1))).toUpperCase();
                i++;
            }else{
                prc = prc + name.charAt(i);
            }
        }

        System.out.println(prc);

    }
}           