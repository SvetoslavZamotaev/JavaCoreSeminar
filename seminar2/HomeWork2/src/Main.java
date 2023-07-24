import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        first task counting sort --
         */
        int[] task1 = createArray(10,100);
        printArray(sorted(task1));

        /*
        second task cezarcoding
         */
        String encoding = cezarCoding("abc",1, true);
        String decoding = cezarCoding(encoding,1,false);
        System.out.println();
        System.out.println(encoding + " " + decoding);
        /*
        task 3
         */
        int[] task3 = {1,2,3,4,5};
        printArray(neworder(task3,1));
    }

    public static int[] createArray(int bound , int len){
        Random rand = new Random();
        int[] result = new int[len];
        for (int i = 0; i < result.length ; i++) {
            result[i] = rand.nextInt(bound);
        }
        return  result;
    }

    public static int[] sorted(int[] array ){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        int[] counter = new int [max+1];
        int[] result = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            counter[array[i]] = counter[array[i]] + 1;
        }
        int mainIndex = 0;
        for (int i = 0; i < counter.length ; i++) {
            for (int j = 0; j < counter[i] ; j++) {
                result[mainIndex] = i;
                mainIndex++;
            }
        }
        return result;
    }

    public static String cezarCoding(String word , int codePhase , boolean encoding){
        char[] arrWord;
        arrWord = word.toCharArray();
        int mode = 1;
        if(!encoding){
            mode = -1;
        }
        for (int i = 0; i <arrWord.length; i++) {
            int res = (int)arrWord[i] + (codePhase * mode);
            arrWord[i] = (char)res;
        }
        String result = new String(arrWord);
        return result;
    }



    public static int[] neworder(int[] array , int step){
        int[] res = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            res[i+step] = array[i];
            if(i+step==array.length-1){
                for (int j = 0; j < step; j++) {
                    i++;
                    res[j] = array[i];
                }
                break;
            }
        }
        return res;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}