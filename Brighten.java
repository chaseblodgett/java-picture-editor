// Author: Chase Blodgett

public class Brighten extends Transformation{

  private int amount;

// Constructor to set the amount user wants to brighten picture by
  public Brighten(int amount){
    this.amount = amount;
  }

/* Brightens each color of the pixel by the amount entered by user
*/
  public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image){
    int newBlue, newGreen, newRed;
    newBlue = originalColor.getBlue() + amount;
    newRed = originalColor.getRed() + amount;
    newGreen = originalColor.getGreen() + amount;

    if (newBlue > 255){
      newBlue = 255;
    }else if(newBlue < 0){
      newBlue = 0;
    }
    if(newRed > 255){
      newRed = 255;
    }else if(newRed < 0){
      newRed = 0;
    }
    if(newGreen > 255){
      newGreen = 255;
    }else if(newGreen < 0){
      newGreen = 0;
    }
    return new RGBColor(newRed,newGreen,newBlue);
  }
}
