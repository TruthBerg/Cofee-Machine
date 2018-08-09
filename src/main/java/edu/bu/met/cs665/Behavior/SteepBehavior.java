/**
 * The interface represents the behavior of steeping tea
 * @author emmettgreenberg
 */

package edu.bu.met.cs665.Behavior;

public interface SteepBehavior {
	
	/**
	 * the steeping procedure for tea
	 * @param waterTemp
	 * @param steepTime
	 */
	public abstract void steep(int waterTemp, int steepTime);
}
