package control;

import bean.CharacterSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class GenerateControl {
	
	private CharacterSet CharacterSet = new CharacterSet();
	
	@FXML
	private CheckBox alphabet;
	
	@FXML
	private CheckBox number;
	
	@FXML
	private CheckBox specialCharacter;
	
	@FXML
	private Slider alphabetSlider;
	
	@FXML
	private Slider numberSlider;
	
	@FXML
	private Slider specialCharacterSlider;
	
	@FXML
	private Label alphabetSliderLabel;
	
	@FXML
	private Label numberSliderLabel;
	
	@FXML
	private Label specialCharacterSliderLabel;
	
	@FXML
	public void initialize() {
		alphabetSliderLabel.textProperty().bind(alphabetSlider.valueProperty().asString("%.0f%%"));
		numberSliderLabel.textProperty().bind(numberSlider.valueProperty().asString("%.0f%%"));
		specialCharacterSliderLabel.textProperty().bind(specialCharacterSlider.valueProperty().asString("%.0f%%"));
	}
	
	
	
	@FXML
    private void onChecked(ActionEvent event) {
		
		CheckBox cb = (CheckBox) event.getSource();
		
		switch (cb.getId()){
		
		
		}


    }



}