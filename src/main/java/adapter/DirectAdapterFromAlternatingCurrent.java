package adapter;

public class DirectAdapterFromAlternatingCurrent implements DirectCurrent {
    AlternatingCurrent alternatingCurrent = new AlternatingCurrent();

    @Override
    public void makeACurrent() {
        alternatingCurrent.makeAlternatingCurrent();
    }
}
