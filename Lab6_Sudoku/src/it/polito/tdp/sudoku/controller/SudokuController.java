package it.polito.tdp.sudoku.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.sudoku.model.SudokuGenerator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SudokuController {

	final static int levelEasy = 45;
	final static int levelAdvanced = 50;
	final static int levelExpert = 55;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl10;

    @FXML
    private Label lbl11;

    @FXML
    private Label lbl12;

    @FXML
    private Label lbl13;

    @FXML
    private Label lbl14;

    @FXML
    private Label lbl15;

    @FXML
    private Label lbl16;

    @FXML
    private Label lbl17;

    @FXML
    private Label lbl18;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl7;

    @FXML
    private Label lbl8;

    @FXML
    private Label lbl9;

    @FXML
    private Label lbl19;

    @FXML
    private Label lbl20;

    @FXML
    private Label lbl21;

    @FXML
    private Label lbl22;

    @FXML
    private Label lbl23;

    @FXML
    private Label lbl24;

    @FXML
    private Label lbl25;

    @FXML
    private Label lbl26;

    @FXML
    private Label lbl27;

    @FXML
    private Label lbl37;

    @FXML
    private Label lbl38;

    @FXML
    private Label lbl39;

    @FXML
    private Label lbl40;

    @FXML
    private Label lbl41;

    @FXML
    private Label lbl42;

    @FXML
    private Label lbl43;

    @FXML
    private Label lbl44;

    @FXML
    private Label lbl45;

    @FXML
    private Label lbl28;

    @FXML
    private Label lbl29;

    @FXML
    private Label lbl30;

    @FXML
    private Label lbl31;

    @FXML
    private Label lbl32;

    @FXML
    private Label lbl33;

    @FXML
    private Label lbl34;

    @FXML
    private Label lbl35;

    @FXML
    private Label lbl36;

    @FXML
    private Label lbl46;

    @FXML
    private Label lbl47;

    @FXML
    private Label lbl48;

    @FXML
    private Label lbl49;

    @FXML
    private Label lbl50;

    @FXML
    private Label lbl51;

    @FXML
    private Label lbl52;

    @FXML
    private Label lbl53;

    @FXML
    private Label lbl54;

    @FXML
    private Label lbl64;

    @FXML
    private Label lbl65;

    @FXML
    private Label lbl66;

    @FXML
    private Label lbl67;

    @FXML
    private Label lbl68;

    @FXML
    private Label lbl69;

    @FXML
    private Label lbl70;

    @FXML
    private Label lbl71;

    @FXML
    private Label lbl72;

    @FXML
    private Label lbl55;

    @FXML
    private Label lbl56;

    @FXML
    private Label lbl57;

    @FXML
    private Label lbl58;

    @FXML
    private Label lbl59;

    @FXML
    private Label lbl60;

    @FXML
    private Label lbl61;

    @FXML
    private Label lbl62;

    @FXML
    private Label lbl63;

    @FXML
    private Label lbl73;

    @FXML
    private Label lbl74;

    @FXML
    private Label lbl75;

    @FXML
    private Label lbl76;

    @FXML
    private Label lbl77;

    @FXML
    private Label lbl78;

    @FXML
    private Label lbl79;

    @FXML
    private Label lbl80;

    @FXML
    private Label lbl81;
    
    List<Label> labelList = new ArrayList<Label>(); 
    
    private SudokuGenerator sg = new SudokuGenerator();
    
    public void setModel(SudokuGenerator sg){
    	this.sg = sg;
    }
    
    @FXML
    void doGenerate(ActionEvent event){
    	// Per generare un nuova nuova griglia di Sudoku
		int [][] matrix = sg.nextBoard(levelExpert);		
		printMatrixOnScreen(matrix);
    }
    
    @FXML
    void doSolve(ActionEvent event){
    	printMatrixOnScreen(sg.solution());
    }
    
    @FXML
    void initialize() {
        assert lbl10 != null : "fx:id=\"lbl10\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl11 != null : "fx:id=\"lbl11\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl12 != null : "fx:id=\"lbl12\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl13 != null : "fx:id=\"lbl13\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl14 != null : "fx:id=\"lbl14\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl15 != null : "fx:id=\"lbl15\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl16 != null : "fx:id=\"lbl16\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl17 != null : "fx:id=\"lbl17\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl18 != null : "fx:id=\"lbl18\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl2 != null : "fx:id=\"lbl2\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl3 != null : "fx:id=\"lbl3\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl4 != null : "fx:id=\"lbl4\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl5 != null : "fx:id=\"lbl5\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl6 != null : "fx:id=\"lbl6\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl7 != null : "fx:id=\"lbl7\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl8 != null : "fx:id=\"lbl8\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl9 != null : "fx:id=\"lbl9\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl19 != null : "fx:id=\"lbl19\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl20 != null : "fx:id=\"lbl20\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl21 != null : "fx:id=\"lbl21\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl22 != null : "fx:id=\"lbl22\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl23 != null : "fx:id=\"lbl23\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl24 != null : "fx:id=\"lbl24\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl25 != null : "fx:id=\"lbl25\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl26 != null : "fx:id=\"lbl26\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl27 != null : "fx:id=\"lbl27\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl37 != null : "fx:id=\"lbl37\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl38 != null : "fx:id=\"lbl38\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl39 != null : "fx:id=\"lbl39\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl40 != null : "fx:id=\"lbl40\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl41 != null : "fx:id=\"lbl41\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl42 != null : "fx:id=\"lbl42\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl43 != null : "fx:id=\"lbl43\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl44 != null : "fx:id=\"lbl44\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl45 != null : "fx:id=\"lbl45\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl28 != null : "fx:id=\"lbl28\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl29 != null : "fx:id=\"lbl29\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl30 != null : "fx:id=\"lbl30\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl31 != null : "fx:id=\"lbl31\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl32 != null : "fx:id=\"lbl32\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl33 != null : "fx:id=\"lbl33\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl34 != null : "fx:id=\"lbl34\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl35 != null : "fx:id=\"lbl35\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl36 != null : "fx:id=\"lbl36\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl46 != null : "fx:id=\"lbl46\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl47 != null : "fx:id=\"lbl47\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl48 != null : "fx:id=\"lbl48\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl49 != null : "fx:id=\"lbl49\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl50 != null : "fx:id=\"lbl50\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl51 != null : "fx:id=\"lbl51\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl52 != null : "fx:id=\"lbl52\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl53 != null : "fx:id=\"lbl53\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl54 != null : "fx:id=\"lbl54\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl64 != null : "fx:id=\"lbl64\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl65 != null : "fx:id=\"lbl65\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl66 != null : "fx:id=\"lbl66\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl67 != null : "fx:id=\"lbl67\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl68 != null : "fx:id=\"lbl68\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl69 != null : "fx:id=\"lbl69\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl70 != null : "fx:id=\"lbl70\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl71 != null : "fx:id=\"lbl71\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl72 != null : "fx:id=\"lbl72\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl55 != null : "fx:id=\"lbl55\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl56 != null : "fx:id=\"lbl56\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl57 != null : "fx:id=\"lbl57\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl58 != null : "fx:id=\"lbl58\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl59 != null : "fx:id=\"lbl59\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl60 != null : "fx:id=\"lbl60\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl61 != null : "fx:id=\"lbl61\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl62 != null : "fx:id=\"lbl62\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl63 != null : "fx:id=\"lbl63\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl73 != null : "fx:id=\"lbl73\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl74 != null : "fx:id=\"lbl74\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl75 != null : "fx:id=\"lbl75\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl76 != null : "fx:id=\"lbl76\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl77 != null : "fx:id=\"lbl77\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl78 != null : "fx:id=\"lbl78\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl79 != null : "fx:id=\"lbl79\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl80 != null : "fx:id=\"lbl80\" was not injected: check your FXML file 'Sudoku.fxml'.";
        assert lbl81 != null : "fx:id=\"lbl81\" was not injected: check your FXML file 'Sudoku.fxml'.";
        
        labelList.add(lbl1);
        labelList.add(lbl2);
        labelList.add(lbl3);
        labelList.add(lbl4);
        labelList.add(lbl5);
        labelList.add(lbl6);
        labelList.add(lbl7);
        labelList.add(lbl8);
        labelList.add(lbl9);
        labelList.add(lbl10);
        labelList.add(lbl11);
        labelList.add(lbl12);
        labelList.add(lbl13);
        labelList.add(lbl14);
        labelList.add(lbl15);
        labelList.add(lbl16);
        labelList.add(lbl17);
        labelList.add(lbl18);
        labelList.add(lbl19);
        labelList.add(lbl20);
        labelList.add(lbl21);
        labelList.add(lbl22);
        labelList.add(lbl23);
        labelList.add(lbl24);
        labelList.add(lbl25);
        labelList.add(lbl26);
        labelList.add(lbl27);
        labelList.add(lbl28);
        labelList.add(lbl29);
        labelList.add(lbl30);
        labelList.add(lbl31);
        labelList.add(lbl32);
        labelList.add(lbl33);
        labelList.add(lbl34);
        labelList.add(lbl35);
        labelList.add(lbl36);
        labelList.add(lbl37);
        labelList.add(lbl38);
        labelList.add(lbl39);
        labelList.add(lbl40);
        labelList.add(lbl41);
        labelList.add(lbl42);
        labelList.add(lbl43);
        labelList.add(lbl44);
        labelList.add(lbl45);
        labelList.add(lbl46);
        labelList.add(lbl47);
        labelList.add(lbl48);
        labelList.add(lbl49);
        labelList.add(lbl50);
        labelList.add(lbl51);
        labelList.add(lbl52);
        labelList.add(lbl53);
        labelList.add(lbl54);
        labelList.add(lbl55);
        labelList.add(lbl56);
        labelList.add(lbl57);
        labelList.add(lbl58);
        labelList.add(lbl59);
        labelList.add(lbl60);
        labelList.add(lbl61);
        labelList.add(lbl62);
        labelList.add(lbl63);
        labelList.add(lbl64);
        labelList.add(lbl65);
        labelList.add(lbl66);
        labelList.add(lbl67);
        labelList.add(lbl68);
        labelList.add(lbl69);
        labelList.add(lbl70);
        labelList.add(lbl71);
        labelList.add(lbl72);
        labelList.add(lbl73);
        labelList.add(lbl74);
        labelList.add(lbl75);
        labelList.add(lbl76);
        labelList.add(lbl77);
        labelList.add(lbl78);
        labelList.add(lbl79);
        labelList.add(lbl80);
        labelList.add(lbl81);
    }
    
    
    void printMatrixOnScreen(int[][] matrix) {
    	int counter = 0;
    	for (int i = 0; i < 3; i++)
    		for (int j=0; j< 3; j++)
    			for(int h=0; h<3; h++)
    				for(int k=0; k<3; k++){
    					labelList.get(counter).setText(String.valueOf(matrix[h+(i*3)][k+(j*3)]));
    					counter++;
    				}
    }
    
}
