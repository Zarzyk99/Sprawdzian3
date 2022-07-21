package pl.kurs.interfaces.przyklad;

public interface TextCommunicator {


    boolean sendTextMessage(String message);

    default boolean sendConfirmation() {
        //some implemetation
        return true;
    }


}
