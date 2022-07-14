public class Array {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4};

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        for (int element: myList) {
            System.out.println(element);
        }
    }
}
