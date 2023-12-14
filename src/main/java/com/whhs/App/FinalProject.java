package com.whhs.App;

import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.effect.*;
import javafx.scene.input.*;
import javafx.animation.*;
import javafx.event.*;

import javafx.util.Duration;
import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.atomic.*;

import java.util.Arrays;
import java.util.List;

import java.util.Timer;
import java.util.TimerTask;

import javafx.geometry.Pos;

import javafx.scene.control.Button;

public class FinalProject {
	 public static Image overlayImage;
	 public static ImageView overlayImageView;
	 public static Image deathImage;
	 public static ImageView deathImageView;
	 public static Image foregroundImage;
	 public static ImageView foregroundImageView;
	 public static Image groundImage;
	 public static ImageView groundImageView;
	 public static Image backgroundImage;
	 public static ImageView backgroundImageView;
	 public static Image settingsImage;
	 public static Image backImage;
	 public static ImageView backImageView;
	 public static ImageView settingsImageView;
	 public static Image tempImage;
	 public static ImageView tempImageView;
	 public static Image aImage;
	 public static ImageView aImageView;
	 public static Image bImage;
	 public static ImageView bImageView;
	 public static Image cImage;
	 public static ImageView cImageView;
	 public static Text text;
	 public static Text score;
	 public static Text hscore;

	 public int pointCount = 0;

	 public int rangePos1 = 395 - 385 + 1;
	 public int randomPos1 = (int)(Math.random() * rangePos1) + 385;
	 public int rangePos2 = 540 - 0 + 1;
	 public int randomPos2 = (int)(Math.random() * rangePos2) + 0;

	 public int milirange = 2500 - 1500 + 1;
	 public int milirandom = (int)(Math.random() * milirange) + 1500;

	 public int startPosition = 190;

	 public int posI = 392;
	 public int posJ = 390;
	 public int posK = 388;

	 public int posL = 430;
	 public int posM = 350;

	 public int posN = 1500;
	 public int posO = 2500;

	 public int rangeIndex1 = 5 - 0 + 1;
	 public int randomIndex1 = (int)(Math.random() * rangeIndex1) + 0;
	 public int rangeIndex2 = 2 - 0 + 1;
	 public int randomIndex2 = (int)(Math.random() * rangeIndex2) + 0;

	 //public int[] finalPos = {randomPos1, posI, posJ, posK, posL, posM};
	 //public int[] randomDuration = {milirandom, posN, posO};

	 public static Button button1;
	 public static Button button2;
	 public static Button button3;

	 public Animation animation;

	 public FinalProject(double xPosition, double yPosition) {

		  int rangePos1 = 395 - 385 + 1;
		  int randomPos1 = (int)(Math.random() * rangePos1) + 385;

		  int posI = 392;
		  int posJ = 390;
		  int posK = 388;

		  int posL = 430;
		  int posM = 350;

		  overlayImage = new Image(getClass().getResource("util/Images/Overlay.png").toString());
		  overlayImageView = new ImageView(overlayImage);
		  deathImage = new Image(getClass().getResource("util/Images/Death.gif").toString());
		  deathImageView = new ImageView(deathImage);
		  foregroundImage = new Image(getClass().getResource("util/Images/Foreground.gif").toString());
		  foregroundImageView = new ImageView(foregroundImage);
		  groundImage = new Image(getClass().getResource("util/Images/Ground.gif").toString());
		  groundImageView = new ImageView(groundImage);
		  backgroundImage = new Image(getClass().getResource("util/Images/Background.png").toString());
		  backgroundImageView = new ImageView(backgroundImage);
		  settingsImage = new Image(getClass().getResource("util/Images/Settings.png").toString());
		  settingsImageView = new ImageView(settingsImage);
		  backImage = new Image(getClass().getResource("util/Images/Back.png").toString());
		  backImageView = new ImageView(backImage);
		  tempImage = new Image(getClass().getResource("util/Images/Interface.png").toString());
		  tempImageView = new ImageView(tempImage);
		  aImage = new Image(getClass().getResource("util/Images/obstacle1.png").toString());
		  aImageView = new ImageView(aImage);
		  bImage = new Image(getClass().getResource("util/Images/obstacle2.png").toString());
		  bImageView = new ImageView(bImage);
		  cImage = new Image(getClass().getResource("util/Images/obstacle3.png").toString());
		  cImageView = new ImageView(cImage);

		  overlayImageView.setLayoutX(xPosition);
		  overlayImageView.setLayoutY(yPosition);
		  overlayImageView.setPreserveRatio(true);
		  overlayImageView.setFitWidth(600);

		  deathImageView.setLayoutX(xPosition);
		  deathImageView.setLayoutY(yPosition);
		  deathImageView.setPreserveRatio(true);
		  deathImageView.setFitWidth(600);

		  foregroundImageView.setLayoutX(xPosition);
		  foregroundImageView.setLayoutY(yPosition);
		  foregroundImageView.setPreserveRatio(true);
		  foregroundImageView.setFitWidth(600);

		  groundImageView.setLayoutX(xPosition);
		  groundImageView.setLayoutY(yPosition);
		  groundImageView.setPreserveRatio(true);
		  groundImageView.setFitWidth(600);

		  backgroundImageView.setLayoutX(xPosition);
		  backgroundImageView.setLayoutY(yPosition);
		  backgroundImageView.setPreserveRatio(true);
		  backgroundImageView.setFitWidth(600);

		  settingsImageView.setLayoutX(532.5);
		  settingsImageView.setLayoutY(7.5);
		  settingsImageView.setPreserveRatio(true);
		  settingsImageView.setFitWidth(60);

		  backImageView.setLayoutX(532.5);
		  backImageView.setLayoutY(7.5);
		  backImageView.setPreserveRatio(true);
		  backImageView.setFitWidth(60);

		  tempImageView.setLayoutX(xPosition);
		  tempImageView.setLayoutY(190);
		  tempImageView.setPreserveRatio(true);
		  tempImageView.setFitWidth(60);

		  ArrayList<Integer> finalPos = new ArrayList<>();
		  finalPos.add(randomPos1);
		  finalPos.add(posI);
		  finalPos.add(posJ);
		  finalPos.add(posK);
		  finalPos.add(posL);
		  finalPos.add(posM);

		  int milirange = 2500 - 1500 + 1;
		  int milirandom = (int)(Math.random() * milirange) + 1500;

		  int posN = 1500;
		  int posO = 2500;

		  ArrayList<Integer> randomDuration = new ArrayList<>();
		  randomDuration.add(milirandom);
		  randomDuration.add(posN);
		  randomDuration.add(posO);

		  int rangeIndex1 = 5 - 0 + 1;
		  int randomIndex1 = (int)(Math.random() * rangeIndex1) + 0;
		  int rangeIndex2 = 2 - 0 + 1;
		  int randomIndex2 = (int)(Math.random() * rangeIndex2) + 0;

		  aImageView.setLayoutX(0);
		  aImageView.setLayoutY(finalPos.get(randomIndex1));
		  aImageView.setPreserveRatio(true);
		  aImageView.setFitWidth(60);

		  int rangePos2 = 540 - 0 + 1;
		  int randomPos2 = (int)(Math.random() * rangePos2) + 0;

		  bImageView.setLayoutX(randomPos2);
		  bImageView.setLayoutY(0);
		  bImageView.setPreserveRatio(true);
		  bImageView.setFitWidth(60);

		  cImageView.setLayoutX(xPosition);
		  cImageView.setLayoutY(yPosition);
		  cImageView.setPreserveRatio(true);
		  cImageView.setFitWidth(60);

		  Reflection reflection = new Reflection();
		  reflection.setFraction(0.7);

		  tempImageView.setEffect(reflection);
		  aImageView.setEffect(reflection);
		  bImageView.setEffect(reflection);
		  cImageView.setEffect(reflection);

		  final String content = "Title Text";
		  text = new Text(200, 100, content);
		  text.setFont(Font.loadFont("file:util/Fonts/Bold/font-bold.otf", 50));
		  text.setFill(Color.rgb(250, 25, 25));
		  text.setStrokeWidth(2.5);
		  text.setStroke(Color.rgb(35, 0, 0));

		  score = new Text(7.5, 25, "Score: " + pointCount);
		  score.setFont(Font.loadFont("file:util/Fonts/Bold/font-bold.otf", 25));
		  score.setFill(Color.rgb(220, 220, 220));
		  score.setStrokeWidth(1.5);
		  score.setStroke(Color.rgb(35, 0, 0));

		  hscore = new Text(7.5, 25, "High Score: ");
		  hscore.setFont(Font.loadFont("file:util/Fonts/Bold/font-bold.otf", 25));
		  hscore.setFill(Color.rgb(220, 220, 220));
		  hscore.setStrokeWidth(1.5);
		  hscore.setStroke(Color.rgb(50, 20, 0));

		  Bloom bloom = new Bloom();
		  bloom.setThreshold(0.1);

		  DropShadow dropShadow = new DropShadow();
		  dropShadow.setRadius(5.0);
		  dropShadow.setOffsetX(3.0);
		  dropShadow.setOffsetY(3.0);
		  dropShadow.setColor(Color.rgb(35, 35, 35));

		  text.setEffect(bloom);
		  text.setEffect(dropShadow);
		  score.setEffect(dropShadow);
		  hscore.setEffect(dropShadow);

			animation = new Transition() {
				 {
					  setCycleDuration(Duration.millis(randomDuration.get(randomIndex2)));
				 }

				 protected void interpolate(double frac) {
					  final int length = content.length();
					  final int n = Math.round(length * (float) frac);
					  text.setText(content.substring(0, n));
				 }
			};

			button1 = new Button("Start");
			button2 = new Button("Exit");
			button3 = new Button("Quick Restart");

			button1.setLayoutX(240);
			button1.setLayoutY(180);
			button1.setMinWidth(120);
			button1.setMinHeight(60);

			button2.setLayoutX(240);
			button2.setLayoutY(280);
			button2.setMinWidth(120);
			button2.setMinHeight(60);

			button3.setLayoutX(215);
			button3.setLayoutY(230);
			button3.setMinWidth(120);
			button3.setMinHeight(60);

			//set style to Main.java
			//set font to Main.java

			update();  //updates pointCount

			overlayImageView.setVisible(false);
			overlayImageView.setOpacity(0.0);
			button1.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {
					System.out.println("Started");
					foregroundImageView.setVisible(false);
					pointCount = 0;
					overlayImageView.setVisible(true);
					button1.setVisible(false);
					button2.setVisible(false);
					animation.play();
				}
			});

			button2.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {
					System.out.println("TERMINATED");
					System.exit(0);
				}
			});

		  AtomicBoolean test = new AtomicBoolean(false);
		  tempImageView.setOnMousePressed((MouseEvent me) -> {
				  test.set(true);
		  });
		  tempImageView.setOnMouseEntered(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  System.out.println("XPos: " + tempImageView.getTranslateX());
				  System.out.println("YPos: " + tempImageView.getTranslateY());
			  }
		  });
		  button3.setVisible(false);
		  groundImageView.setVisible(false);
		  backImageView.setVisible(false);
		  hscore.setVisible(false);
		  foregroundImageView.setOnMousePressed(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  hscore.setVisible(true);
			  }
		  });
		  foregroundImageView.setOnMouseReleased(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  hscore.setVisible(false);
			  }
		  });
		  settingsImageView.setOnMousePressed(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  button1.setVisible(false);
				  button2.setVisible(false);
				  button3.setVisible(true);
				  groundImageView.setVisible(true);
				  backImageView.setVisible(true);
			  }
		  });
		  backImageView.setOnMousePressed(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  button1.setVisible(true);
				  button2.setVisible(true);
				  button3.setVisible(false);
				  groundImageView.setVisible(false);
				  backImageView.setVisible(false);
			  }
		  });
		  backgroundImageView.setOnMouseEntered(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  button1.setVisible(false);
				  button2.setVisible(false);
			  }
		  });
		  overlayImageView.setOnMouseMoved(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  button1.setVisible(false);
				  button2.setVisible(false);
			  }
		  });
		  if ((overlayImageView.isVisible()) || !(foregroundImageView.isVisible())) {
			  settingsImageView.setOnMouseEntered(new EventHandler<MouseEvent>() {
				  @Override
				  public void handle(MouseEvent event) {
					  button1.setVisible(false);
					  button2.setVisible(false);
				  }
			  });
			  settingsImageView.setOnMouseMoved(new EventHandler<MouseEvent>() {
				  @Override
				  public void handle(MouseEvent event) {
					  button1.setVisible(false);
					  button2.setVisible(false);
				  }
			  });
		  }
		  settingsImageView.setOnMouseEntered(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  settingsImageView.setEffect(new Glow(0.5));
			  }
		  });
		  backImageView.setOnMouseEntered(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  backImageView.setEffect(new Glow(0.5));
			  }
		  });
		  settingsImageView.setOnMouseExited(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  settingsImageView.setEffect(new Glow(0.0));
			  }
		  });
		  backImageView.setOnMouseExited(new EventHandler<MouseEvent>() {
			  @Override
			  public void handle(MouseEvent event) {
				  backImageView.setEffect(new Glow(0.0));
			  }
		  });
		  while (test.get() == true) {
			  System.out.println(tempImageView.getX()+"\n"+tempImageView.getY());
		  }
		  //System.out.println(randomPos1+"\n"+randomPos2);
		  System.out.println(aImageView.getLayoutY()+"\n"+bImageView.getLayoutX());
		  buttonFX();
		  App.root.getChildren().addAll(backgroundImageView, text, aImageView, bImageView, cImageView, tempImageView, score, foregroundImageView, overlayImageView, groundImageView, button1, button2, button3, hscore, settingsImageView, backImageView, deathImageView);
	 }

	 //from Campus, U9 Practice
	 public void buttonFX() {
		 List<ImageView> buttonSprites = Arrays.asList(settingsImageView, backImageView);
		 //for (bs : buttonSprites) {}
		 /*
		 buttonSprites.setOnMouseEntered(me -> {
			 buttonSprites.setEffect(new Glow(0.5));
		 });

		 buttonSprites.setOnMouseExited(me -> {
			 buttonSprites.setEffect(new Glow(0.0));
		 });
		 */
	 }

	 public void update() {
		  Timer timer = new Timer();
		  TimerTask task = new TimerTask() {
				public void run() {
					 if (pointCount < 10000) {
						  pointCount++;
						  score.setText("Score: " + pointCount);
					 } else {
						  timer.cancel();
					 }
				}
		  };
		  timer.scheduleAtFixedRate(task, 1000, 100);
	 }

	 public ImageView getDeathImageView() {
		  return deathImageView;
	 }
	 public ImageView getForegroundImageView() {
		  return foregroundImageView;
	 }
	 public ImageView getTempImageView() {
		  return tempImageView;
	 }
	 public ImageView getAImageView() {
		  return aImageView;
	 }
	 public ImageView getBImageView() {
		  return bImageView;
	 }
	 public ImageView getCImageView() {
		  return cImageView;
	 }
	 public Button getButton1() {
		  return button1;
	 }
	 public Button getButton2() {
		  return button2;
	 }
	 public Button getButton3() {
		  return button3;
	 }
	 public Animation getAnimation() {
		  return animation;
	 }
}