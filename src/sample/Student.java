package sample;

public class Student {
    private String name;
    private int row, col, index;

    public Student(String name, int col, int row, int index){
        this.name = name;
        this.row =row;
        this.col = col;
        this.index = index;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() { return col; }

    public void setCol(int col) {
        this.col = col;
    }

    public int getIndex() { return index; }

    public void setIndex(int index) {
        this.index = index;
    }

    public String toString(){
        return name;
    }
}
