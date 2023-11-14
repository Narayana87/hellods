### Stream In Java

Atream API is used to process collections of objects.

A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired results.

A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.

Stream does not change the original data structure, they only provide the results as per the pipelined methods.

#### Functional programming
#### Code Reduce
#### Bulk Operation

Filter - For conditional check

forEach - For iteration

##### Creating Empty Stream
The `empty()` method should be used in case of the creation of an empty stream:

```
Stream<String> stream = Stream.empty();
stream.forEach(System.out::println);

It's often the case that the `empty()` method is used upon creation to avoid returning null for streams with no element:

public Stream<String> streamOf(List<String> list){
    return list ==null || list.isEmpty() ? Stream.empty : list.stream();
}

```

##### Creating Stream from Collections
```
Collection<String> collection = Arrays.asList("Java","Jee","Spring", "Springboot","Hibernate");
Stream<String> CourserStream  = collection.stream();
CourserStream.forEach(System.out::println);
```
```
 List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);
```
```agsl
Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);
```
