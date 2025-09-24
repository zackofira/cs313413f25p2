COMP 313/413 Project 2 Report Template

TestList.java and TestIterator.java

	TODO also try with a LinkedList - does it make any difference?

		No, It made no difference and all tests still passed without modification.

TestList.java

	testRemoveObject()

		list.remove(5); // what does this method do?

			It removes the item in the list with index 5, which is the 6th item in the list, a 77.

		list.remove(Integer.valueOf(5)); // what does this one do?

			It removes the first item in the list with a value of 5.

TestIterator.java

	testRemove()

		i.remove(); // what happens if you use list.remove(77)?

			The test fail, which means all the 77s are now not being removed correctly

TestPerformance.java

	State how many times the tests were executed for each SIZE (10, 100, 1000 and 10000) (REPS = 1000000
	to get the running time in milliseconds and how the test running times were recorded.

	SIZE 10
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  255  270  267  133  277  267 ... (fill these in in ms)
        testLinkedListAddRemove: 23   18   24   20   21   23 
		testArrayListAccess:     16   14   13   12   19   11
        testLinkedListAccess:    13   13   15   13   21   14

	SIZE 100
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  252  276  264  217  257  255  ... (fill these in in ms)
        testLinkedListAddRemove: 20   26   20   19   19   20
		testArrayListAccess:     14   13   17   17   12   13
        testLinkedListAccess:    28   25   24   22   22   26

	SIZE 1000
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  356  362  353  338  333  326   ... (fill these in in ms)
        testLinkedListAddRemove: 20   21   23   23   20   21
		testArrayListAccess:     17   16   14   16   12   18
        testLinkedListAccess:    265  259  277  270  267  284

	SIZE 10000
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  1370 1397 1106 1456 1399 1346  ... (fill these in in ms)
        testLinkedListAddRemove: 25   24   21   27   21   26
		testArrayListAccess:     15   22   15   12   16   13
        testLinkedListAccess:    3418 3346 3256 3217 3334 3393

	listAccess - which type of List is better to use, and why?

		ArrayLists is much better for accessing, most likely because instead of having to call .next() on repeat, you can just go to a specific item

	listAddRemove - which type of List is better to use, and why?

		LinkedLists are better because with a linked list you can just pop one element out of the list and then link the previous to the next nodes.  With the ArrayList, you have to shift every         item after the addition or the removal.
