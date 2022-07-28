package forest;

import java.util.HashMap;

public class Tree {

  private int height;
  private int foodReserves;
  private int[] positionInForest;
  private String species;
  private HashMap<String,Integer> photosynthesisRate = new HashMap<String, Integer>();

  public Tree(String species, int posX, int posY) {
    this.species = species;
    this.positionInForest = new int[2];
    this.positionInForest[0] = posX;
    this.positionInForest[1] = posY;
    System.out.printf("I am a born %s tree\n", species);
}

  public void grow() {
      if (this.foodReserves > 10) {
          this.foodReserves = 0; // After growing, the excess of nutrients is lost
          this.height++;
      }
  }

  public void photosynthesise(String specie) {
      this.foodReserves++;
  }

  public Boolean isMature() {
    if (height > 20) {
      System.out.printf("I am a healthy %s tree\n", species);
      return true;
    }
    return false;
  }

  // Getters and Setters ommited (explained in lesson 5 Encapsulation)
}