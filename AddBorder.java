// Author: Chase Blodgett

public class AddBorder extends Transformation{

  private int width;
  private RGBColor borderColor;

// Constructor takes width and color of the border
  public AddBorder(int width,RGBColor borderColor){
    this.width = width;
    this.borderColor = borderColor;
  }

/* Adds a border to the picture with length of the width of the border
* and in the the color entered
*/
  public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image){
    if(image.getWidth() - width <= x||x < width || image.getHeight()- width <= y|| y < width){
      return borderColor;
    }else{
      return originalColor;
    }
  }
}
