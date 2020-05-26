package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

//import java.awt.*;
import java.io.IOException;
import javafx.scene.shape.Rectangle;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.css.Rect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public class Controller {

    //instance variables. All the FXML objects are here
    @FXML public GridPane seatingChart;
    @FXML public Rectangle zz;
    @FXML public Rectangle zo;
    @FXML public Rectangle zt;
    @FXML public Rectangle zth;
    @FXML public Rectangle zf;
    @FXML public Rectangle oz;
    @FXML public Rectangle oo;
    @FXML public Rectangle ot;
    @FXML public Rectangle oth;
    @FXML public Rectangle of;
    @FXML public Rectangle tz;
    @FXML public Rectangle to;
    @FXML public Rectangle tt;
    @FXML public Rectangle tth;
    @FXML public Rectangle tf;
    @FXML public Rectangle thz;
    @FXML public Rectangle tho;
    @FXML public Rectangle tht;
    @FXML public Rectangle thth;
    @FXML public Rectangle thf;
    @FXML public Rectangle fz;
    @FXML public Rectangle fo;
    @FXML public Rectangle ft;
    @FXML public Rectangle fth;
    @FXML public Rectangle ff;
    @FXML public TextField studNames;
    @FXML public Text textzz;
    @FXML public Text textzo;
    @FXML public Text textzt;
    @FXML public Text textzth;
    @FXML public Text textzf;
    @FXML public Text textoz;
    @FXML public Text textoo;
    @FXML public Text textot;
    @FXML public Text textoth;
    @FXML public Text textof;
    @FXML public Text texttz;
    @FXML public Text textto;
    @FXML public Text texttt;
    @FXML public Text texttth;
    @FXML public Text texttf;
    @FXML public Text textthz;
    @FXML public Text texttho;
    @FXML public Text texttht;
    @FXML public Text textthth;
    @FXML public Text textthf;
    @FXML public Text textfz;
    @FXML public Text textfo;
    @FXML public Text textft;
    @FXML public Text textfth;
    @FXML public Text textff;

    @FXML public Text masterText;

    //non FXML instance variables
    int row,col,rowt,colt,in,ino = 0;
    Student[][] seats = new Student[5][5];
    //Text[][] text = new Text[5][5];
    ArrayList<Text> tlist = new ArrayList<Text>();
    ArrayList<Student> selected = new ArrayList<Student>();
    ArrayList<Student> preClass = new ArrayList<Student>();


    public Student temp = null;
    public Student tempTwo = null;
    public int clicks = 0;
    public int emptySeats = 0;

    public boolean nullified = false;



    //initializes the frames and the program
    public void initialize(){
        for(int c  =  0; c<5; c++){
            for(int r = 0; r<5; r++){
//                text[r][c] = new Text("empty");
//                seatingChart.add(text[r][c],r,c);
            }
        }
        tlist.add(textzz);
        tlist.add(textzo);
        tlist.add(textzt);
        tlist.add(textzth);
        tlist.add(textzf);
        tlist.add(textoz);
        tlist.add(textoo);
        tlist.add(textot);
        tlist.add(textoth);
        tlist.add(textof);
        tlist.add(texttz);
        tlist.add(textto);
        tlist.add(texttt);
        tlist.add(texttth);
        tlist.add(texttf);
        tlist.add(textthz);
        tlist.add(texttho);
        tlist.add(texttht);
        tlist.add(textthth);
        tlist.add(textthf);
        tlist.add(textfz);
        tlist.add(textfo);
        tlist.add(textft);
        tlist.add(textfth);
        tlist.add(textff);

        preClass.add(new Student("Jenny, Juarez", 0, 0,0));
        preClass.add(new Student("Jonah, Kandel", 0, 1,1));
        preClass.add(new Student("Sebastian, Paulis", 0, 2,2));
        preClass.add(new Student("Pipe, Cruz", 0, 3,3));
        preClass.add(new Student("Atlas, Baily", 0, 4,4));
        preClass.add(new Student("Jonathan, Perez", 1, 0,5));
        preClass.add(new Student("Jonathan, Fontanez", 1, 1,6));
        preClass.add(new Student("Alexis, Hartog", 1, 2,7));
        preClass.add(new Student("Trevor, Taplin", 1, 3,8));
        preClass.add(new Student("River, Ferrand", 1, 4,9));
        preClass.add(new Student("Kelton, Pickering", 2, 0,10));
        preClass.add(new Student("Calvin, Pell", 2, 1,11));
        preClass.add(new Student("Nicholas, Hartog", 2, 2,12));
        preClass.add(new Student("Hector, Escobedo", 2, 3,13));
        preClass.add(new Student("Ronald, Ben", 2, 4,14));
        preClass.add(new Student("Matthew, Perez", 3, 0,15));
        preClass.add(new Student("Emmanuel, Eman", 3, 1,16));
        preClass.add(new Student("Joel, Cruz", 3, 2,17));
        preClass.add(new Student("Rico, Rico", 3, 3,18));
        preClass.add(new Student("Oscar, Molina", 3, 4,19));
        preClass.add(new Student("Ethan, Dunnigan", 4, 0,20));
        preClass.add(new Student("Ariel, Otero", 4, 1,21));
        preClass.add(new Student("Guiliana, Petruz", 4, 2,22));
        preClass.add(new Student("Greg, Rodriguez", 4, 3,23));
        preClass.add(new Student("Nick, LINDER", 4, 4,24));


    }

    //checks if any of the images have been clicked and checks which one

    public void rectClicked(@NotNull MouseEvent mouseEvent){
        if (mouseEvent.getSource() == zz) {
            whenClicked(0,0,0, zz, textzz);
        }
        if (mouseEvent.getSource() == zo) {
            whenClicked(1,0,1,zo,textzo);
        }
        if (mouseEvent.getSource() == zt) {
            whenClicked(2,0,2,zt,textzt);
        }
        if (mouseEvent.getSource() == zth) {
            whenClicked(3,0,3,zth,textzth);
        }
        if (mouseEvent.getSource() == zf) {
            whenClicked(4,0,4,zf,textzf);
        }
        if (mouseEvent.getSource() == oz) {
            whenClicked(5,1,0,oz,textoz);
        }
        if (mouseEvent.getSource() == oo) {
            whenClicked(6,1,1,oo,textoo);
        }
        if (mouseEvent.getSource() == ot) {
            whenClicked(7,1,2,ot,textot);
        }
        if (mouseEvent.getSource() == oth) {
            whenClicked(8,1,3,oth,textoth);
        }
        if (mouseEvent.getSource() == of) {
            whenClicked(9,1,4,of,textof);
        }
        if (mouseEvent.getSource() == tz) {
            whenClicked(10,2,0,  tz,texttz);
        }
        if (mouseEvent.getSource() == to) {
            whenClicked(11,2,1,to,textto);
        }
        if (mouseEvent.getSource() == tt) {
            whenClicked(12,2,2,tt,texttt);
        }
        if (mouseEvent.getSource() == tth) {
            whenClicked(13,2,3,tth,texttth);
        }
        if (mouseEvent.getSource() == tf) {
            whenClicked(14,2,4,tf,texttf);
        }
        if (mouseEvent.getSource() == thz) {
            whenClicked(15,3,0,thz,textthz);
        }
        if (mouseEvent.getSource() == tho) {
            whenClicked(16,3,1,tho,texttho);
        }
        if (mouseEvent.getSource() == tht) {
            whenClicked(17,3,2,tht,texttht);
        }
        if (mouseEvent.getSource() == thth) {
            whenClicked(18,3,3,thth,textthth);
        }
        if (mouseEvent.getSource() == thf) {
            whenClicked(19,3,4,thf,textthf);
        }
        if (mouseEvent.getSource() == fz) {
            whenClicked(20,4,0,fz,textfz);
        }
        if (mouseEvent.getSource() == fo) {
            whenClicked(21,4,1,fo,textfo);
        }
        if (mouseEvent.getSource() == ft) {
            whenClicked(22,4,2,ft,textft);
        }
        if (mouseEvent.getSource() == fth) {
            whenClicked(23,4,3,fth,textfth);
        }
        if (mouseEvent.getSource() == ff) {
            whenClicked(24,4,4,ff,textff);
        }
    }

    //depending on which seat is clicked, along with seat availanlity, a certain task will occur
    private void whenClicked(int i, int c, int r, @NotNull Rectangle re, Text te) {
        clicks++;
        re.setFill(Color.YELLOW);
        selected.add(seats[c][r]);
        if(seats[c][r]== null){
            nullified = true;
            System.out.println("null");
        }
        if(seats[c][r]!= null){
            System.out.println(seats[c][r].getName());
        }
        if (clicks == 1) {
            temp = seats[c][r];
            col = c;
            row = r;
            in = i;
            System.out.print(c);
            System.out.println(r);
        }
        if(clicks == 2){
            tempTwo = seats[c][r];
            colt = c;
            rowt = r;
            ino = i;
            System.out.print(c);
            System.out.println(r);
        }
    }

    // reanables all images to be intereacted with, also resets the color
    public void enable(){
        emptySeats = 0;
        zz.setDisable(false);
        zo.setDisable(false);
        zt.setDisable(false);
        zth.setDisable(false);
        zf.setDisable(false);
        oz.setDisable(false);
        oo.setDisable(false);
        ot.setDisable(false);
        oth.setDisable(false);
        of.setDisable(false);
        tz.setDisable(false);
        to.setDisable(false);
        tt.setDisable(false);
        tth.setDisable(false);
        tf.setDisable(false);
        thz.setDisable(false);
        tho.setDisable(false);
        tht.setDisable(false);
        thth.setDisable(false);
        thf.setDisable(false);
        fz.setDisable(false);
        fo.setDisable(false);
        ft.setDisable(false);
        fth.setDisable(false);
        ff.setDisable(false);

        zz.setFill(Color.rgb(92,60,33));
        zo.setFill(Color.rgb(92,60,33));
        zt.setFill(Color.rgb(92,60,33));
        zth.setFill(Color.rgb(92,60,33));
        zf.setFill(Color.rgb(92,60,33));
        oz.setFill(Color.rgb(92,60,33));
        oo.setFill(Color.rgb(92,60,33));
        ot.setFill(Color.rgb(92,60,33));
        oth.setFill(Color.rgb(92,60,33));
        of.setFill(Color.rgb(92,60,33));
        tz.setFill(Color.rgb(92,60,33));
        to.setFill(Color.rgb(92,60,33));
        tt.setFill(Color.rgb(92,60,33));
        tth.setFill(Color.rgb(92,60,33));
        tf.setFill(Color.rgb(92,60,33));
        thz.setFill(Color.rgb(92,60,33));
        tho.setFill(Color.rgb(92,60,33));
        tht.setFill(Color.rgb(92,60,33));
        thth.setFill(Color.rgb(92,60,33));
        thf.setFill(Color.rgb(92,60,33));
        fz.setFill(Color.rgb(92,60,33));
        fo.setFill(Color.rgb(92,60,33));
        ft.setFill(Color.rgb(92,60,33));
        fth.setFill(Color.rgb(92,60,33));
        ff.setFill(Color.rgb(92,60,33));

        clicks = 0;
        nullified = false;
        selected.clear();

        for(int co = 0; co < 5; co++){
            for(int ro = 0; ro<5; ro++){
                if(seats[co][ro] == null){
                    emptySeats++;
                }
            }
        }
        System.out.println(emptySeats);
    }


    //when a certain condition is met when a seat is clicked, this meathod will be called yo see if and where a student can be added
    public void add() {
        int cnt = 0;
        String names = studNames.getText();
       // System.out.println(emptySeats);
        System.out.println(clicks);
        if(clicks> 1){
            masterText.setText("You can only select one seat to add to");
            clicks = 0;
            nullified = false;
            enable();
        }
        else{
            for (int c = 0; c < seats[0].length; c++) {
                for (int r = 0; r < seats.length; r++) {
                    if (clicks == 1) {
                        if (c == col && r == row) {
                            if(names.contains(",")){
                                masterText.setText("When selecting a desk, you may only add one student");
                            }
                            if (seats[col][row] == null) {
                                seats[c][r] = new Student(studNames.getText(), c, r, cnt);
                                studNames.clear();
                                update(c, r, cnt);
                                masterText.setText("Welcome new student!");
                                enable();
                                return;
                            } else {
                                masterText.setText("This seat is taken");
                                clicks = 0;
                                enable();
                                return;
                            }
                        }
                    }
                    else if(clicks == 0){
                        enable();
                        if (seats[c][r] == null && clicks == 0 && !names.equals("")) {
//                    students[r][c].set_studentName("Testing fixme");
                            if (names.contains(",")) {
                                seats[c][r] = new Student(names.substring(0, names.indexOf(",") + 1), c, r, cnt);
                                names = names.substring(names.indexOf(",") + 2);
                                update(c, r, cnt);
                                masterText.setText("Welcome new student!");
                                System.out.println(names);
                            } else {
                                System.out.println(names);
                                seats[c][r] = new Student(names, c, r, cnt);
                                studNames.setText("");
                                update(c, r, cnt);
                                masterText.setText("Welcome new student!");
                                return;
                            }
                        }
                        else if(emptySeats == 0 && names.length()>2 && clicks == 0){
                            masterText.setText("Not enough seats for all of them");
                            studNames.setText("");
                            return;
                        }
                    }
                     else if(clicks> 1) {
                        masterText.setText("You can only select one seat to add to");
                        clicks = 0;
                        enable();
                        nullified = false;
                    }
                    cnt++;
                }
            }
            selected.clear();

        }

    }

    //updates the seat arrangements
    public void update(int c, int r, int cont){
       // System.out.println(seats[c][r].getName());
        if(seats[c][r] == null){
            tlist.get(cont).setFill(Color.rgb(29,255,0));
            tlist.get(cont).setText("Empty");
        }
        else{
            tlist.get(cont).setFill(Color.DARKBLUE);
            tlist.get(cont).setText(seats[c][r].getName().substring(0,seats[c][r].getName().indexOf(" ") +2));
        }
    }

    //based on which is clicked, will remove that object from seat
    public void removeStud(MouseEvent event) { //fixme ake list if selected
        if(clicks == 0){
            masterText.setText("You need to select at least one student to remove");
        }
        else if(clicks > 1 && !nullified){
            for(int i = 0; i < selected.size(); i++){
                seats[selected.get(i).getCol()][selected.get(i).getRow()] = null;
                update(selected.get(i).getCol(),selected.get(i).getRow(),selected.get(i).getIndex());
            }
            masterText.setText("And poof, they were gone");
        }
        else if(nullified){
            masterText.setText("Why are you trying to remove no one");
            nullified = false;
        }
        else{
            System.out.println("remove");
            seats[temp.getCol()][temp.getRow()] = null;
            update(temp.getCol(),temp.getRow(), temp.getIndex());
            setMasterText("rem");

        }
        selected.clear();
        enable();
//        temp = null;
//        tempTwo = null;
    }

    //when button is clicked, this method will initialize preset class
    public void setClass(MouseEvent event) {
        int cnt = 0;
        for(int c = 0; c<5; c++){
            for(int r = 0; r<5; r++){
                seats[c][r] = preClass.get(cnt);
                update(c,r,cnt);
                cnt++;
            }
        }
        enable();

    }
    //when exit button is clicked exit
    public void exit(MouseEvent event) {
        System.exit(0);
    }

    //when clicked, swaps two syidemts seats
    public void swap(MouseEvent event) {
        if(clicks != 2){
            masterText.setText("You must select two students");
            System.out.println("You must select two students");
            enable();
        }
        else if(temp == null || tempTwo == null){
            masterText.setText("You can only swap with seats with students");
        }
        else{
            int cO = temp.getCol();
            int rO = temp.getRow();
            int in = temp.getIndex();

            seats[temp.getCol()][temp.getRow()] = tempTwo;
            seats[tempTwo.getCol()][tempTwo.getRow()] = temp;

            temp.setCol(tempTwo.getCol());
            temp.setRow(tempTwo.getRow());
            temp.setIndex(tempTwo.getIndex());
            tempTwo.setCol(cO);
            tempTwo.setRow(rO);
            tempTwo.setIndex(in);
            enable();

            update(temp.getCol(),temp.getRow(),temp.getIndex());
            update(cO,rO,in);
            setMasterText("swap");

        }
//        temp = null;
//        tempTwo = null;
        selected.clear();
        enable();
    }

    //Basically a to String method to broadcast player actions and student names

    public void setMasterText(String str){
        if(str.equals("swap")){
            masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " had to switch seats with " +
                    tempTwo.getName().substring(0, tempTwo.getName().indexOf(" ") + 2));
        }
        if(str.equals("rem")){
            if(temp.getName().equals("Jenny, Juarez")){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " didn't give Nicholas top program so she removed herself");
                return;
            }
            else if(temp.getName().equals("Alexis, Hartog")){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " [REDACTED] so she was remoced");
                return;
            }
            else if(temp.getName().equals("Jonathan, Fontanez")){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " didn't give Nicholas top program so he removed herself");
                return;
            }
            else if(temp.getName().equals("Joel, Cruz")){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " didn't return the USBs so he was kicked");
                return;
            }
            else if(temp.getName().equals("Kelton, Pickering")){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " wasn't using the imperial system and we don't want an enemy of the state");
                return;
            }
            else if(temp.getName().equals("River, Ferrand")){
                masterText.setText("Its River, what did you expect");
                return;
            }
            else if(temp.getName().equals("Rico, Rico")){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " took out too many sheets of paper and we don't want to kill the trees");
                return;
            }
            else if(temp.getName().equals("Trevor, Taplin")){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " was too smart for this class so they sent him to NASA");
                return;
            }
            else if(temp.getName().equals("Nick, Linder")){
                masterText.setText("LINDERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
                return;
            }
            else if(temp.getName().equals("Nicholas, Hartog")){
                masterText.setText("How dare you remove the creator of this project. You should be ashamed");
                return;
            }
            int rand = (int)(Math.random()*4);
            if(rand == 0){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " did some unholy things and had to go");
            }else if(rand == 1){
                masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " couldn't wait until after class to let their rage out, so out they went");
            }else if(rand == 2){
            masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " thought that the ruler could be used as a weapon...");
            }else if(rand == 3){
            masterText.setText(temp.getName().substring(0, (temp.getName().indexOf(" ") + 2)) + " decided it would be better if they burned the teacher's desk");
            }

        }
    }


    //if button pressed and students seats selected, move them
    public void move(MouseEvent event) {
        if(clicks!=2 && (temp != null || tempTwo != null)){
            masterText.setText("You can only select one student and an empty seat");
            enable();
        }
        else if(temp != null && tempTwo!= null){
            masterText.setText("You must select an empty seat");
            enable();
        }
        if(temp == null){

            seats[col][row] = tempTwo;
            seats[colt][rowt] = null;

            tempTwo.setCol(col);
            tempTwo.setRow(row);
            tempTwo.setIndex(in);
            enable();
            update(col,row,in);
            update(colt,rowt,ino);
            masterText.setText(tempTwo.getName() + " was moved to a new seat");

        }
        else if(tempTwo == null){

            seats[colt][rowt] = temp;
            seats[col][row] = null;

            temp.setCol(colt);
            temp.setRow(rowt);
            temp.setIndex(ino);
            enable();
            update(col,row,in);
            update(colt,rowt,ino);
            masterText.setText(temp.getName() + " was moved to a new seat");

        }

    }


    //if how to button is pressed, bring up window with intruction on what to do
    public void howTo(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Instructions");
        alert.setHeaderText("How To Use Seating Chart");
        alert.setContentText("Welcome to a seating chart program. Not that complicated but we will get to it\n" +
                "ADDING STUDENTS: When adding students, make sure you follow the following format:\n" +
                "First Last. For example: Nicholas Hartog\n" +
                "If you wnat to add multiple students, do the following: \n" +
                "Firs Last, First Last, First Last (notice the spacebar after the comma) Makes sure the last name added does not end in a comma. Example:\n" +
                "Nicholas Hartog, Pipe Cruz, Jonah Kandel\n" +
                "REMOVING STUDENTS: When removing students, click as many students as you want to be removed.\n" +
                "Selecting empty seats won't do anything because common sense. Removing students also\n" +
                "gives a special message. For some specific names, there are specific messages\n." +
                "MOVING STUDENTS: Select a student and an empty seat and click move. That student\n" +
                "will move to that empty seat\n" +
                "SWAPPING STUDENTS: Select two seats with students and then click swap. They will have their seats swapped\n" +
                "PRE SET CLASS: Fills all the seats with students. Will overwrite current seating\n" +
                "CLEAR SEATS: Removes all students from the class" );
        ButtonType buttonTypeOne = new ButtonType("I understand");
        alert.getButtonTypes().setAll(buttonTypeOne);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne) {
            // ... user chose "One"
            System.out.println("kept playing");
        }
    }

    //button clears all seats
    public void clearClass(MouseEvent event) {
        int cnt = 0;
        for(int c = 0; c<5;c++){
            for(int r = 0; r<5; r++){
                seats[c][r] = null;
                update(c,r,cnt);
                cnt++;
            }
        }
    }

    //if a selected seat is reclicked, deselect it
    public void deselect(MouseEvent event) {
        enable();
    }
}
