public class strings {

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static double shortestPath(String path){
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i)=='n'){
                x++;
            } else if (path.charAt(i)=='s') {
                x--;
            } else if (path.charAt(i)=='e') {
                y++;
            } else{
                y--;
            }
        }
        double shortestPath = Math.sqrt( ((x*x) + (y*y)) );
        return shortestPath;
    }

    public static String subString(String str, int strartingIndex, int endingIndex){
        String suString = "";
        for (int i = strartingIndex; i < endingIndex; i++) {
            suString+=str.charAt(i);
        }
        return suString;
    }

    public static String firstLetterToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compression(String str){

        StringBuilder sb = new StringBuilder("");



        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while ( i<str.length()-1        &&      str.charAt(i) == str.charAt(i+1)) {
                i++;
                count++;
            }
            sb.append(str.charAt(i));
            // sb.append(count);
            if(count>1){
                sb.append(count);
            }
        }

        // char match = str.charAt(0);
        // int count = 0;
        
        // for (int i = 0; i < str.length(); i++) {
        //     if (match == str.charAt(i) && i<str.length()-1){
        //         count++;
        //     } else if (i == str.length()-1) {
        //         sb.append(str.charAt(i-1));
        //         sb.append(count+1);
        //     } else{
        //         sb.append(str.charAt(i-1));
        //         sb.append(count);
        //         count=1;
        //         match = str.charAt(i);
        //     }
        // }
        return sb.toString();
    }

    public static int countLowercaseVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

    public static boolean anagrams(String s1, String s2){
        boolean b = true;
        

        return b;
    }

    public static void main(String[] args) {
        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        // String path = "wneenesennn";
        // System.out.println(shortestPath(path));

        // String str = "hello world";
        // System.out.println(subString(str, 2, 5));
        // //Inbuilt function:
        // System.out.println(str.substring(2,5));
    
        // String s1 = "apple";
        // String s2 = "banana";
        // if(s1.compareTo(s2)>0){
        //     System.out.println("s1 is greater than s2.");
        // } else if (s1.compareTo(s2)==0) {
        //     System.out.println("s1 is equal to s2.");
        // } else{
        //     System.out.println("s1 is less than s2.");
        // }

        // String sentence = "Hi, my name is Krishna Purwar. Currently, I'm feeling like a faliure.";
        // System.out.println(firstLetterToUpperCase(sentence));
        
        // String str = "abbcsdsss";
        // System.out.println(compression(str));

        // String vowels = "Find the fucking lower case vowels.";
        // System.out.println(countLowercaseVowels(vowels));

        // String str="ApnaCollege".replace("l","");
        // System.out.println(str);

        String s1 = "race", s2 = "care";
        System.out.println(anagrams(s1, s2));
    }    
}
