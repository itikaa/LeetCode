class Solution {
    public double angleClock(int hour, int minutes) {
        double hhand=(hour%12)*30 + (0.5)*minutes;
             int minhand=minutes*6;
        double diff= Math.abs(hhand-minhand);
      return Math.min(diff,360-diff);
    }
}