public class for_loop {
    public static void main(String[] args) {
        String name = "mrunal";
        int len = 8;
        int pos;
        for (int num = 2; num < 4; num++) {
            for(int times = 1;times<=10;times++) {
                if(times == 5){
                    continue;
                }
                System.out.println(num + "*" + times + ":\t"+ num*times);
            }
        }

        System.out.println("Array is: ");
        int arr[] = {5,7,90};
        for(int element : arr) {
            System.out.println(element);
        }
    }
}
