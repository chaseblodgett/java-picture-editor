// Author: Chase Blodgett

public class TransformationUtils{


// Method to to multiple transformations of an image
// Applys each transformation one after the other
  public static void transformMany(Transformation [] transformations, String inptFile, String otptFile){
    RGBImage modifiedImage = RGBImageUtil.load(inptFile);
    for(int i = 0; i < transformations.length; i++){
      modifiedImage = transformations[i].transform(modifiedImage);
    }
    RGBImageUtil.saveImage(modifiedImage,otptFile);
  }
}
