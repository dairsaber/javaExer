package com.yinxin.pocker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 排序之后的 斗地主案例
 */
public class Poker {
	public static void main(String[] args) {
		HashMap<Integer, String> poker = new HashMap<>();
		ArrayList<String> colors = new ArrayList<>();
		Collections.addAll(colors, "♥️", "♣️", "♠️", "♦️");
		ArrayList<String> numbers = new ArrayList<>();
		Collections.addAll(numbers, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
		ArrayList<Integer> pokerIndexList;
		ArrayList<Integer> player01 = new ArrayList<>();
		ArrayList<Integer> player02 = new ArrayList<>();
		ArrayList<Integer> player03 = new ArrayList<>();
		ArrayList<Integer> hand = new ArrayList<>();
		// 拼装牌
		int pokerIndex = 0;
		for (String number : numbers) {
			for (String color : colors) {
				poker.put(pokerIndex, color + number);
				pokerIndex++;
			}
		}
		// 添加两张大王'小王
		poker.put(poker.size(), "小王");
		poker.put(poker.size(), "大王");

		pokerIndexList = new ArrayList<>(poker.keySet());
		// 洗牌
		Collections.shuffle(pokerIndexList);
		// 发牌
		for (int i = 0; i < pokerIndexList.size(); i++) {
			int pokerKey = pokerIndexList.get(i);
			if (i >= 51) {
				hand.add(pokerKey);
			} else if (i % 3 == 0) {
				player01.add(pokerKey);
			} else if (i % 3 == 1) {
				player02.add(pokerKey);
			} else if (i % 3 == 2) {
				player03.add(pokerKey);
			}
		}
		// 对玩家的牌排序
		Collections.sort(player01);
		Collections.sort(player02);
		Collections.sort(player03);

		// 展示牌
		System.out.println("=====================");
		showPoker(poker, player01, "玩家1");
		showPoker(poker, player02, "玩家2");
		showPoker(poker, player03, "玩家3");
		showPoker(poker, hand, "底牌");

	}

	/**
	 * 展示排面
	 * @param poker    牌的hashMap
	 * @param player01 存储玩家牌的索引列表
	 * @param name     提示文字
	 */
	private static void showPoker(HashMap<Integer, String> poker, ArrayList<Integer> player01, String name) {
		System.out.println(name);
		ArrayList<String> showerList = new ArrayList<>();
		for (int index : player01) {
			showerList.add(poker.get(index));
		}
		System.out.println(showerList.toString());
	}
}
