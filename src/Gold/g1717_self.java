package Gold;

import java.util.Scanner;

public class g1717_self {

    public static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent = new int[N+1];
        for(int i = 0; i <= N; i++) {
            parent[i] = i;
        }
        for(int i = 0; i < M; i++) {
            int q = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(q == 0){
                union(a, b);
            }else{
                if(checkSum(a, b)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a!=b){
            parent[b] = a;
        }
    }

    private static int find(int a) {
        if(a == parent[a]) return a;
        else return parent[a] = find(parent[a]);
    }
    private static boolean checkSum(int a, int b) {
        a = find(a);
        b = find(b);
        if(a==b) return true;
        else return false;
    }

}
