package behavioral.chainofresponsibility;

public class FaxErrorHandler implements Receiver {
    private Receiver nextReceiver;

    @Override
    public void nextErrorHandler(Receiver nextReciever) {
        this.nextReceiver = nextReciever;
    }

    @Override
    public boolean handleMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println("FaxErrorHandler handled message - " + message);
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.handleMessage(message);
            }
        }
        return false;
    }
}
