public class FirstClass {
    public static void main(String [] args)
    {
        Notebook notebook = new Notebook("600g", 1000, 2022);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        System.out.println();

        Notebook heavyNotebook = new Notebook("2000g", 1500, 2000);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        System.out.println();

        Notebook oldNotebook = new Notebook("1600g", 500, 1990);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
    }
}
