public class Gugudan2 {
    public static int[] calculate(int times) {
        //void가 없으므로, 반환받을 데이터타입,이름 지정
        //입력값 int times >> 결과를 출력값 int[] calculate로 반환
        int[] arr2 = new int[9];
        for (int j = 0; j < arr2.length; j++) {
        arr2[j] = times * (j + 1); // times에 2를 넣으면 2단 반환
    }
        return arr2; // 결과값 int[] calculate로 반환

    }
    public static void print(int[] arr2) {
        //화면으로 출력하는 것, 출력 후 실행결과를 return하지 않으므로 입력만 있음
        //배열에 담겨있는 값 출력
        for(int i=0; i<arr2.length; i++) { //배열에 저장된 값을 반복문을 통해 모두출력
            System.out.println(arr2[i]);
        }
    }
    public static void main(String[] args) { //return값(출력값)이 없으므로 입력만 있다.
        int[] arr = new int[9]; //배열의 크기 지정
        for(int i=0; i<arr.length; i++){ //계산결과를 배열에 저장
            arr[i] = 2 * (i + 1);
        }
        for(int i=0; i<arr.length; i++){ //배열에 저장된 값을 반복문을 통해 모두출력
            System.out.println(arr[i]);
        }
        arr = new int[9]; // 기존에 있었던 배열을 사용하고 싶을땐 데이터 타입을 지워야 한다(기존의 값을 덮어씌운다)
        for(int i=0; i<arr.length; i++){
            arr[i] = 3 * (i + 1);
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = calculate(2); //caclulate 메소드를 통해 중복제거

        for(int i=0; i<arr2.length; i++){ //배열에 저장된 값을 반복문을 통해 모두출력
            System.out.println(arr2[i]);
        }
        int[] arr3 = calculate(3); //caclulate 메소드를 통해 중복제거
        print(arr3);

        //int[] arr3이라는 새로운 배열에, calculate메소드에 3로 연산된 것을 넣고
        //print(arr3) arr3배열을 print메소드에 넣어 연산된 것을 출력한다.
        for(int i=2; i<10; i++) {
            int[] all = calculate(i);
            print(all);
        }
        //for문의 i는 중복될 수 있는 것 같고, 변수명도 유효범위에 따라 메소드마다 따로 지정할 수 있는것 같다
        //메소드화 된 것을 반복문에 넣으면서 2단부터 9단까지 한번에 출력할 수 있다.
        //calculate메소드가 연산되어 배열에 2단의 값이 들어가고, print메소드를 통해 배열에 있는 것을 출력한다.
        //그리고 반복문을 통해 다시 3단이 같은 과정을 거친다.

        }


    }

