import processing.core.PApplet;
import processing.core.PImage; 

public class Sketch extends PApplet {

  PImage imgMeteor;

  // x and y coordinate for meteor
  float fltMeteorX = 0;
  float fltMeteorY = 0;

  // meteor speed variables
  float fltXSpeed = random (1, 5);
  float fltYSpeed = random (1, 5); 

  // define colours
  int black = color(0);
  int white = color(255);
  int magenta = color(255, 0, 255);

  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(0, 0, 0);

    // load meteor
    imgMeteor = loadImage("spaceMeteors_003.png");

    // resize meteor
    imgMeteor.resize(50, 50);
    //imgMeteor.resize(imgMeteor.width/4, imgMeteor.height/4);
    
    // load missile

    // resize missile

    // load rocket

    // resize rocket

  }

  public void draw() {
    //background(black); 

    // draw meteor and move
    image(imgMeteor, fltMeteorX, fltMeteorY); 

    fltMeteorX += fltXSpeed;
    fltMeteorY += fltYSpeed;

    if (fltMeteorX > width - imgMeteor.width || fltMeteorX < 0) {
      fltXSpeed *= -1; 
    } 

    if(fltMeteorY > height - imgMeteor.height || fltMeteorY < 0) {
      fltYSpeed *= -1; 
    }

    // draw missile and move


    // draw rocket and move

  }
}