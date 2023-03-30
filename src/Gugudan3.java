import java.util.Scanner;

public class Gugudan3 {
    public static int[] calculate(int times) {

        int[] arr2 = new int[9];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = times * (j + 1);
        }
        return arr2;

    }
    public static void print(int[] arr2) {

        for(int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
    public static void main(String[] args){
//        System.out.println("입력하시오");
//        Scanner scanner = new Scanner(System.in);
//        String inputValue = scanner.nextLine();
//        String[] splitedValue = inputValue.split(",");
//        int first = Integer.parseInt(splitedValue[0]);
//        int second = Integer.parseInt(splitedValue[1]);

        System.out.println("구구단 중 출력할 단은?");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

            for(int i=2; i<10; i++) {
                int[] arr = calculate(i);
                print(arr);
            }
        }
    }

