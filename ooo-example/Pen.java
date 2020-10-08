public class Pen {
    String type;
    String color;

    public static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unClick() {
        clicked = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
