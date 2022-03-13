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

        System.out.println();
///////////////////////////////////////////////////////////////////////////
        Grades grades = new Grades();

        System.out.println(grades.get_lastGrade());
        grades.add(1);
        System.out.println(grades.get_lastGrade());
        System.out.println(grades.get_average());
        grades.add(2);
        System.out.println(grades.get_lastGrade());
        System.out.println(grades.get_lastGrade());
        System.out.println(grades.get_average());

        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(7);
        System.out.println(grades.get_average());
        grades.add(8);
        grades.add(9);
        grades.add(10);
        System.out.println(grades.get_lastGrade());
        grades.add(11);
        System.out.println(grades.get_lastGrade());
        System.out.println(grades.get_average());



        System.out.println();
    }
}
