package sample;

public class Student {

    // instance variables
    private String name;
    private int row, col, index;

    //pipe code
    private Pos p;


    //constructor, takes row and col of seat with index and name
    public Student(String name, int col, int row, int index){
        this.name = name;
        this.row =row;
        this.col = col;
        this.index = index;

        //pipe code
        p = new Pos(row,col);
    }


    //Getter methods
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

    @Override public String toString(){
        return name;
    }
    


    //Pos class for poition of student
    private class Pos{
        private int row,col;
        Pos(int row,int col){
            this.row=row;
            this.col=col;
        }
        int row(){return row;}
        int col(){return col;}
    }
}
