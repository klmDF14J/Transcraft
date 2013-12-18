package org.zaet.api;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ZaetRegisterEvent {
	public enum RegisterType {
		BLOCKS, ERROR, ITEMS;
	}

	/***
	 * Use this to determine if it is blocks or items being registered
	 */
	private RegisterType eventType = RegisterType.ERROR;

	/***
	 * Names of blocks or items
	 */
	private String[] names;

	/***
	 * Blocks or Items Array.
	 */
	private Object[] blocksOrItems;

	/***
	 * 
	 * @param names
	 *            Name array
	 * @param items
	 *            Item Array
	 * 
	 *            The item register
	 */
	public ZaetRegisterEvent(String[] names, Item[] items) {
		eventType = RegisterType.ITEMS;
	}

	/***
	 * 
	 * @param names
	 *            Name Array
	 * @param blocks
	 *            Block Array
	 * 
	 *            The Block Register
	 * 
	 */
	public ZaetRegisterEvent(String[] names, Block[] blocks) {
		eventType = RegisterType.BLOCKS;
	}
}
