package ch.fhnw.edu.eaf.springioc.provider;

public class WillkommenProvider implements MessageProvider {


    @Override
    public String getMessage() {
        return "Willkommen aus dem WillkommenProvider";
    }
}
