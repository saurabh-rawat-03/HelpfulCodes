public class validParant{
    public static void main(String[] args) {
        boolean ans = false;
        String s = "[])";
        int len = s.length();

        String[] stack = new String[len];
        int stInd=0;
        stack[0] = "0";
        int lVal=0;
        int x=0;
        int gt=0;

        if(len > 1){

            for(int i=0; i<len; i++){
                if((String.valueOf(s.charAt(i))).equals("(")){
                    stack[stInd] = ")";
                    // System.out.println("Chala?");
                    stInd++;
                    gt++;
                    x++;
                }else if((String.valueOf(s.charAt(i))).equals("{")){
                    stack[stInd] = "}";
                    // System.out.println(stack[lVal]);

                    stInd++;
                    gt++;
                    x++;
                }else if((String.valueOf(s.charAt(i))).equals("[")){
                    stack[stInd] = "]";
                    // System.out.println(stack[lVal]);

                    stInd++;
                    gt++;
                    x++;
                }else if((String.valueOf(s.charAt(i))).equals(")")){
                        if((stack[lVal]).equals(")")){
                            // System.out.println(stack[lVal]);
                    
                            stInd--;
                            gt++;
                        }else{
                            System.out.println("IDHAR");
                            ans = false;
                            break;
                        }
                }else if((String.valueOf(s.charAt(i))).equals("}")){
                        if(stack[lVal].equals("}")){
                            // System.out.println(stack[lVal]);

                            stInd--;
                            gt++;
                        }else{
                            ans = false;
                            break;
                         }
                }else {
                    if((String.valueOf(s.charAt(i))).equals("]") && stack[lVal].equals("]")){
                        // System.out.println(stack[lVal]);

                        stInd--;
                        gt++;
                    }else{
                        ans = false;
                        break;

                    }
                }
                if(stInd < 0){
                    ans = false;
                    break;
                }

                if(stInd == 0){
                    lVal = stInd;
                }else{
                    lVal = stInd -1;
                }


                // System.out.println(stack[i]);
            }
        }else{
            ans = false;
        }


        if((x > 0 && stInd == 0) && (gt == len)){
            ans = true;
        }else{
            ans = false;
        } 
          

        System.out.println(ans);
    }
}

