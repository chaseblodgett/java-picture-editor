// Author: Chase Blodgett

public class Greyscale extends Transformation{

/* Returns the average color of each pixel.
* Gives the effects of a black and white photo
*/
  public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image){
    int average = (originalColor.getGreen()+originalColor.getBlue()+originalColor.getRed())/3;
    return new RGBColor(average,average,average);
  }

}
