package exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        System.out.println(Maior(a,b,c) + " eh o maior");
        System.out.println(Menor(a,b,c) + " eh o menor");
        System.out.println(maiorOUmenor("menor",a,b,c) + " eh o menor");
        tec.close();
        
    }
    public static Integer Menor(int... nums){
        int ret=nums[0];

        for(int i=0; i<nums.length;i++){
            if(ret > nums[i]) {
                ret=nums[i];
            }
        }
        return ret;
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
    public static Integer maiorOUmenor(String str, int... nums){
        int ret=nums[0];

        if(str.equalsIgnoreCase("maior")) {
            ret=Maior(nums);
        } else if (str.equalsIgnoreCase("Menor")) {
            ret=Menor(nums);
        }

        return ret;
    }
}
