package behavioral.chainofresponsibility;

public class EmailErrorHandler implements Receiver {
    private Receiver nextReceiver;

    @Override
    public void nextErrorHandler(Receiver nextReciever) {
        this.nextReceiver = nextReciever;
    }

    @Override
    public boolean handleMessage(Message message) {
        if (message.getText().contains("Email")) {
            System.out.println("EmailErrorHandler handled message - " + message);
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.handleMessage(message);
            }
        }
        return false;
    }
}
