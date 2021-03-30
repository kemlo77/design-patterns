package behavioral.iterator.first;

public class ArtsIterator implements Iterator {

    private String[] papers;
    private int position;

    public ArtsIterator(String[] papers) {
        this.papers = papers;
        this.position = 0;
    }

    @Override
    public void first() {
        this.position = 0;
    }

    @Override
    public String next() {
        return this.papers[position++];
    }

    @Override
    public String currentItem() {
        return papers[position];
    }

    @Override
    public boolean hasNext() {
        return (position < papers.length);
    }
}
