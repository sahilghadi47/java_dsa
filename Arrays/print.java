package Arrays;
public class print{

    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        printArray(arr);
    }
}
