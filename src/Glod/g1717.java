package Glod;
//유니온 파인드 강의 내용

import java.util.Scanner;

public class g1717 {

    static int parent[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent=new int[N+1];

        for(int i=0; i < N+1; i++){ //초기화 하는 부분
            parent[i] = i;
        }

        for(int i = 0; i < M; i++){ //질의 계산하는 부분
            int question = sc.nextInt();
            int a = parent[question];
            int b = sc.nextInt();

            if(question == 0){ //union
                union(a, b);
            }else{ //find부분
                boolean result = checkSame(a,b);
                if(result){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }

    }

    private static void union(int a, int b) {
        // 대표노드를 찾아서 연결하기
        a = find(a);
        b = find(b);
        if(a!=b){
            parent[b] = a; //다르면 두개를 연결한다.
        }
    }

    private static int find(int a) {
        if(a == parent[a]){ //만약 대표노드의 인덱스와 값이 같으면 대표 노드이므로 그냥 a를 리턴한다.
            return a;
        }else{
            return parent[a] = find(parent[a]); // value를 index로 바꿔서 또 찾아보는거 재귀 함수로 구현한다. 근데 여기서 parent에 경로 압축이 필요하다.
        }
    }

    private static boolean checkSame(int a, int b){
        a = find(a); //바로가ㅓ 아니라 대표노드 찾아서 연결
        b = find(b);
        if(a==b){
            return true;
        }else {
            return false;
        }
    }
}
