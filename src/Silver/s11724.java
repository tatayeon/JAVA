package Silver;

// DFS 중요한 문제!!!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class s11724 {

    static boolean visioted[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visioted = new boolean[n+1];
        A = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); // 둘다 연결이 되어있기 때문에 이렇게 양쪽 방향을 다 더해야한다.
            A[e].add(s);
        }
        int count = 0;
        for(int i = 1; i < n+1; i++){
            if(!visioted[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }

    private static void DFS(int v) {
        if(visioted[v]){
            return;
        }
        visioted[v] = true;
        for(int i : A[v]){
            if(!visioted[i]){
                DFS(i);
            }
        }
    }

}
