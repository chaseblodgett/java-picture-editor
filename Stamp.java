// Author: Chase Blodgett

public class Stamp extends Transformation{

  private RGBImage toStamp;

// Constructor to take in an image to stamp on the new image
  public Stamp(RGBImage toStamp){
    this.toStamp = toStamp;
  }

/* Stamps a transparent image in the top left corner of an image
* Doesn't change the color of a pixel if pixel is not in top left corner
*/
  public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image){
    int avgRed = 0;
    int avgGreen = 0;
    int avgBlue = 0;
    if(x < toStamp.getWidth() && y < toStamp.getHeight() && y >= 0 && x >= 0){
      avgRed = (toStamp.getColor(x,y).getRed() + originalColor.getRed()) / 2;
      avgBlue = (toStamp.getColor(x,y).getBlue() + originalColor.getBlue()) / 2;
      avgGreen = (toStamp.getColor(x,y).getGreen() + originalColor.getGreen()) / 2;
      return new RGBColor(avgRed,avgGreen,avgBlue);
    }else{
      return originalColor;
    }
  }

}
