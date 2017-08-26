import java.time.*;
public class CompareLoopTimes3
{
   public static void main(String[] args)
   {
      long startTime, endTime, nanoSeconds, seconds;
      final int REPEAT = 100_000;
      final int FACTOR = 1_000_000;
      LocalDateTime now;
      now = LocalDateTime.now();
      seconds = now.getSecond();
      nanoSeconds = now.getNano();
      startTime = nanoSeconds + (seconds * 1000000000);
      for(int x = 0; x <= REPEAT; ++x)
         for(int y = 0; y <= REPEAT; ++y);
      now = LocalDateTime.now();
      seconds = now.getSecond();
      nanoSeconds = now.getNano();
      endTime = nanoSeconds + (seconds * 1000000000);
      System.out.println("Time for loops starting from 0: " +
         ((endTime - startTime) / FACTOR) + " milliseconds");
      now = LocalDateTime.now();
      seconds = now.getSecond();
      nanoSeconds = now.getNano();
      startTime = nanoSeconds + (seconds * 1000000000);
      for(int x = REPEAT; x >= 0; --x)
         for(int y = REPEAT; y >= 0; --y);
      now = LocalDateTime.now();
      seconds = now.getSecond();
      nanoSeconds = now.getNano();
      endTime = nanoSeconds + (seconds * 1000000000);
      System.out.println("Time for loops ending with 0: " +
         ((endTime - startTime) / FACTOR) + " milliseconds");
   }
}
