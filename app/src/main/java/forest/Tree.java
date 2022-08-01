package forest;

public class Tree {

  private int height;
  private int foodReserves;
  private int[] positionInForest;
  public String species;
  private Integer photosynthesisRate;
  private Boolean hasReportedMaturity;

  public Tree(String species, int[] pos) {
    this.species = species;
    this.positionInForest = new int[2];
    this.positionInForest[0] = pos[0];
    this.positionInForest[1] = pos[1];
    this.photosynthesisRate = 1;
    this.hasReportedMaturity = false;
    System.out.printf("I am a born %s tree\nThe x position is %d, and the y position is %d\n\n", species, isLocated()[0], isLocated()[1]);

    if (this.species == "Pine") {
      this.photosynthesisRate = 3;
    } else if (this.species == "Hemlock") {
      this.photosynthesisRate = 2;
    } 
  }

  public void grow() {
      if (this.foodReserves > 10) {
          this.foodReserves = 0;
          this.height++;
      }
  }

  public void photosynthesise() {
      this.foodReserves += this.photosynthesisRate;
  }

  public Boolean isMature() {
    if (height > 20) {
      reportMaturity();
      return true;
    }
    return false;
  }

  public int[] isLocated() {
    return this.positionInForest;
  }

  public int isHowTall() {
    return this.height;
  }

  private void reportMaturity(){
    if (this.hasReportedMaturity == false) {
      this.hasReportedMaturity = true;
      System.out.printf("I am a healthy %s tree\nThe x position is %d, and the y position is %d\n", species, isLocated()[0], isLocated()[1]);
    }
  }
}