public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Goldador myPet = new Goldador();

        myPet.play();
        System.out.println("Age: "+myPet.age);
        System.out.println("Personality: "+myPet.personality);
    }
}