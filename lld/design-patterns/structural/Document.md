##  Structural Design pattern

Design pattern that guides how to orchtestrate classes.

Broadly I'd like classify into 2 types :
1) Class trying to increase/decreate/alter its functionality / capability : Decoarator, composit , flyweight, Bridget
2) Placed in between the interacting classes : Proxy, Facade, Adapter

### Decorator design pattern

Decorator design pattern is used for adding additional functionality to the current object.  
Alllows to modify the behaviour at run time without altering it's structure. 
This pattern is used where multiple behavrious needs to added to boject without creating large number of object.

Use case : Pizza, apply different coupons, java streams (IMPORTANT), Java file IO,  Middlewares, 

### Composite design pattern

Composite pattern is used when the objects form a tree like structure. 

Use case : Mathematical expressions,  Directory/ File System, Organisaiton Heirarchy

### Flyweight design pattern

This design pattern is used when we have large number of objects having many common fields & the the object itself is very memory intensive. This design pattern is mainly used to reduce to memory consumption.
Intrinsic variables : That are same and do not change.
Extrinsic variables : that changes: These are paased as function parameters

Use case : Robots having same image, but differnt position.

### Proxy design pattern

Proxy design pattern is used when we want to add some filtering/access check before allowing the client to call the method.

Use case : Spring boot beans have a proxy, cache proxy, role based proxy, authentication proxy etc.

### Facade design pattern

Facade design pattern is used when we do not want to expose the internal clases.
For eg: Having a car class, For the user to increase the speed, he should not be concerned with the management of the axel class, increaing the fuel injection, etc. Only the required method has to be exposed, and this is done by using facade design pattern.

### Adapter design pattern

Adapter design pattern is used to bridget he gap between two incompatible interfaces, without modifying their source code.

For eg: Printer interfaces, the latest computer do not understand the legacy printer.
Legacy printer has printDocument() function. Client understands only the print() function.
We write the LegacyPrinterAdapter that has the legacyprinter and implement this latest interface.

### Bridge design pattern

Bridge design pattern allows the developement of the functionalities and the the classes independently and use is-a relationship over has-a relationship for the functionality.

Eg : Breathing methods & Animal interface, By following this pattern, I can freely add more breathing methods without needing to have the Animal for it.


