package com.whhs.App;

import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.ImageCursor;
import javafx.scene.text.Font;
import javafx.scene.input.*;
import javafx.animation.*;
import javafx.event.*;

import javafx.util.Duration;
import java.util.Random;

import javafx.geometry.Pos;

import javafx.scene.control.Button;

//import static com.almasb.fxgl.dsl.FXGL.*;
//import com.almasb.fxgl.dsl.components.*;
//import com.almasb.fxgl.ui.*;
//import com.almasb.fxgl.app.*;
//import com.almasb.fxgl.core.*;
//import com.almasb.fxgl.input.*;
//import com.almasb.fxgl.entity.*;
//import com.almasb.fxgl.physics.*;

public class App extends Application {
  public static Group root = new Group();

  //protected void initSettings(GameSettings settings) {
	 //settings.setProfilingEnabled(true);
	 //settings.setWidth(600);
	 //settings.setHeight(450);
	 //settings.setTitle("Final Project");
	 //settings.setVersion("0.0");
	 //String version = settings.getVersion();
  //}
  String version = "0.0";
  //protected PhysicsComponent physics;
  public enum EntityType {
	 PLAYER
  }
  //public Entity player;
  public Thread collisionThread1;
  public Thread collisionThread2;
  public Thread collisionThread3;
  public boolean collisionDetected1;
  public boolean collisionDetected2;
  public boolean collisionDetected3;
  public boolean restart;

  public boolean left = false;
  public boolean right = false;

  public int rangePosition = 1 - 0 + 1;
  public int randomPosition = (int)(Math.random() * rangePosition) + 0;

  public boolean test = false;

  public boolean quickstart = false;

  public AnimationTimer jump;

  public double range = 15.00 - 3.75 + 1;
  public double rand = (double)(Math.random() * range) + 3.75;
  public double rand1 = Assets.getRand1();
  public double rand2 = Assets.getRand2();

  public int gravity = 0;

  public ImageView deathImageView;
  public ImageView foregroundImageView;
  public ImageView tempImageView;
  public ImageView aImageView;
  public ImageView bImageView;
  public ImageView cImageView;

  public Button button1;
  public Button button2;
  public Button button3;

  public Animation animation;

  public void start(Stage primaryStage) {

	 FinalProject finalProject = new FinalProject(0, 0);
	 //Assets assets = new Assets(0, 0);

	 Scene scene = new Scene(root, 600, 450, Color.rgb(255, 255, 255));

	 deathImageView = finalProject.getDeathImageView();
	 deathImageView.setVisible(false);

	 foregroundImageView = finalProject.getForegroundImageView();
	 tempImageView = finalProject.getTempImageView();
	 aImageView = finalProject.getAImageView();
	 bImageView = finalProject.getBImageView();
	 cImageView = finalProject.getCImageView();

	 button1 = finalProject.getButton1();
	 button2 = finalProject.getButton2();
	 button3 = finalProject.getButton3();

	 animation = finalProject.getAnimation();

	 double rand1 = Assets.getRand1();
	 double rand2 = Assets.getRand2();

	 scene.getStylesheets().add("style.css");

	 button1.getStyleClass().add("my-button");
	 button1.setStyle("-fx-text-fill: black; -fx-font-size: 24; -fx-font-family: Fela;");
	 button1.setFont(new Font("Fela", 24));

	 button2.getStyleClass().add("my-button");
	 button2.setStyle("-fx-text-fill: black; -fx-font-size: 24; -fx-font-family: Fela;");
	 button2.setFont(new Font("Fela", 24));

	 button3.getStyleClass().add("my-button");
	 button3.setStyle("-fx-text-fill: black; -fx-font-size: 24; -fx-font-family: Fela;");
	 button3.setFont(new Font("Fela", 24));

	 System.out.println(rand);

	 Image cursorImage = new Image("file:system/fxgl/resources/fxgl_default_cursor.png");
	 scene.setCursor(new ImageCursor(cursorImage));
	 primaryStage.setTitle("Final Project " + version);
	 primaryStage.getIcons().add(new Image("file:system/fxgl/resources/fxgl_icon.png"));
	 primaryStage.setScene(scene);
	 primaryStage.show();

	 Timeline timeline1 = new Timeline(new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {
		 double deltaX = rand;

		 @Override
		 public void handle(ActionEvent event) {
			 aImageView.setTranslateX(aImageView.getTranslateX() + deltaX);
			 if (aImageView.getTranslateX() > scene.getWidth()) {
				 aImageView.setTranslateX(-aImageView.getBoundsInLocal().getWidth());
			 }
		 }
	 }));
	 timeline1.setCycleCount(Timeline.INDEFINITE);
	 timeline1.play();

	 Timeline timeline2 = new Timeline(new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {
		 double deltaY = rand;

		 @Override
		 public void handle(ActionEvent event) {
			 bImageView.setTranslateY(bImageView.getTranslateY() + deltaY);
			 if (bImageView.getTranslateY() > scene.getWidth()) {
				 bImageView.setTranslateY(-bImageView.getBoundsInLocal().getWidth());
			 }
		 }
	 }));
	 timeline2.setCycleCount(Timeline.INDEFINITE);
	 timeline2.play();

	 Timeline timeline3 = new Timeline(new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {
		 double deltaZ = rand;

	  	 @Override
		 public void handle(ActionEvent event) {
			 /*//begin method handle
			 int rangePosition = 1 - 0 + 1;
			 int randomPosition = (int)(Math.random() * rangePosition) + 0;
			 boolean test;
			 if (randomPosition == 0) {
				 test = true;
			 } else if (randomPosition == 1) {
				 test = false;
			 } else {
				 System.out.println("null");
			 } //Stop Here
			 *///end method handle
			 //if (test == true) {
				 cImageView.setTranslateX(cImageView.getTranslateX() + deltaZ);
				 cImageView.setTranslateY(cImageView.getTranslateY() + deltaZ);
				 if ((cImageView.getTranslateY() > scene.getWidth()) && (cImageView.getTranslateX() > scene.getWidth())) {
					 cImageView.setTranslateX(-cImageView.getBoundsInLocal().getWidth());
					 cImageView.setTranslateY(-cImageView.getBoundsInLocal().getWidth());
				 }
			 //}
		 }
	 }));

	 boolean test = false;

	 int rangePosition = 1 - 0 + 1;
	 int randomPosition = (int)(Math.random() * rangePosition) + 0;

	 if (randomPosition == 0) {
		 test = true;
	 } else if (randomPosition == 1) {
		 test = false;
	 } else {
		 System.out.println("null");
	 }

	 System.out.println(randomPosition);

	 if (test == true) {
		 timeline3.setCycleCount(Timeline.INDEFINITE);
		 timeline3.play();
	 }

	 primaryStage.getScene().setOnKeyPressed(ePress -> {
		KeyCode keycode = ePress.getCode();
		if (keycode.equals(keycode.D) || keycode.equals(keycode.RIGHT)) {
		  tempImageView.setTranslateX(tempImageView.getTranslateX() + 10);
		  right = true;
		}
		if (keycode.equals(keycode.A) || keycode.equals(keycode.LEFT)) {
		  tempImageView.setTranslateX(tempImageView.getTranslateX() - 10);
		  left = true;
		}
		if (keycode.equals(keycode.W) || keycode.equals(keycode.UP)) {
		  tempImageView.setTranslateY(tempImageView.getTranslateY() - 10);
		}
		if (keycode.equals(keycode.S) || keycode.equals(keycode.DOWN)) {
		  tempImageView.setTranslateY(tempImageView.getTranslateY() + 10);
		}
		if (keycode.equals(keycode.SPACE) && gravity == 0) {
		  double ypreviousPos = tempImageView.getTranslateY();
		  jump = new AnimationTimer() {
			 @Override
			 public void handle(long now) {
				tempImageView.setTranslateY(tempImageView.getTranslateY() - 10 + gravity);
				gravity = gravity + 1;
				if (ypreviousPos <= tempImageView.getTranslateY()) {
				  jump.stop();
				  gravity = 0;
				}
				if (right == true) {
				  tempImageView.setTranslateX(tempImageView.getTranslateX() + 10);
				  tempImageView.setTranslateY(tempImageView.getTranslateY() - 10 + gravity);
				  gravity = gravity + 1;
				  if (ypreviousPos <= tempImageView.getTranslateY()) {
					 jump.stop();
					 gravity = 0;
				  }
				}
				if (left == true) {
				  tempImageView.setTranslateX(tempImageView.getTranslateX() - 10);
				  tempImageView.setTranslateY(tempImageView.getTranslateY() - 10 + gravity);
				  gravity = gravity + 1;
				  if (ypreviousPos <= tempImageView.getTranslateY()) {
					 jump.stop();
					 gravity = 0;
				  }
				}
			 }
		  };
		  jump.start();
		}
	 });

	 System.out.println("QS ENABLED: " + quickstart);
	 button3.setOnAction(new EventHandler<ActionEvent>() {
		 @Override public void handle(ActionEvent e) {
			 quickstart = true;
			 if (quickstart == true) {
				 System.out.println("QS ENABLED: " + quickstart);
				 deathImageView.setOnMousePressed(me -> {
					 System.out.println("Started");
					 deathImageView.setVisible(false);
					 foregroundImageView.setVisible(false);
					 button1.setVisible(false);
					 button2.setVisible(false);
					 animation.play();
					 tempImageView.setTranslateX(0);
					 tempImageView.setTranslateY(0);
				 });
			 } else {
				 System.out.println("j");
				 /*
				 deathImageView.setOnMousePressed(me -> {
					 deathImageView.setVisible(false);
					 foregroundImageView.setVisible(true);
					 button1.setVisible(true);
					 button2.setVisible(true);
					 tempImageView.setTranslateX(0);
					 tempImageView.setTranslateY(0);
				 });
				 */
			 }
		 }
	 });

	 deathImageView.setOnMousePressed(me -> {
		 deathImageView.setVisible(false);
		 foregroundImageView.setVisible(true);
		 button1.setVisible(true);
		 button2.setVisible(true);
		 tempImageView.setTranslateX(0);
		 tempImageView.setTranslateY(0);
	 });

	 primaryStage.getScene().setOnKeyReleased(eRel -> {
		KeyCode keycode = eRel.getCode();
		if (keycode.equals(keycode.D) || keycode.equals(keycode.RIGHT)) {
		  right = false;
		}
		if (keycode.equals(keycode.A) || keycode.equals(keycode.LEFT)) {
		  left = false;
		}
	 });
	  checkCollisionThread1();
	  checkCollisionThread2();
	  checkCollisionThread3();
	  if (restart == true) {
		  primaryStage.close();
	  }
	  /*
	  try {
		  while (true) {
			  checkCollisionThread();
		  }
	  } catch (Exception e) {
		  System.out.println(e);
	  }
	  */
  }

  /*
  public void checkBounds(ImageView tempImageView, ImageView aImageView) {
	  collisionDetected = false;
	  if (tempImageView.getBoundsInParent().intersects(aImageView.getBoundsInParent())) {
		  collisionDetected = true;
		  System.out.println(collisionDetected+"\n"+"It worked yay");
	  } else {
		  collisionDetected = false;
	  }

	  if (collisionDetected == true) {
		  System.out.println("Collision extends yay");
	  } else {
	  }

  }
  *//*
  public void checkCollisionThread() {
	  collisionThread = new Thread() {
		  @Override
		  public void run() {
			  collisionDetected = false;
			  System.out.println("Collision test");
			  try {
			  while (collisionDetected == false) {
				  checkBounds(tempImageView, aImageView);
			  }
			  } catch (Exception e) {
				  System.out.println(e);
			  }
		  }
	  };
	  collisionThread.start();
  }
  */

  public void checkBounds1(ImageView tempImageView, ImageView aImageView) {
	  Platform.runLater(() -> {
		  boolean collisionDetected1 = tempImageView.getBoundsInParent().intersects(aImageView.getBoundsInParent());
		  if (collisionDetected1) {
			  deathImageView.setVisible(true);
			  System.out.println("Collision a detected");
			  if (deathImageView.isVisible()) {
				  restart = true;
			  }
		  }
	  });
  }

  public void checkBounds2(ImageView tempImageView, ImageView bImageView) {
	  Platform.runLater(() -> {
		  boolean collisionDetected2 = tempImageView.getBoundsInParent().intersects(bImageView.getBoundsInParent());
		  if (collisionDetected2) {
			  deathImageView.setVisible(true);
			  System.out.println("Collision b detected");
			  if (deathImageView.isVisible()) {
				  restart = true;
			  }
		  }
	  });
  }

  public void checkBounds3(ImageView tempImageView, ImageView cImageView) {
	  Platform.runLater(() -> {
		  boolean collisionDetected3 = tempImageView.getBoundsInParent().intersects(cImageView.getBoundsInParent());
		  if (collisionDetected3) {
			  deathImageView.setVisible(true);
			  System.out.println("Collision c detected");
			  if (deathImageView.isVisible()) {
				  restart = true;
			  }
		  }
	  });
  }

  public void checkCollisionThread1() {
	  Thread collisionThread1 = new Thread(() -> {
		  System.out.println("Collision test a");
		  while (true) {
			  checkBounds1(tempImageView, aImageView);
			  try {
				  Thread.sleep(100);
			  } catch (InterruptedException e) {
				  e.printStackTrace();
			  }
		  }
	  });
	  collisionThread1.start();
  }

  public void checkCollisionThread2() {
	  Thread collisionThread2 = new Thread(() -> {
		  System.out.println("Collision test b");
		  while (true) {
			  checkBounds2(tempImageView, bImageView);
			  try {
				  Thread.sleep(100);
			  } catch (InterruptedException e) {
				  e.printStackTrace();
			  }
		  }
	  });
	  collisionThread2.start();
  }

  public void checkCollisionThread3() {
	  Thread collisionThread3 = new Thread(() -> {
		  System.out.println("Collision test c");
		  while (true) {
			  checkBounds3(tempImageView, cImageView);
			  try {
				  Thread.sleep(100);
			  } catch (InterruptedException e) {
				  e.printStackTrace();
			  }
		  }
	  });
	  collisionThread3.start();
  }

  public static void main(String[] args) {
	 System.out.println("TEST");
	 launch(args);
  }
}