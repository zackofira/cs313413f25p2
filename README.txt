TestIterator.java questions:
    Also try with a LinkedList - does it make any difference?
        No, It made no difference and all tests still passed without modification
    What happens if you use list.remove(Integer.valueOf(77))?
        The test fail, which means all the 77s are now not being removed correctly
TestList.java questions:
    Also try with a LinkedList - does it make any difference?
        Again, no difference is made and all tests pass without modification
    What does this method do?
        It removes the item in the list with index 5, which is the 6th item in the list, a 77.
    What does this one do?
        It removes the first item in the list with a value of 5.

TestPerformance.java questions and tasks:
    run test and record running times for SIZE = 10, 100, 1000, 10000, ... (REPS) = 1000000
        SIZE = 10:      300ms
        SIZE = 100:     320ms
        SIZE = 1000:    665ms
        SIZE = 10000:   4433ms
        SIZE = 100000:  58814ms

    What conclusions can you draw about the performance of LinkedList vs. ArrayList when
    comparing their running times for AddRemove vs. Access? Record those running times in README.txt!

        ArrayList       AddRemove   Access      LinkedList      AddRemove   Access
        SIZE = 10:      243ms       12ms        SIZE = 10:      21ms        14ms
        SIZE = 100:     247ms       13ms        SIZE = 100:     21ms        22ms
        SIZE = 1000:    352ms       15ms        SIZE = 1000:    20ms        259ms
        SIZE = 10000:   1240ms      13ms        SIZE = 10000:   22ms        3262ms
        SIZE = 100000:  14099ms     18ms        SIZE = 100000:  48ms        49660ms
                                                SIZE = 1000000: 221ms

    It seems that ArrayList are much better at accessing, whereas LinkedList is much better at
    adding and removing