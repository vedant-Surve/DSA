public class Two_D_array {
    public static void main(String[] args) {

        String[] fruits = {
            "Mango", "Chikko", "Orange"
        };

        String[] vegetables = {
            "Capsicum", "Carrot", "Potato", "Onion"
        };

        String[][] groceries = {fruits, vegetables};

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.println(food);
            }
            System.out.println();
        }
    }
}