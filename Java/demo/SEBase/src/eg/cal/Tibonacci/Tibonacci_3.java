/*
 *  ��д�����ڿ���̨���쳲���������ǰ20�ÿ���5��������
 */

package eg.cal.Tibonacci;

public class Tibonacci_3 {
	// ʹ�õݹ鷽��  
    private static int getFibo(int i) {  
        if (i == 1 || i == 2)  
            return 1;  
        else  
            return getFibo(i - 1) + getFibo(i - 2);  
    }  
  
    public static void main(String[] args) {  
        System.out.println("쳲��������е�ǰ20��Ϊ��");  
        for (int j = 1; j <= 20; j++) {  
            System.out.print(getFibo(j) + "\t");  
            if (j % 5 == 0)  
                System.out.println();  
        }  
    }  
}