public class linearSearch {

    public static int doLinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = doLinearSearch(numbers, key);

        if(index!=-1){
            System.out.println("Key is found at " + index + "th index.");
        } else{
            System.out.println("Key is nout found.");
        }
        
    }
}
