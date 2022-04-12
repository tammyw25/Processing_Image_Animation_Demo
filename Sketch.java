import processing.core.PApplet;
import processing.core.PImage; //import the PImage library

public class Sketch extends PApplet {

  PImage imgMissile; // declare a global image variable
  // declare rocket

  float fltMissileX = width/2;
  float fltMissleY = 400;

  float fltCirX = width/2;
  float fltCirY = width/2;


  public void settings() {
    size(400, 400);
  
  }

  public void setup() {
    background(0);
    imgMissile = loadImage("spaceMissiles_006.png"); // load the image into the program
    // load rocket
    // resize rocket
  }

  public void draw() {

    // draw missile and move
    image(imgMissile,fltMissileX,fltMissleY);

    // draw circle and move

    // draw rocket and move



 
  }
}