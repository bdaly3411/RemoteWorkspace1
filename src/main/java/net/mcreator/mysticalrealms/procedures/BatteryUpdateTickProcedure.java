package net.mcreator.mysticalrealms.procedures;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;

import java.util.Map;

@MysticalrealmsModElements.ModElement.Tag
public class BatteryUpdateTickProcedure extends MysticalrealmsModElements.ModElement {
	public BatteryUpdateTickProcedure(MysticalrealmsModElements instance) {
		super(instance, 162);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		double east = 0;
		double south = 0;
		double north = 0;
		double west = 0;
		double down = 0;
	}
}
