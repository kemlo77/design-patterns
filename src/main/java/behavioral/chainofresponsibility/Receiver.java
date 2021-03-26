package behavioral.chainofresponsibility;

public interface Receiver {
    boolean handleMessage(Message message);
    void nextErrorHandler(Receiver nextReciever);
}
