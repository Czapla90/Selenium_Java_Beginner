//Stwórz 3 obiekty klasy student.
//Przypisz wartości do pól.
//Stwórz tablicę i dodaj do niej studentów.
//Przejdz przez tablicę i wywołaj wszystkie 4 metody.

public class PracaDomowa4 {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student student1 = new Student();
        student1.imie = "Justin";
        student1.nazwisko = "Jefferson";
        student1.rokUrodzenia = "19/07/1990";
        student1.numerTelefonu = 789568789;
        student1.adresEmail = "justin.jefferson@vikings.com";
        student1.numerIndeksu = 123456789;
        String uczelniaStudenta1 = student1.nazwaUczelni;

        Student student2 = new Student();
        student2.imie = "Kirk";
        student2.nazwisko = "Cousins";
        student2.rokUrodzenia = "15/06/1985";
        student2.numerTelefonu = 865478319;
        student2.adresEmail = "kirk.cousins@vikings.com";
        student2.numerIndeksu = 987654321;
        String uczelniaStudenta2 = student2.nazwaUczelni;

        Student student3 = new Student();
        student3.imie = "Dalvin";
        student3.nazwisko = "Cook";
        student3.rokUrodzenia = "05/05/1993";
        student3.numerTelefonu = 953147894;
        student3.adresEmail = "dalvin.cook@vikings.com";
        student3.numerIndeksu = 987321654;
        String uczelniaStudenta3 = student3.nazwaUczelni;



        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].zalogujSie();
            students[i].podajNrTelefonu();
            students[i].podajNrIndeksu();
            System.out.println("Mam na imię " + students[i].imie + " a moja uczelnia to " + students[i].nazwaUczelni);
        }
    }
}
