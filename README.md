# Sprint 4
Except abstract factory pattern in previous sprint , there are totally new patterns implemented

### Builder Pattern
Shape class implement builder pattern so other class are able to create shape through build pattern.

### Comand Design Pattern
The command pattern encapsulates in an object all the data required for performing a given action (command), including what method to call, the method’s arguments, and the object to which the method belongs

The command pattern is used in the application to store all the information required for executing the actions on the canvas. Undo and Redo is also implemented as a part of the command pattern

### Strategy Pattern

The strategy pattern, particularly useful for checking conditions and yielding appropriate behavior at
run-time, is applied twice in my project.
I use the strategy pattern in creating the shape objects. The ShapeFactory constructShape method
which accepts the shape specifications, checks the ShapeType reflected in the specifications, and
instantiates/returns an abstract Drawable object of the respective actual type. This logic is confined to
the ShapeFactory constructShape method instead of the ShapeCreate command object to avoid tight
coupling.

### Template Method Pattern

The template method pattern is used to draw the shape objects by using inheritance. The Drawable
draw method checks the local ShapeShadingType variable, and draws the object by calling the local
draw implementation according to the ShapeShadingType and referencing local variables and default
method implements within the parent class. By using dynamic dispatch, the draw method will call the
necessary concrete draw implementation.

### Builder Pattern

The builder pattern is used by the ShapeGroup and ShapeUngroup classes to build (and de-build)
shapes incrementally as shapes are added. It is the most suitable pattern to manage the ShapeComposite
shape groups because it allows us to iterate through a selection and either group the selected elements,
or disband the selected composite(s) and return children to the Master list.