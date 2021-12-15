import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * state global variables
   *  
   * */ 
  public float circleY = 0;
  public float circleX = 0;

	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(600, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // clear out old frames
    background(32);

    // draw current frame based on state
    ellipse(circleX, circleY, 50, 50);
  
    // modify state
    circleY = (float) (Math.pow(-circleX/200, 2) + 3 * circleX/10 + 300);
    circleX = circleX + 1;
    
    // reset state
    //if(circleY == 1) {
    //  circleY = 500;
    //}
    //if (circleX > width + 50){
    //  circleX = 600;
    
   // }
    }
  }
  
  // define other methods down here.


