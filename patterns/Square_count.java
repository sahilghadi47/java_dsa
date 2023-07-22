package patterns;

public class Square_count {
    static void sol(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
