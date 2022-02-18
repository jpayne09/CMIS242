public class practice1 {
    
    public void findAbc(String input){
        int index = input.indexOf("abc");
        while (true){
            if (index == -1 || index >= input.length() - 3){
                break;
            }
            //System.out.println("Print index 1:" + index);
            String found = input.substring(index+1, index+4);
            System.out.println(found);
            index = input.indexOf("abc",index+3);
            //System.out.println("index after updating " + index);
        }
    }
 
       public void test() {
        //String input = "abcabcabcabc";

        findAbc("abcabcabcabca");
    }

    public static void main(String[] args) {
        practice1 run = new practice1();
        run.test();
    }
}
