package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = 
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public double totalCost() {
        double total = 0.0;  
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {  
                total += disc.getCost();  
            }
        }
        return total;  
    }

    private int quantity = 0;

    public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (quantity >= MAX_NUMBERS_ORDERED) {  
            System.out.println("The cart is already full. Cannot add more items.");
            return false; 	            }
        itemsOrdered[quantity] = disc; 
        quantity++;  
        return true; 
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (quantity >= MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is full. Remaining discs cannot be added.");
                break;
            }
            itemsOrdered[quantity] = dvd;
            quantity++;
            System.out.println("The disc \"" + dvd.getTitle() + "\" has been added to the cart.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            if (quantity >= MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is full. Remaining discs cannot be added.");
                break;
            }
            itemsOrdered[quantity] = dvd;
            quantity++;
            System.out.println("The disc \"" + dvd.getTitle() + "\" has been added to the cart.");
        }
    }
    
    
    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < quantity; i++) {
            if (itemsOrdered[i] == disc) {  
                for (int j = i; j < quantity - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[quantity - 1] = null;  
                quantity--;  
                return true; 
            }
        }
        return false;  
    }
  

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        double totalCost = 0.0;

        for (int i = 0; i < quantity; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                    i + 1,
                    disc.getTitle(),
                    disc.getCategory(),
                    disc.getDirector(),
                    disc.getLength(),
                    disc.getCost());
            totalCost += disc.getCost();
        }

        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }

public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < quantity; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("DVD Found:");
                System.out.printf("ID: %d, Title: %s, Category: %s, Director: %s, Length: %d, Cost: %.2f $\n",
                        itemsOrdered[i].getId(),
                        itemsOrdered[i].getTitle(),
                        itemsOrdered[i].getCategory(),
                        itemsOrdered[i].getDirector(),
                        itemsOrdered[i].getLength(),
                        itemsOrdered[i].getCost());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD with ID " + id + " found in the cart.");
        }
    }

    // Search for DVDs by Title
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < quantity; i++) {
            if (itemsOrdered[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("DVD Found:");
                System.out.printf("ID: %d, Title: %s, Category: %s, Director: %s, Length: %d, Cost: %.2f $\n",
                        itemsOrdered[i].getId(),
                        itemsOrdered[i].getTitle(),
                        itemsOrdered[i].getCategory(),
                        itemsOrdered[i].getDirector(),
                        itemsOrdered[i].getLength(),
                        itemsOrdered[i].getCost());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD with title \"" + title + "\" found in the cart.");
        }
    }
}
