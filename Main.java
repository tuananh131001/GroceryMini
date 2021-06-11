import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocerylist = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter the choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    grocerylist.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
  }
    public static void printInstruction(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options ");
        System.out.println("\t 1 - To print the list of grocery items ");
        System.out.println("\t 2 - Add item ");
        System.out.println("\t 3 - Modify item ");
        System.out.println("\t 4 - To remove item from the list ");
        System.out.println("\t 5 - To search for an item in the list ");
        System.out.println("\t 6 - To quit the application ");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        grocerylist.addGroceryItem(scanner.nextLine());

    }
    public static void modifyItem(){
        System.out.println("Enter the item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the replacement item: ");
        String newItem = scanner.nextLine();
        grocerylist.modifyGroceryItem(itemNo - 1, newItem);

    }
    public static void removeItem(){
        System.out.println("Enter the item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        grocerylist.removeGroceryItem(itemNo-1);
    }
    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (grocerylist.findItem(searchItem) != null){
            System.out.println("Found "  +searchItem + "in grocery list");
        } else {
            System.out.println(searchItem + " is not  in the shopping list");
        }
    }    
  }