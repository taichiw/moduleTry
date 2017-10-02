package org.astro;
import multi.version.MultiVersion;

public class World {
	public static String name() {
		return "world" + MultiVersion.version();
	}
}
