# JavaEvolve
This project covers some of the changes (not all) from Java 7 to Java 11

# Java 7
Type Inference for Generic Instance Creation - Diamond Operator \
Strings in switch Statements \
Catching Multiple Exception Types \
The try-with-resources Statement \
Underscores in Numeric Literals \
Integral types (byte, short, int, and long) can also be expressed using the binary number system \

# Java 8
Functional Interfaces and Lambda expressions \
Default and Static methods – multiple inheritance \
Stream API \
For each \
Optional \
StringJoiner \
Java Time API – new java.time package \
Method References\
  - Reference to a Static Method - ContainingClass::methodName \
  - Reference to an Instance Method - containingInstance::methodName \
  - Reference to an Instance Method of an Object of a Particular Type - ContainingType::methodName \
  - Reference to a Constructor - ClassName::new \
  
# Java 9
Factory Methods for Collections \
Optional Class Enhancements \
  - ifPresent(Consumer action): If there is a value present, perform the action using the value. \
  - ifPresentOrElse(Consumer action, Runnable emptyAction) \
Stream API Enhancements\
  - takeWhile(Predicate) will abort the stream on the first occurrence of an item which does not satisfy the condition \
  - dropWhile(Predicate) \
  - ofNullable(T t) returns a stream of zero or one elements, depending on whether the value passed is null \
  - iterate() JDK 9 adds an overloaded method that takes three parameters \
Interface Private Method – used to split default method \
JShell Command Line Tool –jshell - convenient for testing small code snippets \
Modular system (To be covered seperately) \
New HTTP Client \

# Java 10
Local variable Type Inference - var \
Changes related to unmodifiable collections- \
  - List.copyOf() \
  - Collectors.toUnmodifiableList() \
Optional.orElseThrow() \
Performance improvements \

# Java 11
Running java file without compiling – java ABC.java \
String methods \
  - strip() \
  - lines() \
  - isBlank() \
  - repeat(int) \
Local variable inference for Lambda \
  - This was possible in Java 8 too but got removed in Java 10. Now it’s back in Java 11 to keep things uniform. \
  - Why do you need it ? For applying Annotations \



