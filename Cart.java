package aims;

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
	                return false; 
	            }
	            itemsOrdered[quantity] = disc;  
	            quantity++; 
	            System.out.println("The disc has been added to the cart.");
	            return true;  
	        }

	        public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
	            for (int i = 0; i < quantity; i++) {
	                if (itemsOrdered[i] == disc) { 
	                    for (int j = i; j < quantity - 1; j++) {
	                        itemsOrdered[j] = itemsOrdered[j + 1];
	                    }
	                    itemsOrdered[quantity - 1] = null; 
	                    quantity--; 
	                    System.out.println("The disc has been removed from the cart.");
	                    return true; 
	                }
	            }
	            System.out.println("The disc is not in the cart.");
	            return false; 
	        }
	    }

	


