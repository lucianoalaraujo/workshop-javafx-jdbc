module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens gui;
	exports gui to javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
