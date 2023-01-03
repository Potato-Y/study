import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); // 숫자 입력받기
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (i < 100) {
                // 100 이하의 경우 무조건 한수로 카운터 추가
                count++;
            } else {
                // 현재 수가 한수인지 확인하기 위해 쪼개서 저장
                String[] num_split = Integer.toString(i).split("");

                // 자리별로 차이가 동일한지 확인
                if ((Integer.parseInt(num_split[1])
                        - Integer.parseInt(num_split[0])) == (Integer.parseInt(num_split[2])
                                - Integer.parseInt(num_split[1]))) {
                    count++; // 동일한 경우 카운터를 추가
                }
            }
        }

        System.out.println(count);
    }
}