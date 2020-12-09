package uri;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        System.out.println(Maior(a,b,c) + " eh o maior");

        tec.close();
        
    }

    public static Integer Maior(int... nums){
        int maior=nums[0];

        for(int i=0; i<nums.length;i++){
            if(nums[i]>maior) {
                maior=nums[i];
            }
        }
        return maior;
    }

}
