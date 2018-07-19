package hello;

public class Greeting {

    //private final long id;
    private final String greeting;

    Greeting(String greeting) {
        //this.id = id;
        this.greeting = greeting;
    }

    //public long getId() {
    //    return id;
    //}

    public String getContent() {
        return greeting;
    }
}