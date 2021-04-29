package Concurrency.FileSearch;

public class Result {
    private String path;
    private boolean found;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    @Override
    public String toString() {
        return "Result{" +
                "path='" + path + '\'' +
                ", found=" + found +
                '}';
    }
}
