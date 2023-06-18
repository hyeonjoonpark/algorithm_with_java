/*
* 순위매기기
문제정보
시간제한 1000MS | 메모리제한 256MB

* 설명
요소의 개수가 n 개인 1차원 배열에 임의의 값을 설정한 후 해당 배열에서 각 값에 대한 순위를 보며 주는 프로그램을 작성해 보세요.
단, 동점일 경우엔 공동 등수를 하고 다음 등수를 넘긴다
ex) 7등이 3명이면 그다음 등수는 10등이다

*입력
첫째 줄에는 값의 개수인 n이 적혀있다. (1≦n≤ 3000)
둘째 줄부터는 n개의 값이 연속으로 적혀있다.

* 출력
입력된 배열의 값을 출력하고, 그 밑줄엔 순위를 출력한다.

예시입력 1
10
23 45 12 34 65 23 89 61 26 11
*
예시출력
23 45 12 34 65 23 89 61 26 11
 3  7  2  6  9  3 10  8  5  1
*/


import java.util.*;

public class Algorithm3 {
    public static void main(String[] args) {
        int n, input, i, j, cnt = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        List<Integer> s_list = new LinkedList<>();
        for(i=0; i<n; i++) {
            input = sc.nextInt();
            list.add(input);
        }

        for(i=0; i<n; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n");

        for(i=0; i<n; i++) {
            for(j=0; j<n; j++) {
                if(list.get(i) > list.get(j)) {
                    cnt++;
                }
                s_list.add(i, cnt+1);
            }
            cnt = 0;
        }

        for(i=0; i<n; i++) {
            System.out.print(s_list.get(i));
            System.out.print(" ");
        }
    }
}
