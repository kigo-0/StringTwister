package control;

import bean.CharacterSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class GenerateControl {
	
	private CharacterSet CharacterSet = new CharacterSet();
	
	@FXML
	private CheckBox alphabet;
	
	@FXML
	private CheckBox number;
	
	@FXML
	private CheckBox specialCharacters;
	
	@FXML
    private void onChecked(ActionEvent event) {
		
		CheckBox cb = (CheckBox) event.getSource();
		
		switch (cb.getId()){
		
		
		}


    }



}