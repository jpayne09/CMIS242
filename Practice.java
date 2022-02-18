public class Practice {

    public static int howMany(String stringa, String stringb) {
        int count = 0;
        int currIndex = 0;
        while (currIndex != -1) {
            currIndex = stringb.indexOf(stringa,currIndex);

            if(currIndex != -1){
            count += 1;
            currIndex += 1;
            }
        }
        return count;
        
    }

    public static void testHowMany() {
        String stringa = "GAA";
        String stringb = "ATGAACGAATTGAATC";

        System.out.println(howMany(stringa, stringb));
    }

    public static void main(String[] args) {
        testHowMany();
        
    }
}