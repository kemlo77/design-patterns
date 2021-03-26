package behavioral.chainofresponsibility;

class IssueRaiser {
    private Receiver setFirstReceiver;

    public void setFirstErrorHandler(Receiver firstErrorHandler) {
        this.setFirstReceiver = firstErrorHandler;
    }

    public Receiver getSetFirstReceiver() {
        return setFirstReceiver;
    }

    public void setSetFirstReceiver(Receiver setFirstReceiver) {
        this.setFirstReceiver = setFirstReceiver;
    }

    public void raiseMessage(Message messge) {
        if (setFirstReceiver != null) {
            setFirstReceiver.handleMessage(messge);
        }
    }
}
