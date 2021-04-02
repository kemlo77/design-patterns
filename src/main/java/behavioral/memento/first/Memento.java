package behavioral.memento.first;

class Memento {

    private int stateId;

    public Memento(int stateId) {
        this.stateId = stateId;
    }

    public int getStateId() {
        return stateId;
    }
}
