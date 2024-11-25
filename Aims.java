package aims;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 17.50f);
		anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 24.99f);
		anOrder.addDigitalVideoDisc(dvd3);

		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 22.50f);
		anOrder.addDigitalVideoDisc(dvd4);

		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 19.99f);
		anOrder.addDigitalVideoDisc(dvd5);

		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 25.00f);
		anOrder.addDigitalVideoDisc(dvd6);

		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Matrix", "Science Fiction", "The Wachowskis", 136, 18.99f);
		anOrder.addDigitalVideoDisc(dvd7);

		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 16.95f);
		anOrder.addDigitalVideoDisc(dvd8);

		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Gladiator", "Action", "Ridley Scott", 155, 20.00f);
		anOrder.addDigitalVideoDisc(dvd9);

		DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 21.50f);
		anOrder.addDigitalVideoDisc(dvd10);

		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Fight Club", "Drama", "David Fincher", 139, 19.95f);
		anOrder.addDigitalVideoDisc(dvd11);

		DigitalVideoDisc dvd12 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 18.50f);
		anOrder.addDigitalVideoDisc(dvd12);

		DigitalVideoDisc dvd13 = new DigitalVideoDisc("Jurassic Park", "Science Fiction", "Steven Spielberg", 127, 17.00f);
		anOrder.addDigitalVideoDisc(dvd13);

		DigitalVideoDisc dvd14 = new DigitalVideoDisc("Schindler's List", "History", "Steven Spielberg", 195, 23.99f);
		anOrder.addDigitalVideoDisc(dvd14);

		DigitalVideoDisc dvd15 = new DigitalVideoDisc("The Silence of the Lambs", "Thriller", "Jonathan Demme", 118, 18.75f);
		anOrder.addDigitalVideoDisc(dvd15);

		DigitalVideoDisc dvd16 = new DigitalVideoDisc("Saving Private Ryan", "War", "Steven Spielberg", 169, 22.99f);
		anOrder.addDigitalVideoDisc(dvd16);

		DigitalVideoDisc dvd17 = new DigitalVideoDisc("Braveheart", "War", "Mel Gibson", 178, 19.50f);
		anOrder.addDigitalVideoDisc(dvd17);

		DigitalVideoDisc dvd18 = new DigitalVideoDisc("Goodfellas", "Crime", "Martin Scorsese", 146, 21.00f);
		anOrder.addDigitalVideoDisc(dvd18);

		DigitalVideoDisc dvd19 = new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 15.95f);
		anOrder.addDigitalVideoDisc(dvd19);

		DigitalVideoDisc dvd20 = new DigitalVideoDisc("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", "Peter Jackson", 178, 26.50f);
		anOrder.removeDigitalVideoDisc(dvd20);

		DigitalVideoDisc dvd21 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 20.00f);
		anOrder.removeDigitalVideoDisc(dvd21);

		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}
}
