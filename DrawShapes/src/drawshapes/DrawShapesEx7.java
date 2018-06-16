/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshapes;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.util.Random;
import javafx.scene.paint.Color;


/**
 *
 * @author Joseph
 */
public class DrawShapesEx7 extends Application {
    
    private Canvas canvas = new Canvas(400, 400);
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.getChildren().add(canvas);
        TextField shape = new TextField("circle");
        Button b = new Button("Type"); 
        HBox panel2 = new HBox();
        panel2.getChildren().add(b);
        panel2.getChildren().add(shape);
        panel2.getChildren().add(panel2);
        b.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                drawShapes(shape.getText());
            }
        });
        
       
        
        
        
        
        
        
        
        Scene scene = new Scene(root);
        
        
        primaryStage.setTitle("Draw Shapes!");
        primaryStage.setScene(scene);
        primaryStage.show();
     }  
     public void drawShapes(String shapeType) {
         final int RADIUS = 20;
         Random rand = new Random();
         GraphicsContext gc = canvas.getGraphicsContext2D();
         //gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());
         if (shapeType.equals("square")) {
             int x = rand.nextInt(400);
             int y = rand.nextInt(400);
             gc.fillRect(x, y, RADIUS, RADIUS);
             gc.setFill(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
         } else if (shapeType.equals("circle")) {
             int x = rand.nextInt(400);
             int y = rand.nextInt(400);
             gc.fillOval(x, y, RADIUS, RADIUS);
             gc.setFill(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
             
         }
       }
       
       /**
        * @param args the command line arguments
        */
     public static void main(String[] args) {
         launch(args);
     }
  }