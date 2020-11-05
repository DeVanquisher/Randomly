
package utils;

import java.util.Random;

public class RandomGenerator {
    public int generateRandom(int length){
        int size = length;
        Random random = new Random();
        int num = random.nextInt(size);
        return num;
    }
}