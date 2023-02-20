public class ReadOnly {

    //Getter - metody służące do pobierania wartości z pól prywatnych
    //Setter - metody umożliwiające ustawienie wartości pola prywatnego

    private String name = "Mateusz";

/*    public String getName() {
        return name + "jest ok";
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
