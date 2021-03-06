package com.sasi.competitiveProgramming;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {
		List<Integer> duplicateElements = new LinkedList<>();
		duplicateElements.add(6);
		duplicateElements.add(2);
		duplicateElements.add(1);
		duplicateElements.add(1);
		duplicateElements.add(5);
		duplicateElements.add(2);

		System.out.println(duplicateElements);

		// using linkedhashset and passsing the collection

		LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>(duplicateElements);

		System.out.println("LinkedHashset" + " " + uniqueElements);

		// using Stream removing the duplicates
		List<Integer> uniqueList = duplicateElements.stream().distinct().collect(Collectors.toList());
		System.out.println("streamUniqueList" + " " + uniqueList);

	}

}
