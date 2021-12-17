import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * state global variables
   *  
   * */ 
 // public float circleY = 500;
  //public float circleX = 600;
   float circleY = 0;
  float circleX = 0;
  float twoCircleX = 0;
  float twoCircleY = 0;
  double r = 245;
  double g = 166;
  double b = 126;
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(600, 900);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
   
    background( (float)r, (float) g, (float) b);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // clear out old frames
    background( (float) r, (float) g, (float) b);
    
      circleY = (float) ((0.0048 * (Math.pow(circleX, 2)) -2.4 * circleX + 600)) ;
    circleX++;
    fill(244, 241, 134);
    stroke(255, 254, 120);
    ellipse(circleX, circleY, 50, 50);

    twoCircleY = (float) ((0.0048 * (Math.pow(twoCircleX, 2)) -2.4 * twoCircleX + 600)) ;
    fill(210);
    stroke(25);
    ellipse(twoCircleX, twoCircleY, 50, 50);

    fill(104, 187, 89);
    stroke(104, 187, 89);
    rect(0, 510, 600, 600);

   
    if(circleX >= 500){
      twoCircleX++;
      fill(255);
      stroke(255);
      ellipse(65, 100, 1, 1);
      ellipse(100, 150, 1, 1);
      ellipse(300, 210, 1, 1);
      ellipse(420, 69, 1, 1);
    }
    
    if(circleX >0 && circleX <601){
      r = r - 0.438;
      g = g - 0.216;
      b = b - 0.092;
    }
    if(twoCircleX>600){
      fill(26, 58, 80);
      stroke(26, 58, 80);
      ellipse(65, 100, 1, 1);
      ellipse(100, 150, 1, 1);
      ellipse(300, 210, 1, 1);
      ellipse(420, 69, 1, 1);
    }
  }
}
  // define other methods down here.


