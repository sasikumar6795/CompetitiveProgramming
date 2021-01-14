package com.sasi.competitiveProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

	public static void main(String[] args) {
		int[] price = { 60, 120, 100 };
		int[] weight = { 10, 30, 20 };
		int k = 50;
		int n = 3;
		double knapsack = findMaxPriceLooted(price, weight, k);
		System.out.println(knapsack);

	}

	public static double findMaxPriceLooted(int[] price, int[] weight, int k) {

		ItemValue[] itemValue = new ItemValue[weight.length];

		for (int i = 0; i < itemValue.length; i++) {
			itemValue[i] = new ItemValue(price[i], weight[i], k);
		}

		Arrays.sort(itemValue, new Comparator<ItemValue>() {

			@Override
			public int compare(ItemValue arg0, ItemValue arg1) {
				System.out.println("first object"+arg1.cost+" "+"second object"+arg0.cost);
				 System.out.println(arg1.cost.compareTo(arg0.cost));
				 
				return arg1.cost.compareTo(arg0.cost);

			}

		});
		int currentWeight = 0;
		double finalValue = 0.0;
		for (int i = 0; i < itemValue.length; i++) {
			if (currentWeight + itemValue[i].weight <= k) {
				currentWeight += itemValue[i].weight;
				finalValue += itemValue[i].price;
			} else {
				int rem = k - currentWeight;
				/*finalValue += itemValue[i].price * (rem / itemValue[i].weight);*/
				finalValue += (itemValue[i].price/itemValue[i].weight)*rem;
			}
		}

		return finalValue;

	}

	static class ItemValue {
		Double cost;
		double price, weight, k;

		ItemValue(int price, int weight, int k) {
			this.price = price;
			this.weight = weight;
			this.k = k;
			cost = new Double((double) price / (double) weight);

		}

	}

}
