package aims;


public class Store {
    public static final int MAX_NUMBERS_IN_STORE = 50; // Maximum DVDs in the store
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int quantity = 0; // Tracks the current number of DVDs in the store

    // Method to add a DVD to the store
    public boolean addDVD(DigitalVideoDisc dvd) {
        if (quantity >= MAX_NUMBERS_IN_STORE) {
            System.out.println("The store is full. Cannot add more DVDs.");
            return false;
        }
        itemsInStore[quantity] = dvd;
        quantity++;
        System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        return true;
    }

    // Method to remove a DVD from the store
    public boolean removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < quantity; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < quantity - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[quantity - 1] = null;
                quantity--;
                System.out.println("DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                return true;
            }
        }
        System.out.println("DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        return false;
    }

   
}
