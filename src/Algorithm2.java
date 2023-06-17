/*
* undercut-ajit

문제정보
시간제한 1000MS | 메모리제한 256MB
*
Under Cut 게임은 두 사람이 1부터 5까지 숫자가 적혀 있는 5장의 카드를 가지고 하는 게임이다. 각라운드마다 이 둘은 다섯 장의 카드 중 한 장의 카드를 동시에 내보여준다.
한 라운드에서 Under Cut 게임에서 점수를 계산하는 방식은 다음과 같다.
1. 두 사람이 낸 카드의 숫자가 서로 같다면 무승부이고 두 사람에게 주어지는 점수는 없다.
2. 두 사람이 낸 카드 숫자의 차가 1 이면 숫자가 작은 카드를 낸 사람이 이긴다. 숫자가 작은 카드를 낸 사람이 두 카드에 적힌 숫자의 합만큼 점수를 얻는다. 단, 두 카드의 숫자가 1과 2인 경우 합은 3 이 되지만, 이 때만은 예외로 1이 적혀 있는 카드를 가진 사람이 6점을 얻는다. 이런 경우를 Under Cut미라고 한다.
3. 두 사람이 낸 카드 숫자의 차가 1보다 큰 경우에는 숫자가 큰 카드를 낸 사람이 이긴다. 숫자가 큰 카드를 낸 사람이 그 큰 숫자만큼 점수를 얻는다.
예를 들어, 5라운드 동안 게임을 하는데 A가 낸 카드의 숫자가 차례로 5, 3, 1, 3, 1이고, B가 낸 카 드의 숫자가 차례로 3, 3, 2, 2, 4라고 하자. 각 라운드의 이긴 사람과 얻는 점수는 다음 표와 같이 된다.
따라서 A가 얻는 점수는 11점이 되고, B가 얻는 점수는 9점이 된다.
A와 B가 Under Cut 게임을 한다. 라운드의 수와 A와 B가 차례로 낸 카드에 적혀 있는 숫자가 주머 질 때 A와 B가 각각 얻는 점수를 구하는 프로그램을 작성하시오.
*
*
* 입력
첫째 줄에는 전체 라운드의 수가 주어진다. 라운드 수는 20이하 의 자연수이다. 둘째 줄에는 A가 낸 카드의 숫자가 낸 순서대로 사이에 하나의 공백을 두고 주어진다. 셋째 줄에는 B가 낸 카드의 숫자가 낸 순서대로 사이에 하나의 공백을 두고 주어진다. A와 B가 낸 카드의 개수는 라운드 수와 같으며 모든 카드의 숫자는 1, 2, 3, 4, 5 중 하나이다.
*
* 출력
첫째 줄에 A가 얻은 점수와 B가 얻은 점수를 사이에 하나의 공백을 두고 출력한다.
*
예시입력
5
5 3 1 3 1
3 3 2 2 4
*
예시출력
11 9
* * */

import java.util.*;
public class Algorithm2 {
    public static void main(String[] args) {
        int n, i, a, b, as=0, bs=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Integer> a_list = new LinkedList<>();
        List<Integer> b_list = new LinkedList<>();
        for(i=0; i<n; i++) {
            a = sc.nextInt();
            a_list.add(a);
        }
        for(i=0; i<n; i++) {
            b = sc.nextInt();
            b_list.add(b);
        }
        for(i=0; i<n; i++) {
            if(a_list.get(i) == b_list.get(i)) {
                continue;
            }
            if(a_list.get(i) > b_list.get(i) && a_list.get(i) - b_list.get(i) == 1 && b_list.get(i) == 1) {
                bs = bs + 6;
            } else if(b_list.get(i) > a_list.get(i) && b_list.get(i) - a_list.get(i) == 1 && a_list.get(i) == 1) {
                as = as + 6;
            } else if(a_list.get(i) > b_list.get(i) && a_list.get(i) - b_list.get(i) == 1 && b_list.get(i) != 1) {
                bs = bs + (a_list.get(i) + b_list.get(i));
            } else if(b_list.get(i) > a_list.get(i) && b_list.get(i) - a_list.get(i) == 1 && a_list.get(i) != 1) {
                as = as + (a_list.get(i) + b_list.get(i));
            } else if(a_list.get(i) > b_list.get(i) && a_list.get(i) != 1) {
                as = as + a_list.get(i);
            } else {
                bs = bs + b_list.get(i);
            }
        }
        System.out.println(as + " " + bs);
    }
}
