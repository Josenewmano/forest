package forest;

import java.util.HashMap;

public class Tree {

  private int height;
  private int foodReserves;
  private int[] positionInForest;
  private String species;
  private Integer photosynthesisRate;
  private Boolean hasReportedMaturity;

  public Tree(String species, int[] pos) {
    this.species = species;
    this.positionInForest = new int[2];
    this.positionInForest[0] = pos[0];
    this.positionInForest[1] = pos[1];
    this.photosynthesisRate = 1;
    this.hasReportedMaturity = false;
    System.out.printf("I am a born %s tree\n", species);

    if (this.species == "Pine") {
      this.photosynthesisRate = 20;
    } else if (this.species == "Hemlock") {
      this.photosynthesisRate = 10;
    } 
  }

  public void grow() {
      if (this.foodReserves > 10) {
          this.foodReserves = 0; // After growing, the excess of nutrients is lost
          this.height++;
      }
  }

  public void photosynthesise() {
      // this.foodReserves++;
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
      System.out.printf("I am a healthy %s tree\n", species);
    }
  }

}