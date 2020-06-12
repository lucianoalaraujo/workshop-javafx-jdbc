module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens gui;
	exports gui to javafx.fxml;
	
	opens model.entities;
	exports model.entities to javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
