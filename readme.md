## Concurrency vs Synchronous vs Asynchronous

**Concurrency** refers to the ability of a system to handle multiple tasks or requests simultaneously, even if they are not necessarily being executed at the exact same moment.
It is about making progress on multiple tasks, even if they are not completed at the same time.

**Synchronous operations** are blocking - they execute in a strict sequential order, one after the other.
The program waits for each operation to complete before moving on to the next one.
It's like a single person cooking a meal, where each step must be completed in a specific order before moving on to the next.

**Asynchronous operations**, on the other hand, are non-blocking.
They allow the program to continue executing other tasks while waiting for the asynchronous operation to complete.
The results are handled via callbacks, promises, or async/await syntax.
It's like having multiple cooks in a kitchen, where each can work on a different part of the meal simultaneously, rather than waiting for the previous step to finish.

## Real Life Analogy

Imagine you are planning a birthday party and need to send out invitations, buy decorations, and bake a cake.
Here's how concurrency, synchronous, and asynchronous operations would play out:

**Synchronized**: The chef (your program) prepares breakfast, then lunch, then dinner, one after the other, without starting a new meal until the current one is done.

**Asynchronized**: The chef (your program) boils eggs for breakfast, while they boil, he makes pancake batter, and while the pancakes cook, he chops vegetables for lunch.
The chef manages multiple tasks by not idly waiting and uses the waiting time to progress with other tasks.

**Concurrent**: Multiple chefs (your program's threads or processes) work simultaneously in the kitchen, with one chef making breakfast, another making lunch, and another making dinner, all at the same time.

