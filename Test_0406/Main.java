package Test_0406;

/*
ĩβ0�ĸ���
��Ŀ����
����һ��������n,��n!(���׳�)ĩβ�ж��ٸ�0�� ����: n = 10; n! = 3628800,���Դ�Ϊ2
��������:
����Ϊһ�У�n(1 �� n �� 1000)
�������:
���һ������,����Ŀ����
ʾ��1
����
10
���
2
 */
/*import java.util.*;
public class Main{
    public static void main(String[] args){
       System.out.println(solution());
    }
    public static int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i=5; i<=n; i+=5){
            int t = i;
            while(t%5 == 0){
               res++;
                t/=5;
            }
        }
        return res;
    }
}*/

/*
 * ��Ŀ����
ͷ����2017У�п�ʼ�ˣ�Ϊ�����У�У�������֯��һ����ģ���ĳ����Ŷӣ�ÿ�������˶�����һЩ��Ȥ����Ŀ��
���������������Щ��Ŀ��ϳ����ɳ����Գ�������ѡ��֮ǰ�����Ƕ���Ŀ������ä�󣬲�������ÿ������Ѷ�ϵͳ��
һ�����԰���3����������Ŀ���������ǵ��Ѷȴ�С����ֱ�Ϊa,b,c������ϣ����3��������������������
a<=b<=c
b-a<=10
c-b<=10
���г�����һ������n����������Ŀ���������������n����ֲ������ɳ������У�1����ೡ��ÿ���ⶼ����ʹ����ֻ����һ�Σ���
Ȼ�������������������ƣ�������һЩ����û���չ�3���⣬��˳����˾���Ҫ���һЩ�ʵ��Ѷȵ���Ŀ����ÿ�����Զ��ﵽҪ��
Ȼ�����ǳ����Ѿ����ú����ˣ����ܼ�����������ٻ���Ҫ�ٳ���������
��������:
����ĵ�һ�а���һ������n����ʾĿǰ�Ѿ����õ���Ŀ������
�ڶ��и���ÿ����Ŀ���Ѷ�ϵ��d1,d2,...,dn�� 
���ݷ�Χ
����30%�����ݣ�1 �� n,di �� 5;
����100%�����ݣ�1 �� n �� 10^5,1 �� di �� 100��
�������У�һ�ֿ��еķ��������2���Ѷȷֱ�Ϊ20��50����Ŀ������������ϳ��������ԣ���20 20 23���ͣ�35,40,50����
�������:
���ֻ����һ�У�������Ĵ𰸡�
ʾ��1
����
4  
20 35 23 40
���
2
 */

import java.util.*;
public class Main{
    public static void main(String[] args){
       System.out.println(solution());
    }
    public static int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<n; i+=3){
            if(i+1 < n){
                int c1 = nums[i+1]-nums[i];
                if(c1 > 10 && c1 <=20){
                    count++;
                    i--;
                }else if(c1 > 20){
                    count += 2;
                    i-=2;
                }else{
                    if(i+2 < n){
                        int c2 = nums[i+2]-nums[i+1];
                        if(c2 > 10){
                            count++;
                            i--;
                        }
                    }else{
                        count++;
                    }
                }
            }else{
                count+=2;
            }
        }
        return count;
    }
}