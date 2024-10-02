public class Avengers {
    //attributes
    String name;
    int power;

    public void Punch() {
        System.out.println("I can do this all day.");
    }


        public static void main(String[] args) {
            Avengers hero1 = new Avengers();
            hero1.name = "Captain America";
            System.out.println(hero1.name);

            hero1.Punch();

    }
}