public class Main {
    public static void main(String[] args){
        Pen a = new Pen();

        a.setColor("blue");
        a.setType("ballpoint");
        System.out.println(a.getColor());
        System.out.println(a.getType());

        a.click();
        System.out.println(a.clicked);

    }
}
