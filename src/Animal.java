
public class Animal {

    private Head head;
    private Body body;
    private Foots foots;


    public void printAnimal(boolean value){
        this.head = new Head();
        this.body = new Body();
        this.foots = new Foots(value);
    }

}


