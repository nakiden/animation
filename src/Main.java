public class Main {

    public static void main(String[] args) {
        Animal an = new Animal();

        for (int j = 0; j < 1000*1000; j++) {

            if (j % 2 == 0){
                an.printAnimal(true);
            } else {
                an.printAnimal(false);
            }
            for(int clear = 0; clear < 10; clear++) {
                System.out.println("\b") ;
            }
        }

    }
}
