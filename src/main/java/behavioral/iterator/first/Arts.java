package behavioral.iterator.first;

class Arts implements Subjects {

    private String[] papers;

    public Arts() {
        this.papers = new String[]{"English", "History", "Geography", "Psychology"};
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(this.papers);
    }
}
