package pl.kurs.interfaces.przyklad;

public class Messenger implements TextCommunicator{

    @Override
    public boolean sendTextMessage(String message) {
        //jakaś tam logika wysyłająca wiadomość
        return true;
    }


}
