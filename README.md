# Unexpected Behavior of removeIf with Custom Classes in Kotlin

This repository demonstrates an uncommon bug in Kotlin related to the `removeIf` function when used with custom classes.  The `removeIf` function works as expected with basic data structures like `MutableList`, `MutableSet`, and `MutableMap` containing primitive types. However, when used with a `MutableList` or other collection containing instances of a custom class, the behavior can be unexpected if not handled properly.

The core issue arises from the way `removeIf` handles object equality. For primitive types, equality is straightforward.  But for custom classes, it depends on how `equals()` and `hashCode()` are implemented. If these methods are not properly overridden, `removeIf` might not remove the intended elements.

This example shows the correct and incorrect ways to use removeIf and the solution to the problem.