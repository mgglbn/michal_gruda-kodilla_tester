public class FirstClass {
    public static void main(String [] args)
    {
        Notebook notebook = new Notebook("600g", 1000, 2022);
        Notebook heavyNotebook = new Notebook("2000g", 1500, 2000);
        Notebook oldNotebook = new Notebook("1600g", 500, 1990);

        notebookDataDisplay(notebook);
        notebookDataDisplay(heavyNotebook);
        notebookDataDisplay(oldNotebook);
///////////////////////////////////////////////////////////////////////////
        Grades grades = new Grades();

        System.out.println(grades.getLastGrade());
        grades.add(1);
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getAverage());
        grades.add(2);
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getAverage());

        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(7);
        System.out.println(grades.getAverage());
        grades.add(8);
        grades.add(9);
        grades.add(10);
        System.out.println(grades.getLastGrade());
        grades.add(11);
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getAverage());
    }

    private static void notebookDataDisplay(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        System.out.println();
    }
}
