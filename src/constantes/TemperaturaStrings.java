package constantes;

public enum TemperaturaStrings {
    C1("convercion de"),C2(" °C  a  "),C3(" °F"),C4("Ingrece temperatura en Centigrados a convertir en farenhei");

    private String recivir;
    TemperaturaStrings(String s) {
        this.recivir=s;
    }

    public String getRecivir() {
        return recivir;
    }
}
