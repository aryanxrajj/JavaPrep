package LeetCode;

public class Ques1491 {
    public static void main(String[] args) {
        int[] salary = {1000,2000,3000};
        System.out.println(average(salary));
    }

    static double average(int[] salary) {
        for(int i=0;i< salary.length;i++) {
            int last = salary.length - i - 1;
            int findmax = max(salary, last);
            swap(salary, last, findmax);
        }
        int result = 0,count= 0;
        for(int i=1;i<salary.length-1;i++){
            result+=salary[i];
            count++;
        }
        return (double) result/count;

    }

     static void swap(int[] salary, int last, int findmax) {
        int temp = salary[last];
        salary[last] = salary[findmax];
        salary[findmax] = temp;
    }

    static int max(int[] salary, int last) {
        int max = 0;
        for(int i=0;i<=last;i++){
            if(salary[i]>salary[max]){
                max = i;
            }
        }
        return max;
    }
}
