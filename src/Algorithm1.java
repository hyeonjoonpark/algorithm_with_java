/*
* 숫자쌍의 개수 구하기
* 문제정보
`시간제한 1000MS | 메모리제한 256MB`

* 설명

양의 정수 n과 m이 주어질 때, 다음 조건을 만족하는 숫자 쌍 (a, b)의 개수를 구하여라.
조건 1. 0<a<b<n
조건 2. ( a**2 + b**2 + m) % (ab) = 0
*
* 입력
첫째줄에는 1이상 100이하의 두 숫자 n과 m이 주어 진다.
*
* 출력
위의 조건에 만족하는 순서쌍 (a, b)의 개수를 출력한다.
* 
입력 테스트케이스
20 3

출력 테스트케이스
4
* */


import java.util.*;
public class Algorithm1 {
    public static void main(String[] args) {
        int n, m, i, j, cnt=0;
        Scanner sc = new Scanner(System.in); // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        for(i=1; i<n; i++) { // a
            for(j=1; j<n; j++) { // b
                int result1 = (int) Math.pow(i, 2);
                int result2 = (int) Math.pow(j, 2);
                if(j>i && ((result1 + result2 + m) % (i*j) == 0)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}