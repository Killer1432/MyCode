public class FruitBasket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scr = new Scanner(System.in);
        Stack<String> baskets = new Stack<>();

        String A = "apple";
        String O = "orange";
        String M = "mango";
        String G = "guava";

        System.out.println("Catch and eat any of these fruits: ('apple', 'orange', 'mango', 'guava')");
        System.out.print("How many fruits would you like to catch?: ");
        int catcher = scr.nextInt();
        scr.nextLine(); // Consume the newline character

        for (int x = 1; x <= catcher; x++) {
            System.out.println("Fruit " + x + " of " + catcher + ":");
            char fruit = scr.next().charAt(0);

            switch (Character.toLowerCase(fruit)) {
                case 'a':
                    baskets.push(A);
                    break;
                case 'o':
                    baskets.push(O);
                    break;
                case 'm':
                    baskets.push(M);
                    break;
                case 'g':
                    baskets.push(G);
                    break;
                default:
                    System.out.println("Invalid fruit, try again.");
                    x--; // Decrement x to repeat the iteration
                    continue; // Skip to the next iteration
            }
            System.out.println("Your basket now has : " + baskets);
        }

        // Eating fruits
        while (!baskets.isEmpty()) {
            System.out.print("Press 'E' to eat a fruit ");
            String action = scr.nextLine();

            if (action.equalsIgnoreCase("E")) {
                String eatenFruit = baskets.pop();
                System.out.println("You are Eat a " + eatenFruit + "!");
                System.out.println("Fruits in the Basket: " + baskets);
            } else {
                System.out.println("or you don't want to eat");
            }
        }

        System.out.println("No more fruits.");
    }
}
