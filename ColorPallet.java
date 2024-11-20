// Author: Chase Blodgett

public class ColorPallet extends Transformation{

  private RGBColor [] colors;

// Constructor sets takes in an array of colors to be used in transfoming picture
  public ColorPallet(RGBColor [] colors){
    this.colors = colors;
  }

// Returns a new pixel with the color that is most similar to one in the color pallet
  public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image){
    RGBColor closestColor = null;
    for(int i = 0; i < colors.length;i++){
      if(i == 0){
        closestColor = colors[i];
      }else if(RGBColor.distance(originalColor,colors[i]) < RGBColor.distance(closestColor,originalColor)){
        closestColor = colors[i];
      }
    }
    return closestColor;
  }
}
