package ch.fhnw.edu.eaf.springioc.provider;

public class HelloWorldProvider implements MessageProvider {


    @Override
    public String getMessage() {
        return "Hello World from HelloWorldProvider";
    }
}
