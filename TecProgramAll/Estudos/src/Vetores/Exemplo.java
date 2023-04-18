package Vetores;

public class Exemplo {
    public static void main(String[] args){
        final int tam = 30;
        int nums[] = new int [tam];

        for (int i = 0; i < nums.length; i++){
            nums[i] = i + 10;
            if (nums[i]%2 == 0){
                switch (nums[i]){
                    case 20:
                        System.out.println("Vinte");
                        break;
                    case 30:
                        System.out.println("Trinta");
                        break;
                    default:
                        System.out.println(nums[i] + " ");
                        break;
                }
            }
        }
    }
}
